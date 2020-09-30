package com.practice.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

public class ListTest {
    @Test
    public void testSize() {
        List mockList = mock(List.class);
        when(mockList.size()).thenReturn(4).thenReturn(20);

        assertEquals(mockList.size(), 4);
        assertEquals(mockList.size(), 20);
    }

    @Test
    public void testGet() {
        List mockList = mock(List.class);
        when(mockList.get(Mockito.anyInt())).thenReturn(4);
        
        assertEquals(mockList.get(3), 4);
    }
}
