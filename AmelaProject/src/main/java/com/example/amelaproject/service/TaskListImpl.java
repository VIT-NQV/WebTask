package com.example.amelaproject.service;


import com.example.amelaproject.entity.TaskListEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface TaskListImpl {

    List<TaskListEntity> findAll();

    Page<TaskListEntity> findAll(PageRequest pageable);
}
