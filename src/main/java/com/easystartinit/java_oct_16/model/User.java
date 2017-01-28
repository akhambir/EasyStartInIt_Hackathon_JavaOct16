package com.easystartinit.java_oct_16.model;

import java.util.HashSet;
import java.util.Set;

public class User {

    private String username;
    private String password;
    private String email;
    private Boolean enabled;
    private Set<UserRoles> userRoles = new HashSet<UserRoles>(0);


}
