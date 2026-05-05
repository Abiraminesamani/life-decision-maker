package com.example.exam_backend.service;

import com.example.exam_backend.model.Result;
import com.example.exam_backend.repository.ResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    private final ResultRepository repo;

    public ResultService(ResultRepository repo) {
        this.repo = repo;
    }

    public Result save(Result r) {
        return repo.save(r);
    }

    public List<Result> getAll() {
        return repo.findAll();
    }
}