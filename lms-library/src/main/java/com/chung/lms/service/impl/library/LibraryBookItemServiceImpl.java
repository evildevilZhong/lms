package com.chung.lms.service.impl.library;

import com.chung.lms.mapper.LibraryBookItemMapper;
import com.chung.lms.model.LibraryBookItem;
import com.chung.lms.model.LibraryBookItemExample;
import com.chung.lms.model.LibraryMember;
import com.chung.lms.service.LibraryBookItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 图书馆书籍藏本Service实现类
 */
@Service
public class LibraryBookItemServiceImpl implements LibraryBookItemService {

    @Autowired
    LibraryBookItemMapper bookItemMapper;

    @Override
    public LibraryBookItem getBookItemByBarCode(String barCode) {
        LibraryBookItemExample example = new LibraryBookItemExample();
        example.createCriteria().andBarcodeEqualTo(barCode);
        List<LibraryBookItem> bookItems = bookItemMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(bookItems)) {
            return null;
        }
        return bookItems.get(0);
    }

    @Override
    public void updateByBookItemId(LibraryBookItem row) {
        bookItemMapper.updateByPrimaryKey(row);
    }



}
