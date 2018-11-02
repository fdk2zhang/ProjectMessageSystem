package com.dao;

import com.been.OrgDeptKey;

public interface OrgDeptMapper {
    int deleteByPrimaryKey(OrgDeptKey key);

    int insert(OrgDeptKey record);

    int insertSelective(OrgDeptKey record);
}