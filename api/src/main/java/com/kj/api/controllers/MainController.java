package com.kj.api.controllers;

import com.kj.api.models.Student;
import com.kj.api.models.Task;
import com.kj.api.models.TaskStatistic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class MainController {
    private List<Task> tasks = Arrays.asList(
            new Task(1, "test", new Date())
    );

    private List<Student> students = Arrays.asList(
            new Student(1, "test", "test", new Date())
    );

    private List<TaskStatistic> statistics = Arrays.asList(
            new TaskStatistic(tasks.get(0), students, students.size(), 50, 50)
    );

    @GetMapping(path = "/uzduotys")
    public List<Task> tasks() {
        return tasks;
    }

    @GetMapping(path = "/uzduotis/{id}")
    public TaskStatistic statistic(@PathVariable Integer id) {
        for(TaskStatistic statistic: statistics) {
            if(statistic.getTask().getId().equals(id)) {
                return statistic;
            }
        }

        return null;
    }

    @GetMapping(path = "/studentai/{id}")
    public List<Student> students(@PathVariable Integer id) {
        for(TaskStatistic statistic: statistics) {
            if(statistic.getTask().getId().equals(id)) {
                return statistic.getStudentList();
            }
        }

        return null;
    }
}
