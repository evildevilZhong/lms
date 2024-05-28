package com.chung.lms.mapper;

import com.chung.lms.model.LibraryMember;
import com.chung.lms.model.LibraryMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibraryMemberMapper {
    long countByExample(LibraryMemberExample example);

    int deleteByExample(LibraryMemberExample example);

    int deleteByPrimaryKey(@Param("id") Long id, @Param("umsId") Long umsId);

    int insert(LibraryMember row);

    int insertSelective(LibraryMember row);

    List<LibraryMember> selectByExample(LibraryMemberExample example);

    LibraryMember selectByPrimaryKey(@Param("id") Long id, @Param("umsId") Long umsId);

    int updateByExampleSelective(@Param("row") LibraryMember row, @Param("example") LibraryMemberExample example);

    int updateByExample(@Param("row") LibraryMember row, @Param("example") LibraryMemberExample example);

    int updateByPrimaryKeySelective(LibraryMember row);

    int updateByPrimaryKey(LibraryMember row);
}