package com.example.exam_backend.service;

import com.example.exam_backend.model.Choice;
import com.example.exam_backend.repository.ChoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoiceService {

    private final ChoiceRepository repo;

    public ChoiceService(ChoiceRepository repo) {
        this.repo = repo;
    }

    public Choice save(Choice c) {
        return repo.save(c);
    }

    public List<Choice> getAll() {
        return repo.findAll();
    }
}