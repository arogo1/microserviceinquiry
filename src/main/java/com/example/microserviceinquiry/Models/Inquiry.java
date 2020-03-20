package com.example.microserviceinquiry.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inquiry{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int inquiryId;
    private int userId;
    private int categoryId;
    private String inquiryName;
    private int numberOfQuestionGroup;

    public Inquiry(){}

    public Inquiry(int UserId, int CategoryId, String InquiryName, int InquiryId, int NumberOfQuestionGroup){
        userId = UserId;
        categoryId = CategoryId;
        inquiryName = InquiryName;
        numberOfQuestionGroup = NumberOfQuestionGroup;
    }

    public String GetInquiryName(){
        return inquiryName;
    }

    public int GetNumberOfQuestion(){
        return numberOfQuestionGroup;
    }

}