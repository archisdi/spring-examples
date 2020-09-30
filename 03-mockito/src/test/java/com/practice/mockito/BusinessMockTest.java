package com.practice.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BusinessMockTest {
    @Test
    public void test() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1,2,3 });

        BusinessImpl business = new BusinessImpl(dataServiceMock);
        int res = business.findTheGreatest();
        assertEquals(3, res);
    }
}