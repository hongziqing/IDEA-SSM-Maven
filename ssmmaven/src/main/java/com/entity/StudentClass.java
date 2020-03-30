package com.entity;

public class StudentClass {

    private  String classno;
    private String classname;
    private String speciality;
    private String inyear;
    private int number;
    private String header;
    private String deptno;
    private String monitor;

    public StudentClass() {
        super();
    }

    public StudentClass(String classno, String classname, String speciality, String inyear, int number, String header, String deptno, String monitor) {
        this.classno = classno;
        this.classname = classname;
        this.speciality = speciality;
        this.inyear = inyear;
        this.number = number;
        this.header = header;
        this.deptno = deptno;
        this.monitor = monitor;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getInyear() {
        return inyear;
    }

    public void setInyear(String inyear) {
        this.inyear = inyear;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
}

