package com.practice.database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import java.util.Date;

@Entity
@NamedQuery(name="find_all_persons", query = "select p from Person p")
public class Person {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String location;
    private Date birthDate;

    // * no argument constructor required for the class to be mapped as bean
    public Person() {}
    public Person(int id, String name, String location, Date birthdate) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthdate;
    }
    public Person(String name, String location, Date birthdate) {
        super();
        this.name = name;
        this.location = location;
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
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
