package com.javafortesters.myfirsttest.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2", 4, answer);
    }

    @Test
    public void canSubstractTenFromTwenty(){
        int answer = 20-10;
        assertEquals("20-10", 10, answer);
    }
}
