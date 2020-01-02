package com.kj.api.models;

import java.util.List;

public class TaskStatistic {
    private Task task;
    private List<Student> studentList;

    private Integer assessed;
    private Integer minAssessment;
    private Integer maxAssessment;

    public TaskStatistic(Task task, List<Student> studentList, Integer assessed, Integer minAssessment, Integer maxAssessment) {
        this.task = task;
        this.studentList = studentList;
        this.assessed = assessed;
        this.minAssessment = minAssessment;
        this.maxAssessment = maxAssessment;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Integer getAssessed() {
        return assessed;
    }

    public void setAssessed(Integer assessed) {
        this.assessed = assessed;
    }

    public Integer getMinAssessment() {
        return minAssessment;
    }

    public void setMinAssessment(Integer minAssessment) {
        this.minAssessment = minAssessment;
    }

    public Integer getMaxAssessment() {
        return maxAssessment;
    }

    public void setMaxAssessment(Integer maxAssessment) {
        this.maxAssessment = maxAssessment;
    }
}
