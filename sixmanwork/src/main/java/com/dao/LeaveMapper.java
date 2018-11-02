package com.dao;

import com.been.Leave;

public interface LeaveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Leave record);

    int insertSelective(Leave record);

    Leave selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Leave record);

    int updateByPrimaryKey(Leave record);
}