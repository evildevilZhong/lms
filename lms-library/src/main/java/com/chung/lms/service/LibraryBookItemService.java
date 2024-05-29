package com.chung.lms.service;

import com.chung.lms.model.LibraryBookItem;

import java.util.List;

/**
 * 图书馆书籍藏本Service
 */
public interface LibraryBookItemService {

    /**
     * 通过书籍藏本条形码获取书籍藏本信息
     */
    LibraryBookItem getByBarCode(String barCode);

    /**
     * 通过书籍id获取馆藏藏本列表
     */
    List<LibraryBookItem> getByBookId(Long bookId);

    /**
     * 新增书籍藏本
     */
    void add(LibraryBookItem bookItem);

    /**
     * 通过书籍藏本id更新书籍藏本的信息
     */
    void updateById(LibraryBookItem row);

    /**
     * 通过书籍藏本id删除书籍藏本信息
     */
    void deleteById(Long id);
}
