package com.dao;

import com.been.BookReserve;

public interface BookReserveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookReserve record);

    int insertSelective(BookReserve record);

    BookReserve selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookReserve record);

    int updateByPrimaryKey(BookReserve record);
}