package com.practice.mockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BusinessImplTest {
    @Test
    public void test() {
        BusinessImpl business = new BusinessImpl(new DataServiceStub());
        int res = business.findTheGreatest();
        assertEquals(3, res);
    }
}

// manual stubbing
class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{1,2,3};
    }
}