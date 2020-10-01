package com.practice.aop.business;

import com.practice.aop.data.DataTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessTwo {
    @Autowired
    DataTwo dataTwo;

    public String calculateSomething() {
        return dataTwo.retrieveSomething();
    }
}
