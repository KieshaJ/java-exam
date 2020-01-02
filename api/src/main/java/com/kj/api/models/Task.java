package com.kj.api.models;

import java.util.Date;

public class Task {
    private Integer id;
    private String name;
    private Date deadline;

    public Task(Integer id, String name, Date deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
