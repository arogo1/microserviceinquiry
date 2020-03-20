package com.example.microserviceinquiry.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int answerId;
    private int questionId;
    private String answer;
    private boolean isCorrect;

    public Answer(){}

    public Answer(String Answer, boolean IsCorrect) {
        answer = Answer;
        isCorrect = IsCorrect;
    }

    public String GetAnswer(){
        return answer;
    }

    public boolean GetIsCorrect(){
        return isCorrect;
    }
}