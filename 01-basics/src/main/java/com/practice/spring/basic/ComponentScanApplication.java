//package com.practice.spring.basic;
//
//import com.practice.spring.componentscan.ComponentPersonDAO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//
//@SpringBootApplication
//@ComponentScan("com.practice.spring.componentscan") // to import bean outside main package
//public class ComponentScanApplication {
//
//	static Logger LOGGER = LoggerFactory.getLogger("debug");
//
//	public static void main(String[] args) {
//		ApplicationContext appContext = SpringApplication.run(ComponentScanApplication.class, args);
//
//		ComponentPersonDAO personDAO = appContext.getBean(ComponentPersonDAO.class);
//		ComponentPersonDAO personDAO2 = appContext.getBean(ComponentPersonDAO.class);
//
//		LOGGER.info("{}", personDAO);
//		LOGGER.info("{}", personDAO.getJdbcConnection());
//
//		LOGGER.info("{}", personDAO2);
//		LOGGER.info("{}", personDAO2.getJdbcConnection());
//	}
//
//}
