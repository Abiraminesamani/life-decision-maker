package com.example.exam_backend.controller;

import com.example.exam_backend.model.Scenario;
import com.example.exam_backend.repository.ScenarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scenarios")
public class ScenarioController {

    private final ScenarioRepository repo;

    public ScenarioController(ScenarioRepository repo) {
        this.repo = repo;
    }

    // CREATE SCENARIO
    @PostMapping
    public Scenario createScenario(@RequestBody Scenario scenario) {
        return repo.save(scenario);
    }

    // GET ALL SCENARIOS
    @GetMapping
    public List<Scenario> getAll() {
        return repo.findAll();
    }
}