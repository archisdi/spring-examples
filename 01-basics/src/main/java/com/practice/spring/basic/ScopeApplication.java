package com.practice.spring.basic;

import com.practice.spring.basic.scope.PersonDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(ScopeApplication.class, args);

		PersonDAO personDAO = appContext.getBean(PersonDAO.class);
	}

}
