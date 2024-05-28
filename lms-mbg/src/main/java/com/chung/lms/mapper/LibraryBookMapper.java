package com.chung.lms.mapper;

import com.chung.lms.model.LibraryBook;
import com.chung.lms.model.LibraryBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibraryBookMapper {
    long countByExample(LibraryBookExample example);

    int deleteByExample(LibraryBookExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LibraryBook row);

    int insertSelective(LibraryBook row);

    List<LibraryBook> selectByExample(LibraryBookExample example);

    LibraryBook selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") LibraryBook row, @Param("example") LibraryBookExample example);

    int updateByExample(@Param("row") LibraryBook row, @Param("example") LibraryBookExample example);

    int updateByPrimaryKeySelective(LibraryBook row);

    int updateByPrimaryKey(LibraryBook row);
}