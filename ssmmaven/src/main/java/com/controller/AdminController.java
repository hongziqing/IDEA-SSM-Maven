package com.controller;

import com.entity.Admin;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;
    @RequestMapping("login")
    public  String Login(Admin admin, Map<String,Object> map){
      Admin admin1 =  adminService.Login(admin);
       map.put("admid",admin1);
        return "redirect:/queryStudent";
    }

}

