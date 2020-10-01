package com.practice.aop.business;

import com.practice.aop.data.DataOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessOne {
    @Autowired
    DataOne dataOne;

    public String calculateSomething() {
        return dataOne.retrieveSomething();
    }
}
