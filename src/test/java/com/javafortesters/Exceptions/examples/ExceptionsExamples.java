package com.javafortesters.Exceptions.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExceptionsExamples {

    @Test
    public void throwANullPointerException(){
        Integer age = null;
        String ageAsString = age.toString();

        String yourAge = "You are " + ageAsString + " years old";

        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void catchANullPointerException(){
        Integer age = null;
        String ageAsString;

        try{
            ageAsString = age.toString();
        }catch (NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        }
        String yourAge = "You are " + ageAsString + " years old";

        assertEquals("You are 18 years old", yourAge);
    }

    @Test//excercise
    public void useOfADifferentException(){
        Integer age = null;
        String ageAsString;

        try{
            ageAsString = age.toString();
        }catch (NullPointerException e){
            age = 18;
            ageAsString = age.toString();
            System.out.println("getMessage - " + e.getMessage());
        }
        String yourAge = "You are " + ageAsString + " years old";

        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void catchMoreThanOneException(){
        Integer age = null;
        String ageAsString;
        try{
            ageAsString = age.toString();
        }catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }
//        }catch (IllegalArgumentException e){
//            System.out.println("Illegal argument: " + e.getMessage());
//        }
        String yourAge = "You are " + ageAsString + " years old";

        assertEquals("You are 18 years old", yourAge);
    }

/*
    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionExpected(){
        Integer age = null;
        age.toString();
    }

    public ExceptionsExamples(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    public void setPassword(String password) {
        if(password.length()<7){
            throw new IllegalArgumentException("Password must be > 6 char long");
        }
        this.password = password;
    }

    public String password;
    public String username;
*/

    @Test
    public void tryCatchFinallyNullPointerException(){
        Integer age = null;
        String ageAsString;
        String yourAge = "";

        try {
            ageAsString = age.toString();
        }catch (NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        }finally {
            yourAge = "You are " + age.toString() + " years old.";
        }

        assertEquals("You are 18 years old.", yourAge);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exampleTryCatchFinally(){
        Integer age = null;

        try{
            System.out.println("1. generate a null pointer exception");
            System.out.println(age.toString());
        }catch (NullPointerException e){
            System.out.println("2. handle null pointer exception");
            throw new IllegalArgumentException("Null pointer exception became Illegal", e);
        }finally {
            System.out.println("3. run code in finally section");
        }
    }
}
