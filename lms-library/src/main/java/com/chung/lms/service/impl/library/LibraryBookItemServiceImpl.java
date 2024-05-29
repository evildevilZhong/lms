package com.chung.lms.service.impl.library;

import com.chung.lms.mapper.LibraryBookItemMapper;
import com.chung.lms.model.LibraryBookItem;
import com.chung.lms.model.LibraryBookItemExample;
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
    public LibraryBookItem getByBarCode(String barCode) {
        LibraryBookItemExample example = new LibraryBookItemExample();
        example.createCriteria().andBarcodeEqualTo(barCode);
        List<LibraryBookItem> bookItems = bookItemMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(bookItems)) {
            return null;
        }
        return bookItems.get(0);
    }

    @Override
    public List<LibraryBookItem> getByBookId(Long bookId) {
        LibraryBookItemExample example = new LibraryBookItemExample();
        example.createCriteria().andLibraryBookIdEqualTo(bookId);
        return bookItemMapper.selectByExample(example);
    }

    @Override
    public void add(LibraryBookItem bookItem) {
        // barcode作为书籍藏本的业务幂等键
        bookItemMapper.insert(bookItem);
    }
    @Override
    public void updateById(LibraryBookItem row) {
        bookItemMapper.updateByPrimaryKey(row);
    }

    @Override
    public void deleteById(Long id) {
        bookItemMapper.deleteByPrimaryKey(id);
    }
}
