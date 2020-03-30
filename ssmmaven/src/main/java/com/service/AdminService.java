package com.service;

import com.dao.AdminDao;
import com.entity.Admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

  @Autowired
   AdminDao adminDao;
    public Admin Login(Admin admin){
        return adminDao.Login(admin);
    };

}

