package com.easystartinit.java_oct_16.dao.interfaces;

import com.easystartinit.java_oct_16.model.User;
import com.easystartinit.java_oct_16.model.UserRoles;

public interface UserDao extends GenericDao<User> {

    User read(Class<User> tClass, String username);

    UserRoles createStandardRole(User user);
}
