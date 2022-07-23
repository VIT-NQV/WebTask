package com.example.amelaproject.repository;

import com.example.amelaproject.entity.TaskListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskListRepository extends JpaRepository<TaskListEntity, Long> {

}
