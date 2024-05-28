package com.chung.lms.mapper;

import com.chung.lms.model.LibraryAuthor;
import com.chung.lms.model.LibraryAuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibraryAuthorMapper {
    long countByExample(LibraryAuthorExample example);

    int deleteByExample(LibraryAuthorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LibraryAuthor row);

    int insertSelective(LibraryAuthor row);

    List<LibraryAuthor> selectByExample(LibraryAuthorExample example);

    LibraryAuthor selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") LibraryAuthor row, @Param("example") LibraryAuthorExample example);

    int updateByExample(@Param("row") LibraryAuthor row, @Param("example") LibraryAuthorExample example);

    int updateByPrimaryKeySelective(LibraryAuthor row);

    int updateByPrimaryKey(LibraryAuthor row);
}