package com.javafortesters.introducinginheritance.examples;

import com.javafortesters.domainentities.User;
import com.javafortesters.introducinginheritance.AdminUser;
import com.javafortesters.introducinginheritance.EmptyUser;
import com.javafortesters.introducinginheritance.ReadOnlyUser;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InheritanceExamples {

    @Test
    public void emptyUserExamplesTest(){
        EmptyUser enu = new EmptyUser();
        assertEquals("username", enu.getUsername());
        assertEquals("password", enu.getPassword());
    }

    @Test
    public void aUserHasNormalPermissions(){
        User aUser = new User();
        assertEquals("Normal", aUser.getPermission());
    }

    @Test
    public void anAdminUserDefaultConstructor(){
        AdminUser adminUser = new AdminUser();
        assertEquals("adminuser", adminUser.getUsername());
        assertEquals("password", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }

    @Test
    public void anAdminUserHasElevatedPermissions(){
        AdminUser adminUser = new AdminUser();
        assertEquals("admin", adminUser.getUsername());
        assertEquals("Passw0rd", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }

    @Test
    public void aReadOnlyUserHasLimitedPermissions(){
        ReadOnlyUser readOnlyUser = new ReadOnlyUser();
        assertEquals("ReadOnly", readOnlyUser.getPermission());
    }
}
