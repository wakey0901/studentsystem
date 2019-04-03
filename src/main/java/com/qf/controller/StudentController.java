package com.qf.controller;

import com.qf.entity.SysStudent;
import com.qf.service.ISysStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private ISysStudentService sysStudentService;

    //查询所有学生数据
    @RequestMapping("/studentList")
    public String getAllStudentInfo(ModelMap map){
        List<SysStudent> sysStudentList = sysStudentService.getAllStudentInfo();
        map.put("sysStudentList",sysStudentList);
        return "student_list";
    }

    //跳转到编辑页面
    @RequestMapping("/toUpdate")
    public String toUpdate(int id,ModelMap map){
        SysStudent sysStudent = sysStudentService.getStudentInfo(id);
        map.put("sysStudent",sysStudent);
        return "student_update";
    }

    //修改学生
    @RequestMapping("/update")
    public String update(SysStudent sysStudent,ModelMap map){
        sysStudentService.updateByPrimaryKey(sysStudent);
        return "redirect:studentList";
    }

    //删除学生
    @RequestMapping("/delete")
    public String delete(int id){
        sysStudentService.deleteStudentById(id);
        return "redirect:studentList";
    }

    //跳转到添加学生页面
    @RequestMapping("/add")
    public String add(){
        return "student_add";
    }

    //添加学生
    @RequestMapping("/addStudent")
    public String addStudent(SysStudent sysStudent){
        sysStudentService.insertSelective(sysStudent);
        return "redirect:studentList";
    }
}
