package com.javafortesters.collections.examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class CollectionsExamples {

    String[] someDays = {"Tuesday", "Thursday", "Wednesday", "Monday", "Saturday", "Sunday", "Friday"};
    List<String> days = Arrays.asList(someDays);

    @Test
    public void simpleArrayExample() {
        String[] number0123 = {"zero", "one", "two", "three"};

        for (String numberText : number0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", number0123[0]);
        assertEquals("two", number0123[2]);
    }

    @Test
    public void simpleCollectionExample() {
        String[] number0123Array = {"zero", "one", "two", "three"};
        List<String> number0123 = Arrays.asList(number0123Array);
        for (String numberText : number0123) {
            System.out.println(numberText);
        }
        assertEquals("zero", number0123.get(0));
        assertEquals("three", number0123.get(3));
    }

    @Test
    public void simpleDynamicCollectionExample() {
        List<String> number0123 = new ArrayList<String>();

        number0123.add("zero");
        number0123.add("one");
        number0123.add("two");
        number0123.add("three");

        for (String numberText : number0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", number0123.get(0));
        assertEquals("three", number0123.get(3));
    }

    @Test
    public void simpleForEachLoopExample() {
        int forcount = 0;
        for (String day : days) {
            if (day.equals("Monday")) {
                break;
            }
            forcount++;

            assertEquals("Monday is at position 3", 3, forcount);
        }
    }

    @Test
    public void simpleForLoopExample(){
        int loopCount = 0;
        for (loopCount=0; loopCount <= days.size();loopCount++){
            if (days.get(loopCount).equals("Monday")){
                break;
            }
            assertEquals("Monday is at position 3", 3, loopCount);
        }
    }

    @Test
    public void simpleWhileLoopExample(){
        int count=0;
        while (!days.get(count).equals("Monday")){
            count++;
        }

        assertEquals("Monday is at position 3", 3, count);
    }

    @Test
    public void simpleDoWhileExample(){
        int docount=-1;
        do{
            docount++;
        }while (!days.get(docount).equals("Monday"));

        assertEquals("Monday is at position 3", 3, docount);
    }
}