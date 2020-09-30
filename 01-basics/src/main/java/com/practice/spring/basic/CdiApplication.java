//package com.practice.spring.basic;
//
//import com.practice.spring.basic.cdi.SomeCdiBusiness;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//@SpringBootApplication
//public class CdiApplication {
//
//	private static Logger LOGGER = LoggerFactory.getLogger("debug");
//
//	public static void main(String[] args) {
//		ApplicationContext appContext = SpringApplication.run(CdiApplication.class, args);
//		SomeCdiBusiness someCdiBusiness = appContext.getBean(SomeCdiBusiness.class);
//
//		LOGGER.info("{}", someCdiBusiness.getSomeCDIDAO());
//	}
//
//}
