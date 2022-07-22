package com.example.amelaproject.controller;

import com.example.amelaproject.service.TaskListService;
import com.example.amelaproject.taskList.TaskList;
import com.example.amelaproject.taskList.TaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskListController {

    @Autowired
    private TaskListRepository repo;

    @GetMapping("/tasklist")
    public List<TaskList> getTask() {
        return (List<TaskList>) repo.findAll();
    }

//    @GetMapping("/tasklist")
//    public String showtasklist(Model model) {
//        List<TaskList> tasklist = service.listAll();
//        model.addAttribute("tasklist", tasklist);
//        return "taskListIndex";
//    }
}
