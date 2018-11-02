package com.dao;

import com.been.CarReserve;

public interface CarReserveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarReserve record);

    int insertSelective(CarReserve record);

    CarReserve selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarReserve record);

    int updateByPrimaryKey(CarReserve record);
}