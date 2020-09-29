package com.practice.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    // Implementing loosely coupled algorithm
    public BinarySearch(SortAlgorithm algorithm) {
        super();
        this.sortAlgorithm = algorithm;
    }

    public int binarySearch(int[] numbers, int find) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        return find;
    }
}
