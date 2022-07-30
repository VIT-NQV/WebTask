package com.example.amelaproject.controller;

import com.example.amelaproject.entity.TaskListEntity;
import com.example.amelaproject.service.TaskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class TaskListController {

    @Autowired
    private TaskListService taskListService;

    @GetMapping("/tasklist")
    public String showTask(Model model) {

        return pagination(model, 1, "", "");

    }

    @GetMapping("/tasklist/page/{page}")
    public String pagination(Model model,
                             @PathVariable("page") int  page,
                             @Param(value = "search") String search,
                             @Param(value = "status") String status){
        Page<TaskListEntity> pageList = taskListService.findAll(page, search, status );

        long totalPage = pageList.getTotalPages();
        List<TaskListEntity> listTask = pageList.getContent();

        model.addAttribute("show", listTask);
        model.addAttribute("totalPages" , totalPage);
        model.addAttribute("currentPage" , page);
        model.addAttribute("searchValue" , search);
        model.addAttribute("status", status);

        return "taskListIndexOld";
    }

    @GetMapping("/search")
    public String search(Model model,
                         @Param(value = "search") String search,
                         @Param(value = "status") String status) {
        return pagination(model,1, search, status);
    }




}
