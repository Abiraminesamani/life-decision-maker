package com.example.exam_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Choice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long choiceId;

    private String choiceType;

    @ManyToOne
    @JoinColumn(name = "ques_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "next_ques")
    private Question nextQuestion;
}