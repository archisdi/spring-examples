package com.practice.spring.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.practice.spring.basic.search.BinarySearch;

@Configuration
@ComponentScan()
public class BasicApplication {

	// What are the beans
	// What are the dependencies of a bean
	// Where to search for beans

	public static void main(String[] args) {
		// * with spring boot
//		ApplicationContext appContext = SpringApplication.run(BasicApplication.class, args);

		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(BasicApplication.class);

		// * without spring
//				BinarySearch binarySearch = new BinarySearch(new BubbleSortAlgorithm());

		BinarySearch binarySearch = appContext.getBean(BinarySearch.class);
		int res = binarySearch.binarySearch(new int[] { 1,2,3 }, 4);
		System.out.println(res);

		// need to be closed
		appContext.close();
	}

}
