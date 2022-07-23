package com.example.amelaproject.repository;

import com.example.amelaproject.entity.TaskListEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskListRepository extends JpaRepository<TaskListEntity, Long> {
//    Page<TaskListEntity> findAll(PageRequest pageable);
}
