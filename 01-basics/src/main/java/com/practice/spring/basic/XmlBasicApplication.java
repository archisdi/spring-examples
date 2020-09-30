package com.practice.spring.basic;

import com.practice.spring.basic.search.BinarySearch;
import com.practice.spring.basic.xml.XMLPersonDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan()
public class XmlBasicApplication {

	public static void main(String[] args) {

		// * manually create application context using XML Configuration
		ClassPathXmlApplicationContext appContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		XMLPersonDAO xmlPersonDAO = appContext.getBean(XMLPersonDAO.class);
		System.out.println(xmlPersonDAO.getJdbcConnection());

		appContext.close();
	}

}
