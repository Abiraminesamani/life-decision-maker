package com.example.exam_backend.repository;

import com.example.exam_backend.model.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScenarioRepository extends JpaRepository<Scenario, Long> {
}