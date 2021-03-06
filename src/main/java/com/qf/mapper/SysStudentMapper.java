package com.qf.mapper;

import com.qf.dao.IBaseDao;
import com.qf.entity.SysStudent;

import java.util.List;

public interface SysStudentMapper extends IBaseDao<SysStudent>{

    List<SysStudent> getAllStudentInfo();

    SysStudent getStudentInfo(int id);

    void deleteStudentById(int id);
}