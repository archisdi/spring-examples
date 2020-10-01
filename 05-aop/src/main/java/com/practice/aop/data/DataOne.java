package com.practice.aop.data;

import com.practice.aop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DataOne {
    @TrackTime
    public String retrieveSomething() {
        return "DAO_ONE";
    }
}
