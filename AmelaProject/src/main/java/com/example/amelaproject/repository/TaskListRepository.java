package com.example.amelaproject.repository;

import com.example.amelaproject.entity.TaskListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskListRepository extends JpaRepository<TaskListEntity, Long> {

}
