package com.example.amelaproject.service;

import com.example.amelaproject.entity.TaskListEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TaskListService {

    Page<TaskListEntity> findAll(int page, String searchValue, String status);

}
