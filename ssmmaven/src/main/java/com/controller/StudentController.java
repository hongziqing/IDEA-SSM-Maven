package com.controller;

import com.entity.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.StudentService;
import com.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/queryStudent")
    public String queryStudentInfo(Map<String,Object> map, @RequestParam(value = "page",required = false,defaultValue = "1") int page, HttpServletRequest request){
      if (page<=0){
          page=1;
      }
        PageHelper.startPage(page,5);
      List<Student> list = studentService.queryStudent();
        PageInfo<Student> pageInfo = new PageInfo<Student>(list,5);
        PageUtils<Student> pageUtils = new PageUtils<Student>();
        String info = pageUtils.PageInfo(pageInfo,request);
           map.put("info",info);
           map.put("list",list);
      return "forward:/view/StudentInfo.jsp";
    }

}

