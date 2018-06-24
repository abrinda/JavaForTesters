package com.javafortesters.arrays.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ArraysExamples {

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    String days = "";

    int[][] multi = {{1,2,3,4},
            {4,5,6,7},
            {8,9,10,11},
            {12,13,14,15}};

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
    public void copyOfToAddMoreDays() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 7);
        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";

        assertEquals("Saturday", weekDays[5]);
        assertEquals("Sunday", weekDays[6]);
    }

    @Test
    public void copyOfToTruncateTheDays(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 3);

        assertEquals(3, weekDays.length);
    }

    @Test
    public void copyOfRangeWeekDays(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] weekDays;
        weekDays = Arrays.copyOfRange(workdays, 2, 5);

        assertEquals(3, weekDays.length);
        assertEquals(workdays[2], weekDays[0]);
        assertEquals(workdays[3], weekDays[1]);
        assertEquals(workdays[4], weekDays[2]);
        assertEquals("Wednesday", weekDays[0]);
        assertEquals("Friday", weekDays[2]);
    }

    @Test
    public void sortItemsInAnArray(){
        int[] outOfOrder = {2,1,4,3,5};
        Arrays.sort(outOfOrder);

        assertEquals(outOfOrder[0], 1);
        assertEquals(outOfOrder[1], 2);
        assertEquals(outOfOrder[4], 5);
    }

    @Test
    public void fillItemsInAnArray(){
        int[] tenItems = {0,0,0,0,0,1,1,1,1,1};
        Arrays.fill(tenItems,2,7,2);

        assertEquals(tenItems[3], 2);
    }

    @Test
    public void sortWorkDaysArray(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workdays);

        assertEquals(workdays[0], "Friday");


        System.out.println(Arrays.toString(workdays));
    }

    @Test
    public void sortWorkDaysArrayWithLowercase(){
        String[] workdays = {"monday", "Tuesday", "wednesday", "Thursday", "friday"};
        Arrays.sort(workdays);

        assertEquals(workdays[1], "Tuesday");//prima data sorteaza cele cu uppercase

        System.out.println(Arrays.toString(workdays));
    }

    @Test
    public void regularMultiDimensionalArray(){
        int[][] multi = new int[4][4];

        assertEquals(4, multi.length);

        System.out.println(Arrays.deepToString(multi));
    }

    @Test
    public void regularMultiDimensionalArray_partTwo(){
        int[][] multi = {{1,2,3,4},
                {4,5,6,7},
                {8,9,10,11},
                {12,13,14,15}};

        assertEquals(1, multi[0][0]);
        assertEquals(11, multi[2][3]);
    }

    @Test
    public void raggedArrays(){
        int[][] ragged = {{1,2,3},
                {4,5},
                {6,7,8,9}};

        assertEquals(4, ragged[1][0]);
    }

    //excercises
    @Test
    public void createTriangle2DArray(){
        int[][] triangle = new int [16][];
        for(int row=0; row<triangle.length; row++) {
            triangle[row] = new int[row + 1];
            for (int i=0;i<(row+1);i++){
                triangle[row][i]=i;
            }
        }
        print2DIntArray(triangle);
    }

    public void print2DIntArray(int[][] triangle) {
        for(int[] outer : multi){
            if (outer==null){
                System.out.println("null");
            }else{
                for(int inner : outer){
                    System.out.println(inner + ",");
                }
            }
            System.out.println("");
        }
    }
}
