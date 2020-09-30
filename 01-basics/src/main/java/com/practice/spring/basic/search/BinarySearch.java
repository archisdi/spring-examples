package com.practice.spring.basic.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Implementing loosely coupled algorithm

@Component // mark class as a bean
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // will create new bean instance everytime it being requested
public class BinarySearch {

    @Autowired
    @Qualifier("bubble")
    // auto injection can be done by Name or @Primary or @Qualifier
    private SortAlgorithm sortAlgorithm;

    // * setter injection
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    // * constructor injection
    public BinarySearch(SortAlgorithm algorithm) {
        super();
        this.setSortAlgorithm(algorithm);
    }

    public int binarySearch(int[] numbers, int find) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        return find;
    }
}
