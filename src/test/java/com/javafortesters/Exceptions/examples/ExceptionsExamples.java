package com.javafortesters.Exceptions.examples;

import com.javafortesters.domainentities.User;
import com.javafortesters.introducinginheritance.InvalidPassword;
import org.junit.Test;

import static junit.framework.TestCase.*;

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

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionExpected(){
        Integer age = null;
        age.toString();
    }

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

    @Test
    public void canCreateDefaultUserWithoutHandlingException(){
        User aUser = new User();
        assertEquals("username", aUser.getUsername());
        assertEquals("password", aUser.getPassword());
    }

    @Test
    public void haveToCatchIllegalPasswordForParamConstructor(){
        User aUser = new User("me","wrong");
        fail("An exception should have been thrown");
    }

    @Test(expected = InvalidPassword.class)
    public void constructorUserWithException() throws InvalidPassword{
        User aUser = new User("username", "p");
    }

    @Test
    public void createUserWithInvalidPasswordExceptionMessage(){
        User aUser;

        aUser = new User("username", "p");
        fail("An invalid password exception has been thrown");
    }

}
