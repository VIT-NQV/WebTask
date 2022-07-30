package com.example.amelaproject.service.impl;

import com.example.amelaproject.entity.TaskListEntity;
import com.example.amelaproject.repository.TaskListRepository;
import com.example.amelaproject.service.TaskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListImpl implements TaskListService {

    @Autowired
    private TaskListRepository taskList;

    @Override
    public Page<TaskListEntity> findAll(int page , String searchValue, String status) {
        Pageable pageable = PageRequest.of(page - 1, 5   );
        return taskList.getAllTask(pageable , searchValue, status);
    }


    //    @Override
//    public Page<TaskListEntity> findByNameTask(String task, Pageable pageable) {
//        return taskList.findByNameTask(task, pageable);
//    }


}
