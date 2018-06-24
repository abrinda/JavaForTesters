package com.javafortesters.arrays.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ArraysExamples {

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    String days = "";

    @Test
    public void simpleArrayExample(){
        String[] number0123 = {"zero", "one", "two", "three"};

        for(String numberText : number0123){
            System.out.println(numberText);
        }

        assertEquals("zero", number0123[0]);
        assertEquals("three", number0123[3]);
    }


    int[] integers = new int[10];
    int []moreInts = new int[10];
    int evenMore[] = new int[10];

    String strings[] = new String[10];

    int[] insts1to10 = {1,2,3,4,5,6,7,8,9,10}; //array with actual values
    int[] zeroLength = {}; //empty array
    int[] moreZeroLenght = new int[0]; //empty array with 0
    int[] unitializedArray; //array with later initialization

    @Test
    public void workdaysArray() {
        assertEquals("Monday", workdays[0]);
        assertEquals("Friday",workdays[4]);
    }

    @Test
    public void createAnArrayOfUsers(){
        User[] users = new User[3];

        users[0] = new User("bob","pass4bob");
        users[1] = new User("jon", "pass4jon");
        users[2] = new User("ella", "pass4ella");

        assertEquals("bob", users[0].getUsername());
        assertEquals("jon", users[1].getUsername());
        assertEquals("ella", users[2].getUsername());
    }

    @Test
    public void workdayIterateArray() {
        for (String workday : workdays) {
            days = days + "|" + workday;
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void forLoopsUsingIndexFixedCondition(){
        for(int i=0; i<5; i++){
            days = days + "|" + i + "-" + workdays[i];
        }

        assertEquals("|0-Monday|1-Tuesday|2-Wednesday|3-Thursday|4-Friday", days);
    }

    @Test
    public void indexInForEachLoop(){
        int dayindex = 0;
        for(String workday : workdays){
            days = days + "|" + workday;
            System.out.println("found " + workday + " at position " + dayindex);
            dayindex++;
        }
    }

    @Test
    public void anArrayOf100Users(){
        User[] users = new User[100];

        for(int userIndex=0; userIndex<100; userIndex++){
            int userId = userIndex + 1;
            users[userIndex] = new User("user" + userId,
                    "password" + userId);
        }

        for (User aUser:users) {
            System.out.println(aUser.getUsername() + ", " + aUser.getPassword());
        }
    }

    @Test
    public void lenghtAssert(){
        assertEquals(5, workdays.length);
    }

    @Test
    public void forLoopInLenghtMethod(){
        for(int i=0; i<workdays.length; i++){
            days = days + "|" + workdays;
        }
    }

    @Test
    public void weekDays() {
        String[] weekDays = new String[0];
        Arrays.copyOf(workdays, 7);
        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";
        
    }
}
