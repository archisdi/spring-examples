package com.practice.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentPersonDAO {
    @Autowired
    ComponentJdbcConnection jdbcConnection;

    public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public ComponentJdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }
}
