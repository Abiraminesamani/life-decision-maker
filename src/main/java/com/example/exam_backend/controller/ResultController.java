package com.example.exam_backend.controller;

import com.example.exam_backend.model.Result;
import com.example.exam_backend.repository.ResultRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/results")
public class ResultController {

    private final ResultRepository repo;

    public ResultController(ResultRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Result save(@RequestBody Result r) {
        return repo.save(r);
    }

    @GetMapping
    public List<Result> getAll() {
        return repo.findAll();
    }
}