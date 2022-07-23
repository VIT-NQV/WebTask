package com.example.amelaproject.repository;

import com.example.amelaproject.entity.SignUpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignUpRepository extends JpaRepository<SignUpEntity, Long> {
}
