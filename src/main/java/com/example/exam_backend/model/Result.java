package com.example.exam_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resId;

    private int score;

    private String type; // success / failure

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}