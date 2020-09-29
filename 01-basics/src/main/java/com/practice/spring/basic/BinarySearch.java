package com.practice.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Implementing loosely coupled algorithm

@Component
public class BinarySearch {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    // * setter injection
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    // * constructor injection
//    public BinarySearch(SortAlgorithm algorithm) {
//        super();
//        this.sortAlgorithm = algorithm;
//    }

    public int binarySearch(int[] numbers, int find) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        return find;
    }
}
