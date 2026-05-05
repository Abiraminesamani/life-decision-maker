package com.example.exam_backend.controller;

import com.example.exam_backend.model.State;
import com.example.exam_backend.service.SimulationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/simulate")
public class SimulationController {

    private final SimulationService service;

    public SimulationController(SimulationService service) {
        this.service = service;
    }

    // STEP 1
    @PostMapping("/step1")
    public State step1(@RequestParam int choice) {
        State state = new State();
        return service.processStep1(choice, state);
    }

    // STEP 2
    @PostMapping("/step2")
    public State step2(@RequestBody State state,
                       @RequestParam int choice) {
        return service.processStep2(choice, state);
    }

    // FINAL RESULT
    @PostMapping("/result")
    public String result(@RequestBody State state) {
        return service.getResult(state);
    }
}