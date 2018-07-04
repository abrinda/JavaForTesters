package com.javafortesters.introducinginheritance;

import com.javafortesters.domainentities.User;

public class ReadOnlyUser extends User {

    @Override
    public String getPermission(){
        return "ReadOnly";
    }
}
