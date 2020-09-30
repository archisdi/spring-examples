package com.practice.spring.basic;

import com.practice.spring.basic.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan()
public class CdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger("debug");

	public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext =
                new AnnotationConfigApplicationContext(BasicApplication.class);

        SomeCdiBusiness someCdiBusiness = appContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{}", someCdiBusiness.getSomeCDIDAO());
	}

}
