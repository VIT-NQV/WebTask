package com.example.amelaproject.service.impl;

import com.example.amelaproject.entity.TaskListEntity;
import com.example.amelaproject.repository.TaskListRepository;
import com.example.amelaproject.service.TaskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListImpl implements TaskListService {

    @Autowired
    private TaskListRepository taskList;

    @Override
    public List<TaskListEntity> findAll() {
        return taskList.findAll();
    }

    @Override
    public Page<TaskListEntity> findAll(PageRequest pageable) {
        return taskList.findAll(pageable);
    }
}
