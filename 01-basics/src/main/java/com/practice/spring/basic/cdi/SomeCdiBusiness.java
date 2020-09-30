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
}
