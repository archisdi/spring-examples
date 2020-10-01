package com.practice.database.jdbc;

import com.practice.database.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query(
                "select * from person",
                new BeanPropertyRowMapper<Person>(Person.class)
        );
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject(
                "select * from person where id=? ",
                new Object[]{id},
                new BeanPropertyRowMapper<Person>(Person.class)
        );
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("delete from person where id=? ", id);
    }

    public int create(Person person) {
        return jdbcTemplate.update(
                "insert into person (id, name, location, birth_date) values(?,?,?,?)",
                person.getId(), person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime())
        );
    }

    public int update(Person person) {
        return jdbcTemplate.update(
                "update person set name = ?, location = ?, birth_date = ? where id = ?",
                person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()), person.getId()
        );
    }
}
