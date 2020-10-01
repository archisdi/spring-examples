package com.practice.database.springdata;

import com.practice.database.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {}
