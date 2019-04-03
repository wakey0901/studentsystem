package com.qf.service.impl;

import com.qf.dao.IBaseDao;
import com.qf.entity.SysStudent;
import com.qf.mapper.SysStudentMapper;
import com.qf.service.ISysStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysStudentImpl extends BaseServiceImpl<SysStudent> implements ISysStudentService {

    @Autowired
    private SysStudentMapper sysStudentMapper;

    @Override
    public SysStudent getStudentInfo(int id) {
        return sysStudentMapper.getStudentInfo(id);
    }

    @Override
    public void deleteStudentById(int id) {
        sysStudentMapper.deleteStudentById(id);
    }

    @Override
    public List<SysStudent> getAllStudentInfo() {
        return sysStudentMapper.getAllStudentInfo();
    }



    @Override
    public IBaseDao<SysStudent> getDao() {
        return sysStudentMapper;
    }
}
