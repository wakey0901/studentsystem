package com.qf.mapper;

import com.qf.entity.SysTeacher;

public interface SysTeacherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysTeacher record);

    int insertSelective(SysTeacher record);

    SysTeacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysTeacher record);

    int updateByPrimaryKey(SysTeacher record);
}