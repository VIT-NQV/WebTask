package com.example.amelaproject.service;

import com.example.amelaproject.taskList.TaskList;
import com.example.amelaproject.taskList.TaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListService {

    @Autowired
    private TaskListRepository repo;

    public List<TaskList> listAll() {
        return (List<TaskList>) repo.findAll();
    }
}
