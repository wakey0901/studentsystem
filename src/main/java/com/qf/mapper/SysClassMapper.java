package com.qf.mapper;

import com.qf.entity.SysClass;

public interface SysClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysClass record);

    int insertSelective(SysClass record);

    SysClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysClass record);

    int updateByPrimaryKey(SysClass record);
}