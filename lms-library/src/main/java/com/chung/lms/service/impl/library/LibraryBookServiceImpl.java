package com.chung.lms.service.impl.library;

import com.chung.lms.common.exception.CommonLmsException;
import com.chung.lms.mapper.LibraryBookMapper;
import com.chung.lms.model.LibraryBook;
import com.chung.lms.model.LibraryBookItem;
import com.chung.lms.service.LibraryBookItemService;
import com.chung.lms.service.LibraryBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;


/**
 * 图书馆收录书籍Service实现类
 */
@Service
public class LibraryBookServiceImpl implements LibraryBookService {

    @Autowired
    LibraryBookMapper bookMapper;

    @Autowired
    LibraryBookItemService bookItemService;

    @Override
    public void add(LibraryBook book) {
        // ISBN作为书籍的业务幂等键
        bookMapper.insert(book);
    }

    @Override
    public void updateById(LibraryBook book) {
        bookMapper.updateByPrimaryKey(book);
    }

    // TODO: 实现逻辑删除
    @Override
    public void deleteById(Long id) {
        LibraryBook book = bookMapper.selectByPrimaryKey(id);
        if (null == book) {
            return;
        }

        List<LibraryBookItem> bookItemList = bookItemService.getByBookId(book.getId());
        if (!CollectionUtils.isEmpty(bookItemList)) {
            throw new CommonLmsException("该书籍关联有馆藏藏本，请确认删除关联的藏本信息后再删除该书籍信息");
        }
        bookMapper.deleteByPrimaryKey(id);
    }
}
