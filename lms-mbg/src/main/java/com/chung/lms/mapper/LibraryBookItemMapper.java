package com.chung.lms.mapper;

import com.chung.lms.model.LibraryBookItem;
import com.chung.lms.model.LibraryBookItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibraryBookItemMapper {
    long countByExample(LibraryBookItemExample example);

    int deleteByExample(LibraryBookItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LibraryBookItem row);

    int insertSelective(LibraryBookItem row);

    List<LibraryBookItem> selectByExample(LibraryBookItemExample example);

    LibraryBookItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") LibraryBookItem row, @Param("example") LibraryBookItemExample example);

    int updateByExample(@Param("row") LibraryBookItem row, @Param("example") LibraryBookItemExample example);

    int updateByPrimaryKeySelective(LibraryBookItem row);

    int updateByPrimaryKey(LibraryBookItem row);
}