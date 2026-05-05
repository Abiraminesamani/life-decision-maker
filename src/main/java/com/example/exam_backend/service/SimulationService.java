package com.example.exam_backend.service;

import com.example.exam_backend.model.State;
import org.springframework.stereotype.Service;

@Service
public class SimulationService {

    // STEP 1 logic
    public State processStep1(int choice, State state) {

        if (choice == 1) {
            state.setMoney(state.getMoney() + 30);
            state.setHealth(state.getHealth() - 20);
        } else {
            state.setMoney(state.getMoney() - 10);
            state.setHealth(state.getHealth() + 20);
        }

        return state;
    }

    // STEP 2 logic (depends on state)
    public State processStep2(int choice, State state) {

        if (state.getHealth() < 40) {
            if (choice == 1) {
                state.setHealth(state.getHealth() + 20);
                state.setMoney(state.getMoney() - 10);
            } else {
                state.setMoney(state.getMoney() + 10);
                state.setHealth(state.getHealth() - 10);
            }
        } else {
            if (choice == 1) {
                state.setMoney(state.getMoney() + 20);
            } else {
                state.setHealth(state.getHealth() + 5);
            }
        }

        return state;
    }

    public String getResult(State state) {

        if (state.getMoney() > 70 && state.getHealth() < 30) {
            return "Rich but unhealthy life";
        } else if (state.getMoney() > 60 && state.getHealth() > 50) {
            return "Balanced successful life";
        } else {
            return "Mixed life outcome";
        }
    }
}