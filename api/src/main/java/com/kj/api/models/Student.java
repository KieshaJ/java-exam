package com.kj.api.models;

import java.util.Date;

public class Student {
    private Integer code;
    private String name;
    private String surname;
    private Date submissionDate;

    public Student(Integer code, String name, String surname, Date submissionDate) {
        this.code = code;
        this.name = name;
        this.surname = surname;
        this.submissionDate = submissionDate;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }
}
