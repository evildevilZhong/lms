package com.chung.lms.service;

import com.chung.lms.model.LibraryBookItem;

/**
 * 图书馆书籍藏本Service
 */
public interface LibraryBookItemService {

    /**
     * 通过书籍藏本条形码获取书籍藏本信息
     */
    LibraryBookItem getBookItemByBarCode(String barCode);

    /**
     * 通过书籍藏本id更新书籍藏本的信息
     */
    void updateByBookItemId(LibraryBookItem row);
}
