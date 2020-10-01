package com.practice.database;

import com.practice.database.entity.Person;
import com.practice.database.jdbc.PersonJdbcDAO;
import com.practice.database.jpa.PersonJpaRepository;
import com.practice.database.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDAO personJdbcDAO;

	@Autowired
	PersonJpaRepository personJpaRepository;

	@Autowired
	PersonSpringDataRepository personSpringDataRepository;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	private void getDataWithJdbc() {
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

	private void getDataWithJpa() {
		List<Person> persons = personJpaRepository.findAll();
		logger.info("persons => {}", persons);

		Person person = personJpaRepository.findById(10001);
		logger.info("person => {}", person);

		Person AAI =
				personJpaRepository.create(new Person(
						"Archie Isdiningrat",
						"Makassar",
						new Date())
				);
		logger.info("new person => {}", AAI);

		AAI.setLocation("Jakarta");
		personJpaRepository.update(AAI);
		logger.info("updated person => {}", AAI);

		personJpaRepository.deleteById(10002);
	}

	private void getDataWithSpringJpa() {
//		List<Person> persons = personSpringDataRepository.findAll();
//		logger.info("persons => {}", persons);
//
//		Optional<Person> person = personSpringDataRepository.findById(10001);
//		logger.info("person => {}", person);

		Person AAI =
				personSpringDataRepository.save(new Person(
						"Archie Isdiningrat",
						"Makassar",
						new Date())
				);
		logger.info("new person => {}", AAI);

		AAI.setLocation("Jakarta");
		personSpringDataRepository.save(AAI);
		logger.info("updated person => {}", AAI);

//		personSpringDataRepository.deleteById(10002);
	}

	@Override
	public void run(String... args) throws Exception {
		this.getDataWithSpringJpa();
	}
}
