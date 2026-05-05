package com.example.exam_backend.service;

import com.example.exam_backend.model.Question;
import com.example.exam_backend.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository repo;

    public QuestionService(QuestionRepository repo) {
        this.repo = repo;
    }

    public Question save(Question q) {
        return repo.save(q);
    }

    public List<Question> getAll() {
        return repo.findAll();
    }
}