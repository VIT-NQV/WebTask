package com.example.amelaproject.service.impl;

import com.example.amelaproject.entity.TaskListEntity;
import com.example.amelaproject.service.TaskListImpl;
import com.example.amelaproject.repository.TaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListService implements TaskListImpl {

    @Autowired
    private TaskListRepository taskListRepository;


    @Override
    public List<TaskListEntity> findAll() {
        return taskListRepository.findAll();
    }

    @Override
    public Page<TaskListEntity> findAll(PageRequest pageable) {
        return taskListRepository.findAll(pageable);
    }
}
