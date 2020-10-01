package com.practice.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // automatically set spring context, component scan, auto configuration
public class BootApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(BootApplication.class, args);

//		for (String name: appContext.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}
	}

}
