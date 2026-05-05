package com.example.exam_backend.controller;

import com.example.exam_backend.model.Choice;
import com.example.exam_backend.repository.ChoiceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/choices")
public class ChoiceController {

    private final ChoiceRepository repo;

    public ChoiceController(ChoiceRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Choice add(@RequestBody Choice c) {
        return repo.save(c);
    }

    @GetMapping
    public List<Choice> getAll() {
        return repo.findAll();
    }
}