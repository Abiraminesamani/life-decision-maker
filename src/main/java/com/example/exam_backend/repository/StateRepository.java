package com.example.exam_backend.repository;

import com.example.exam_backend.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}