package com.chung.lms.mapper;

import com.chung.lms.model.LibraryCheckoutHistory;
import com.chung.lms.model.LibraryCheckoutHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibraryCheckoutHistoryMapper {
    long countByExample(LibraryCheckoutHistoryExample example);

    int deleteByExample(LibraryCheckoutHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LibraryCheckoutHistory row);

    int insertSelective(LibraryCheckoutHistory row);

    List<LibraryCheckoutHistory> selectByExample(LibraryCheckoutHistoryExample example);

    LibraryCheckoutHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") LibraryCheckoutHistory row, @Param("example") LibraryCheckoutHistoryExample example);

    int updateByExample(@Param("row") LibraryCheckoutHistory row, @Param("example") LibraryCheckoutHistoryExample example);

    int updateByPrimaryKeySelective(LibraryCheckoutHistory row);

    int updateByPrimaryKey(LibraryCheckoutHistory row);
}