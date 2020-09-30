package com.practice.spring.basic;

import com.practice.spring.basic.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan()
public class XmlBasicApplication {

	private static Logger LOGGER = LoggerFactory.getLogger("debug");

	public static void main(String[] args) {

		// * manually create application context using XML Configuration
		ClassPathXmlApplicationContext appContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		LOGGER.info("Beans Loaded => {}", (Object)appContext.getBeanDefinitionNames());

		XMLPersonDAO xmlPersonDAO = appContext.getBean(XMLPersonDAO.class);
		System.out.println(xmlPersonDAO.getJdbcConnection());

		appContext.close();
	}

}
