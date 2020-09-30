package com.practice.spring.basic.xml;

public class XMLPersonDAO {
    XMLJdbcConnection jdbcConnection;

    public void setJdbcConnection(XMLJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public XMLJdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }


}
