package com.example.demo.Entity;

public class Student {
    private String username;

    public Student(String username, String studentNum) {
        this.username = username;
        StudentNum = studentNum;
    }

    public Student() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStudentNum() {
        return StudentNum;
    }

    public void setStudentNum(String studentNum) {
        StudentNum = studentNum;
    }

    private String StudentNum;
}
