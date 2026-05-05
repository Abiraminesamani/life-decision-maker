package com.example.exam_backend.repository;

import com.example.exam_backend.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

  List<Question> findByScenario_ScenarioId(Long scenarioId);
}