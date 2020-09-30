//package com.practice.spring.basic;
//
//import com.practice.spring.basic.scope.PersonDAO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//@SpringBootApplication
//public class ScopeApplication {
//
//	static Logger LOGGER = LoggerFactory.getLogger("debug");
//
//	public static void main(String[] args) {
//		ApplicationContext appContext = SpringApplication.run(ScopeApplication.class, args);
//
//		PersonDAO personDAO = appContext.getBean(PersonDAO.class);
//		PersonDAO personDAO2 = appContext.getBean(PersonDAO.class);
//
//		LOGGER.info("{}", personDAO);
//		LOGGER.info("{}", personDAO.getJdbcConnection());
//
//		LOGGER.info("{}", personDAO2);
//		LOGGER.info("{}", personDAO2.getJdbcConnection());
//	}
//
//}
