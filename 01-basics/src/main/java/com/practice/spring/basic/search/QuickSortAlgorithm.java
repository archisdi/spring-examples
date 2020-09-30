package com.practice.spring.basic.search;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary // mark bean as primary is theres more than 1 bean options
@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        System.out.println("quick");
        return numbers;
    }
}
