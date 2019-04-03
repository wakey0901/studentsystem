package com.qf.service;

import com.qf.entity.SysStudent;

import java.util.List;

public interface ISysStudentService extends IBaseService<SysStudent> {
    List<SysStudent> getAllStudentInfo();

    SysStudent getStudentInfo(int id);

    void deleteStudentById(int id);
}
