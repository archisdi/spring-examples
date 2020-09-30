package com.practice.spring.basic;

import com.practice.spring.basic.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan()
@PropertySource("classpath:app.properties")
public class PropertyBasicApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(PropertyBasicApplication.class);

		SomeExternalService someExternalService = appContext.getBean(SomeExternalService.class);
		System.out.println(someExternalService.returnServiceURL());

		appContext.close();
	}

}
