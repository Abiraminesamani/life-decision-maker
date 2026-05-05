package com.example.exam_backend.repository;

import com.example.exam_backend.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Long> {

    List<Result> findByUser_UserId(Long userId);
}