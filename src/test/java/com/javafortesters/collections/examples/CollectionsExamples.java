package com.javafortesters.collections.examples;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class CollectionsExamples {

    @Test
    public void simpleArrayExample(){
        String[] number0123 ={"zero", "one", "two","three"};

        for (String numberText : number0123){
            System.out.println(numberText);
        }

        assertEquals("zero", number0123[0]);
        assertEquals("two", number0123[2]);
    }

    @Test
    public void simpleCollectionExample(){
        String[] number0123Array = {"zero", "one", "two","three"};
        List<String> number0123 = Arrays.asList(number0123Array);
        for(String numberText : number0123){
            System.out.println(numberText);
        }
        assertEquals("zero", number0123.get(0));
        assertEquals("three", number0123.get(3));
    }
}
