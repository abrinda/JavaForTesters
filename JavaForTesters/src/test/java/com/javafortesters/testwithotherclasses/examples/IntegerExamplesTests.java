package com.javafortesters.testwithotherclasses.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class IntegerExamplesTests {

    @Test
    public void integerExploration(){
        Integer four = new Integer(4);
        assertEquals("intValue returns four", 4,
                four.intValue());

        Integer six = 6;
        assertEquals("intValue returns six", 6,
                six.intValue());
    }

    @Test
    public void canConvertAnIntToHex(){
        assertEquals("11 becomes b", "b",
                Integer.toHexString(11));

        assertEquals("10 becomes a", "a",
                Integer.toHexString(10));

        assertEquals("3 is 3", "3",
                Integer.toHexString(3));

        assertEquals("21 becomes 15", "15",
                Integer.toHexString(21));
    }

    @Test
    public void minAndMaxValuesAreCorrect(){
        assertEquals("max value is 2147483647", 2147483647,
                Integer.MAX_VALUE);

        assertEquals("min value is -2147483648", -2147483648,
                Integer.MIN_VALUE);
    }
}
