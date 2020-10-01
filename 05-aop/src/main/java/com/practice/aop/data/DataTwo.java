package com.practice.aop.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataTwo {
    public String retrieveSomething() {
        return "DAO_TWO";
    }
}
