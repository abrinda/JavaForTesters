package com.javafortesters.domainentities;

import com.javafortesters.domainobject.TestAppEnv;
import com.javafortesters.introducinginheritance.InvalidPassword;

public class User {

    InvalidPassword invalidPassword;
    public String username;
    public String password;

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public User(){
       this("username", "password");
    }


    public User(String username, String password) throws IllegalArgumentException {
        this.username = username;
        try{
            setPassword(password);
        }catch(InvalidPassword e){
            throw new IllegalArgumentException(
                    "default password incorrect", e);
        }
    }

    public void setPassword(String password) throws InvalidPassword{
        if(password.length()<7){
            throw new InvalidPassword("Pass must be at least 7 characters long");
        }

        this.password = password;
    }

    public String getUrl(){
        return TestAppEnv.getUrl();
    }

    public String getPermission(){
        return "Normal";
    }

    public void ExceptionsExamples(String username, String password) throws InvalidPassword {
        this.username = username;
        setPassword(password);
    }

}
