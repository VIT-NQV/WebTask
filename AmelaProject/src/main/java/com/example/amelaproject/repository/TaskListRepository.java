package com.example.amelaproject.repository;

import com.example.amelaproject.entity.TaskListEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskListRepository extends PagingAndSortingRepository<TaskListEntity, Long> {

    @Query(value = "SELECT t FROM TaskListEntity as t WHERE t.title LIKE %:title% AND t.status LIKE %:status%")
    Page<TaskListEntity> getAllTask(Pageable page , @Param("title") String title, @Param("status") String status);


}
