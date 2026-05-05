package com.example.exam_backend.service;

import com.example.exam_backend.model.Scenario;
import com.example.exam_backend.repository.ScenarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenarioService {

    private final ScenarioRepository repo;

    public ScenarioService(ScenarioRepository repo) {
        this.repo = repo;
    }

    public Scenario save(Scenario s) {
        return repo.save(s);
    }

    public List<Scenario> getAll() {
        return repo.findAll();
    }
}