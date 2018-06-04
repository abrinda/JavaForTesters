package com.javafortesters.selectionsanddecisions.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class SelectionsExamples {


    private String addHttp(String url) {
        return "http://" + url;
    }


    @Test
    public void moreTernary(){
        String url = "www.eviltester.com" ;

        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    @Test
    public void catOrCats(){
        int numberOfCats = 1;
        assertEquals("1 == cat", "cat", (numberOfCats ==1) ? "cat" : "cats");

        numberOfCats = 2;
        assertEquals("0 == cats", "cats", (numberOfCats == 0) ? "cat" : "cats");

        numberOfCats = 3;
        assertEquals("2 == cats", "cats", (numberOfCats == 1) ? "cat" : "cats");
    }

    @Test
    public  void catOrCatsMethod() {
        assertEquals("1 == cat", "cat", catOrCats(1));

        assertEquals("0 == cats", "cats", catOrCats(0));

        assertEquals("2 == cats", "cats", catOrCats(2));
    }
        private String catOrCats(int numberOfCats){
            return (numberOfCats == 1) ? "cat" : "cats";
    }

    @Test
    public void ifAddHttp(){
            String url = "www.seleniumsimplified.com";
            if(!url.startsWith("http")){
                url = addHttp(url);
            }

            assertTrue(url.startsWith("http://"));
            assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void thruthyTrue(){
        boolean thruthy = true;
        if (thruthy)
            assertTrue(thruthy);

        if (thruthy){
            assertTrue(thruthy);
            assertFalse(!thruthy);
        }
    }

    @Test
    public void ifElseAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(url.startsWith("http")){
            //it's ok
        } else {
            addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }
}
