package com.entity;

public class Student {

    private String sno;
    private String sname;
    private String ssex;
    private String sphone;
    private String sbirthday;
    private String saddress;
    private String sphoto;
    private String classno;
    private String qq;
    private StudentClass studentClass;
    public Student() {
        super();
    }

    public Student(String sno, String sname, String ssex, String sphone, String saddress, String sphoto, String classno, String qq) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.sphone = sphone;
        this.saddress = saddress;
        this.sphoto = sphoto;
        this.classno = classno;
        this.qq = qq;
    }

    public Student(String sno, String sname, String ssex, String sphone, String saddress, String sphoto, String classno, String qq, StudentClass studentClass) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.sphone = sphone;
        this.saddress = saddress;
        this.sphoto = sphoto;
        this.classno = classno;
        this.qq = qq;
        this.studentClass = studentClass;
    }

    public Student(String sno, String sname, String ssex, String sphone, String sbirthday, String saddress, String sphoto, String classno, String qq, StudentClass studentClass) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.sphone = sphone;
        this.sbirthday = sbirthday;
        this.saddress = saddress;
        this.sphoto = sphoto;
        this.classno = classno;
        this.qq = qq;
        this.studentClass = studentClass;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSphone() {
        return sphone;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getSphoto() {
        return sphoto;
    }

    public void setSphoto(String sphoto) {
        this.sphoto = sphoto;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
}

