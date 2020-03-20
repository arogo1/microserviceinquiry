package com.example.microserviceinquiry.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionId;
    private int questionGroupId;
    private String question;

    public Question(){}

    public Question(int QuestionGroupId, String Question){
        questionGroupId = QuestionGroupId;
        question = Question;
    }

    public String GetQuesition(){
        return question;
    }
}