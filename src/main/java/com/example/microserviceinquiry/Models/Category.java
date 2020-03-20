package com.example.microserviceinquiry.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;
    private String categoryName;

    public Category(){}

    public Category(String CategoryName){
        categoryName = CategoryName;
    }

    public String GetCategoryName(){
        return categoryName;
    }
}