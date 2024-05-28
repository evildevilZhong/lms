package com.chung.lms.service.impl.library;

import com.chung.lms.mapper.LibraryCheckoutHistoryMapper;
import com.chung.lms.model.LibraryCheckoutHistory;
import com.chung.lms.service.LibraryCheckoutHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 图书馆借阅流水历史Service实现类
 */
@Service
public class LibraryCheckoutHistoryServiceImpl implements LibraryCheckoutHistoryService {

    @Autowired
    LibraryCheckoutHistoryMapper checkoutHistoryMapper;

    @Override
    public void saveHistory(LibraryCheckoutHistory history) {
        checkoutHistoryMapper.insert(history);
    }
}
