package com.practice.spring.basic.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {
    @InjectMocks // inject mock
    SomeCdiBusiness someCdiBusiness;

    @Mock // create mock
    SomeCdiDao someCdiDaoMock;

    @Test
    void findGreatest() {
        Mockito.when(someCdiDaoMock.getData()).thenReturn(new int[]{ 2, 4});

        int actual = someCdiBusiness.findGreatest();
        assertEquals(4, actual);
    }
}