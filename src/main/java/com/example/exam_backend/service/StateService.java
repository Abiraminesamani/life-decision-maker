package com.example.exam_backend.service;

import com.example.exam_backend.model.State;
import com.example.exam_backend.repository.StateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    private final StateRepository repo;

    public StateService(StateRepository repo) {
        this.repo = repo;
    }

    public State save(State s) {
        return repo.save(s);
    }

    public List<State> getAll() {
        return repo.findAll();
    }
}