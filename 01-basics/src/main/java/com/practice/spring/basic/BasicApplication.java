package com.practice.spring.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.practice.spring.basic.search.BinarySearch;

@SpringBootApplication
public class BasicApplication {

	// What are the beans
	// What are the dependencies of a bean
	// Where to search for beans

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(BasicApplication.class, args);

		// * without spring
		//		BinarySearch binarySearch = new BinarySearch(new BubbleSortAlgorithm());

		BinarySearch binarySearch = appContext.getBean(BinarySearch.class);
		int res = binarySearch.binarySearch(new int[] { 1,2,3}, 4);
		System.out.println(res);
	}

}