package com.practice.database.entity;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private String Location;
    private Date birthDate;

    // * no argument constructor required for the class to be mapped as bean
    public Person() {}
    public Person(int id, String name, String location, Date birthdate) {
        this.id = id;
        this.name = name;
        Location = location;
        this.birthDate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthdate) {
        this.birthDate = birthdate;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getLocation() + ")";
    }
}
