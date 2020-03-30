package com.service;

import com.dao.StudentDao;
import com.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;
    public List<Student> queryStudent(){
        return studentDao.queryStudent();
    };

}

