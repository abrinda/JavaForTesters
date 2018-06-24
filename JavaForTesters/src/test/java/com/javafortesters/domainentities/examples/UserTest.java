package com.javafortesters.domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();

        assertEquals("Default username expected", "username",
                user.getUsername());

        assertEquals("default password expected", "password",
                user.getPassword());
    }

    @Test
    public void canAccessPublicCredentials(){
        User auser = new User();

        auser.username = "bob";
        assertEquals("not default username", "bob",
        auser.username);
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User ("admin", "passw0rd");

        assertEquals("given username expected", "admin",
                user.getUsername());

        assertEquals("given password expected", "passw0rd",
                user.getPassword());
    }

    @Test
    public void canSetPasswordAfterContructed(){
        User user = new User();

        user.setPassword("pazzw0rd");
        assertEquals("setter password changed", "pazzw0rd",
                user.getPassword());
    }

}
