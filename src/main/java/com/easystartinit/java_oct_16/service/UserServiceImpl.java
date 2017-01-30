package com.easystartinit.java_oct_16.service;

import com.easystartinit.java_oct_16.dao.interfaces.UserDao;
import com.easystartinit.java_oct_16.model.User;
import com.easystartinit.java_oct_16.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User addUser(User user) {
        User addedUser = userDao.create(user);
        userDao.createStandardRole(user);
        return addedUser;
    }

    @Override
    public User getByName(String userName) {
        return userDao.read(User.class, userName);
    }
}
