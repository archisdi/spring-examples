package com.practice.database;

import com.practice.database.entity.Person;
import com.practice.database.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDAO personJdbcDAO;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> persons = personJdbcDAO.findAll();
		logger.info("persons => {}", persons);

		Person person = personJdbcDAO.findById(10001);
		logger.info("person => {}", person);

		int n = personJdbcDAO.deleteById(10002);
		logger.info("row affected => {}", n);

		Person AAI = new Person(10004, "Archie Isdiningrat", "Makassar", new Date());
		personJdbcDAO.create(AAI);
		logger.info("new person => {}", AAI);

		AAI.setLocation("Jakarta");
		personJdbcDAO.update(AAI);
		logger.info("updated person => {}", AAI);
	}
}
