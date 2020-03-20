package com.example.microserviceinquiry.Repository;

import com.example.microserviceinquiry.Models.Inquiry;

import org.springframework.data.repository.CrudRepository;

public interface InquiryRepository extends CrudRepository<Inquiry, Integer> {

}