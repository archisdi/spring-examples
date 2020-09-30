package com.practice.spring.basic.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    // retrieve value from app.configuration file
    @Value("${external.service.url}")
    private String url ;

    public String returnServiceURL() {
        return url;
    }
}
