package com.example.amelaproject.controller;

import com.example.amelaproject.entity.TaskListEntity;
import com.example.amelaproject.service.impl.TaskListService;
import com.example.amelaproject.repository.TaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class TaskListController {

    @Autowired
    private TaskListService taskListService;

    @GetMapping("/tasklist")
    public String showTask(Model model) {
        List<TaskListEntity> task = taskListService.findAll();
        model.addAttribute("show",task);
        return "taskListIndex";
    }

    @GetMapping("tasklist/page")
    public String pagination(Model model, @RequestParam("p")Optional<Integer> p){
        Pageable pageable = PageRequest.of(p.orElse(0),5);
        Page<TaskListEntity> page = taskListService.findAll((PageRequest) pageable);
        model.addAttribute("show", page);
        return "taskListIndex";
    }

}
