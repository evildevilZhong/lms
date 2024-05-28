package com.chung.lms.service;

import com.chung.lms.mapper.LibraryCheckoutHistoryMapper;
import com.chung.lms.model.LibraryCheckoutHistory;
import com.chung.lms.model.LibraryMember;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 图书馆借阅流水历史Service
 */
public interface LibraryCheckoutHistoryService {

    /**
     * 保存借阅历史
     */
    void saveHistory(LibraryCheckoutHistory history);
}
