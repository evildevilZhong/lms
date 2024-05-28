package com.chung.lms.service;

/**
 * 图书馆核心活动Service
 */
public interface LibraryActivityService {

    /**
     * 借阅书籍
     */
    void checkoutBook(String borrowerBarCode, String bookBarCode);
}
