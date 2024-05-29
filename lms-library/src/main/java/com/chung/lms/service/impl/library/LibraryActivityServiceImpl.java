package com.chung.lms.service.impl.library;

import cn.hutool.core.date.DateUtil;
import com.chung.lms.common.exception.CommonLmsException;
import com.chung.lms.constant.BookItemStatusEnum;
import com.chung.lms.constant.RoleEnum;
import com.chung.lms.model.*;
import com.chung.lms.service.*;
import io.netty.util.internal.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 图书馆核心活动Service实现类
 */
@Service
public class LibraryActivityServiceImpl implements LibraryActivityService {

    @Autowired
    private UmsAdminService adminService;
    @Autowired
    private LibraryMemberService libraryMemberService;
    @Autowired
    private LibraryBookItemService libraryBookItemService;
    @Autowired
    private LibraryCheckoutHistoryService checkoutHistoryService;

    @Override
    public void checkoutBook(String borrowerBarCode, String bookBarCode) {
        // 获取系统当前登录用户信息
        UmsAdmin user = adminService.getCurrentLoginUser();

        // 获取借阅书籍扫码操作时对应的会员信息
        LibraryMember borrowerMemberInfo = libraryMemberService.getMemberByBarCode(borrowerBarCode);
        if (borrowerMemberInfo == null) {
            throw new CommonLmsException("当前会员不存在");
        }
        Long borrowerUmsId = borrowerMemberInfo.getUmsId();
        if (!user.getId().equals(borrowerUmsId)) {
            // 对于登录用户不是扫码借阅人本人的情况, 需要判断其借阅权限
            List<UmsRole> roles = adminService.getRoleList(user.getId());
            boolean isLibrarian = roles.stream().anyMatch(role -> role.getName().equals(RoleEnum.LIBRARIAN.getCode()));
            if (!isLibrarian) {
                // 对于登录用户不是扫码借阅人本人的情况，只有登录用户是图书管理员才允许后续的借阅书籍操作
                throw new CommonLmsException("系统登录用户与借阅人不一致，且非图书管理员操作，不允许借阅操作");
            }
        }

        // 获取书籍藏本信息
        LibraryBookItem bookItem = libraryBookItemService.getByBarCode(bookBarCode);
        if (null == bookItem) {
            throw new CommonLmsException("该书籍还未录入系统，请联系图书管理员处理");
        }
        String bookStatus = bookItem.getStatus();
        if (BookItemStatusEnum.LOANED.getCode().equals(bookStatus)) {
            throw new CommonLmsException("此藏本处于借阅状态，无法执行借出操作");
        }
        if (BookItemStatusEnum.RESERVED.getCode().equals(bookStatus)) {
            throw new CommonLmsException("此藏本处于已预约状态，无法执行借出操作");
        }

        // 藏本状态可借出则执行借出操作
        bookItem.setBorrowedDate(new Date());
        bookItem.setDueDate(DateUtil.nextWeek()); // TODO: 借阅过期时间不应写死
        bookItem.setStatus(BookItemStatusEnum.LOANED.getCode());
        bookItem.setBorrowMemberId(borrowerMemberInfo.getUmsId());
        bookItem.setReservationDueDate(null);
        bookItem.setReservationMemberId(null);
        libraryBookItemService.updateById(bookItem);

        // 更新借阅会员已借阅书籍列表
        List<String> borrowsBooks = new ArrayList();
        borrowsBooks.add(bookItem.getId().toString());
        String borrowBooksOld = borrowerMemberInfo.getBooksOfCheckout();
        if (StringUtils.isEmpty(borrowBooksOld)) {
            String[] books = borrowBooksOld.split(",");
            borrowsBooks.addAll(Arrays.asList(books));
        }
        borrowerMemberInfo.setBooksOfCheckout(StringUtil.join(",", borrowsBooks).toString());
        libraryMemberService.updateMemberByMemberId(borrowerMemberInfo);

        // 插入借阅历史流水
        LibraryCheckoutHistory history = new LibraryCheckoutHistory();
        history.setBookItemId(bookItem.getId());
        history.setBorrowedDate(new Date());
        history.setBorrowMemberId(borrowerMemberInfo.getId());
        checkoutHistoryService.saveHistory(history);
    }




}
