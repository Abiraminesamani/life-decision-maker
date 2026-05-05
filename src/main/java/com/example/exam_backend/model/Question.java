package com.example.exam_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quesId;

    private String text;

    @ManyToOne
    @JoinColumn(name = "scenario_id")
    private Scenario scenario;
}