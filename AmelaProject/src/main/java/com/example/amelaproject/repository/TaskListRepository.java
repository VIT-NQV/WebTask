package com.example.amelaproject.repository;

import com.example.amelaproject.entity.TaskListEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskListRepository extends PagingAndSortingRepository<TaskListEntity, Long> {

    @Query(value = "SELECT t FROM TaskListEntity as t ")
    Page<TaskListEntity> getAllTask (Pageable page);
}
