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

    @Test
    public void ifElseOnThruthy(){
        boolean thruthy = true;
        if (thruthy)
            assertTrue(thruthy);
        else
            assertFalse(thruthy);
    }

    @Test
    public void ifElseOnThruthyBraces(){
        boolean thruthy=true;
        if (thruthy){
            assertTrue(thruthy);
            assertFalse(!thruthy);
        }else{
            assertFalse(thruthy);
        }
    }

    @Test
    public void ifElseNestedAddHttp(){
        String url = "seleniumsimplified.com";
        if (url.startsWith("http")){
            //do nothing, the url is fine
        }else{
            if (!url.startsWith("www")){
                url="www." + url;
            }
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void nestedIfElseHorror(){
        boolean truthy=true;
        boolean falsey=false;
        if (truthy){
            if(!falsey){
                if(truthy && !falsey){
                    if (falsey || truthy){
                        assertTrue(truthy);
                        assertFalse(falsey);
                    }
                }
            }else {
                assertTrue(truthy);
                assertFalse(falsey);
            }
        }else{
            if(!truthy){
                if (falsey){
                    assertTrue(falsey);
                    assertFalse(truthy);
                }else{
                    assertTrue(truthy);
                    assertFalse(falsey);
                }
            }
        }
    }

    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    public String likelyGenderIs(String title){
        String likelyGender;

        switch(title.toLowerCase()){
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }

    @Test
    public void switchOnShortCode(){
        assertEquals("United Kingdom", shortCodeIs("UK"));
        assertEquals("United States", shortCodeIs("US"));
        assertEquals("United States", shortCodeIs("USA"));
        assertEquals("France", shortCodeIs("FR"));
        assertEquals("Sweden", shortCodeIs("SE"));
        assertEquals("Rest Of World", shortCodeIs("RO"));
        assertEquals("Rest Of World", shortCodeIs("MD"));
        assertEquals("Rest Of World", shortCodeIs("CZ"));
        assertEquals("Rest Of World", shortCodeIs("ES"));
        assertEquals("Rest Of World", shortCodeIs("POR"));
    }

    public String shortCodeIs(String shortCode){
        String country;

        switch(shortCode.toUpperCase()){
            case "UK":
                country = "United Kingdom";
                break;
            case "US":
            case "USA":
                country = "United States";
                break;
            case "FR":
                country = "France";
                break;
            case "SE":
                country = "Sweden";
                break;
            default:
                country = "Rest Of World";
                break;
        }

        return country;
    }

    @Test
    public void switchOnInt(){
        assertEquals("One", numberIs(1));
        assertEquals("Two", numberIs(2));
        assertEquals("Three", numberIs(3));
        assertEquals("Four", numberIs(4));
        assertEquals("Too big", numberIs(9));
        assertEquals("Too big", numberIs(Integer.MAX_VALUE));
        assertEquals("Too small", numberIs(0));
        assertEquals("Too small", numberIs(Integer.MIN_VALUE));
    }

    public String numberIs(int number){
        String howIsTheNumber="";

        switch(number){
            case 1:
                howIsTheNumber="One";
                break;
            case 2:
                howIsTheNumber="Two";
                break;
            case 3:
                howIsTheNumber="Three";
                break;
            case 4:
                howIsTheNumber="Four";
                break;
            default:
                if (number<1){
                    howIsTheNumber= "Too small";
                }
                if (number>4){
                    howIsTheNumber= "Too big";
                }
                break;
        }

        return howIsTheNumber;
    }
}
