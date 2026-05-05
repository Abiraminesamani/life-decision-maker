package com.example.exam_backend.controller;

import com.example.exam_backend.model.Question;
import com.example.exam_backend.repository.QuestionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionRepository repo;

    public QuestionController(QuestionRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Question add(@RequestBody Question q) {
        return repo.save(q);
    }

    @GetMapping
    public List<Question> getAll() {
        return repo.findAll();
    }
}