package com.tools.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    @BeforeAll
    public void before() {
        // will run before all test
    }

    @AfterAll
    public void after() {
        // will run after all test
    }

    @Test
    public void testSum(){
        MyMath myMath = new MyMath();
        int sum = myMath.sum(new int[]{1,2,3});
        assertEquals(sum, 6);
    }
}