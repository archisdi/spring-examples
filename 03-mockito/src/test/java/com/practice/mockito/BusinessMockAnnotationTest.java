package com.practice.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class BusinessMockAnnotationTest {
    @Mock
    DataService dataServiceMock;

    @InjectMocks
    BusinessImpl business;

    @Test
    public void test() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1,2,3 });

        int res = business.findTheGreatest();
        assertEquals(3, res);
    }
}