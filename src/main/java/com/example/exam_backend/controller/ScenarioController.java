package com.example.exam_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exam_backend.model.Scenario;
import com.example.exam_backend.repository.ScenarioRepository;

@RestController
@RequestMapping("/scenarios")
public class ScenarioController {

    private final ScenarioRepository repo;

    public ScenarioController(ScenarioRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Scenario createScenario(@RequestBody Scenario scenario) {
        return repo.save(scenario);
    }

    @GetMapping
    public List<Scenario> getAll() {
        return repo.findAll();
    }
}