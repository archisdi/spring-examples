package com.practice.mockito;

public class BusinessImpl {
    private DataService dataService;

    public BusinessImpl(DataService service) {
        super();
        this.dataService = service;
    }

    int findTheGreatest() {
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for (int val: data) {
            if (greatest < val) {
                 greatest = val;
            }
        }

        return greatest;
    }
}

interface DataService {
    int[] retrieveAllData();
}