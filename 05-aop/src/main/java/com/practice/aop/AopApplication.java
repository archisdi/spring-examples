package com.practice.aop;

import com.practice.aop.business.BusinessOne;
import com.practice.aop.business.BusinessTwo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger("");

	@Autowired
	private BusinessOne businessOne;

	@Autowired
	private BusinessTwo businessTwo;

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(businessOne.calculateSomething());
		logger.info(businessTwo.calculateSomething());
	}
}
