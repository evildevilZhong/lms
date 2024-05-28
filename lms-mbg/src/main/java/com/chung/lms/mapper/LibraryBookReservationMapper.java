package com.chung.lms.mapper;

import com.chung.lms.model.LibraryBookReservation;
import com.chung.lms.model.LibraryBookReservationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibraryBookReservationMapper {
    long countByExample(LibraryBookReservationExample example);

    int deleteByExample(LibraryBookReservationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LibraryBookReservation row);

    int insertSelective(LibraryBookReservation row);

    List<LibraryBookReservation> selectByExample(LibraryBookReservationExample example);

    LibraryBookReservation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") LibraryBookReservation row, @Param("example") LibraryBookReservationExample example);

    int updateByExample(@Param("row") LibraryBookReservation row, @Param("example") LibraryBookReservationExample example);

    int updateByPrimaryKeySelective(LibraryBookReservation row);

    int updateByPrimaryKey(LibraryBookReservation row);
}