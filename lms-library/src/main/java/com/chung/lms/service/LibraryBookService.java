package com.chung.lms.service;

import com.chung.lms.common.api.CommonResult;
import com.chung.lms.model.LibraryBook;

/**
 * 图书馆收录书籍Service
 */
public interface LibraryBookService {

    /**
     * 录入新的书籍信息
     */
    void add(LibraryBook book);

    /**
     * 通过id更新书籍信息
     */
    void updateById(LibraryBook book);

    /**
     * 通过id删除书籍信息
     */
    void deleteById(Long id);
}
