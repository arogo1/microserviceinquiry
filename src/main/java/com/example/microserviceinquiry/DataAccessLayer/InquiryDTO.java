package com.example.microserviceinquiry.DataAccessLayer;

import com.example.microserviceinquiry.Models.Inquiry;
import com.example.microserviceinquiry.Repository.InquiryRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class InquiryDTO {

    @Autowired
    InquiryRepository inquiryRepository;

    Inquiry inquiry = new Inquiry(1, 2, "Test", 1, 2);

    public boolean Save(Inquiry inquiry) throws Exception {
        inquiryRepository.save(inquiry);
        return false;
    }
}