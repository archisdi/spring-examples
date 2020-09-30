package com.practice.spring.basic.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named // @Component equivalent
public class SomeCdiBusiness {

    @Inject //  @AutoWired equivalent
    SomeCdiDao someCDIDAO;

    public void setSomeCDIDAO(SomeCdiDao someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }

    public SomeCdiDao getSomeCDIDAO() {
        return someCDIDAO;
    }

    public int findGreatest() {
        int greatest = Integer.MIN_VALUE;
        int[] data = someCDIDAO.getData();

        for (int val: data) {
            if (greatest < val) {
                greatest = val;
            }
        }

        return greatest;
    }
}
