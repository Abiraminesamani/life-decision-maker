package com.example.exam_backend.repository;

import com.example.exam_backend.model.Choice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChoiceRepository extends JpaRepository<Choice, Long> {

    List<Choice> findByQuestion_QuesId(Long quesId);
}