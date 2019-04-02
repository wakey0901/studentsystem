package com.qf.mapper;

import com.qf.entity.SysStudent;

public interface SysStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysStudent record);

    int insertSelective(SysStudent record);

    SysStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysStudent record);

    int updateByPrimaryKey(SysStudent record);
}