package com.easystartinit.java_oct_16.service.interfaces;

import com.easystartinit.java_oct_16.model.Product;
import com.easystartinit.java_oct_16.model.User;

import java.util.List;

public interface UserService {

    User addUser(User user);

    User getByName(String userName);

    User update(User user);
    //UserBucket getBucketByUserName(User user);
    //Double getTotalPrice(List<Products> list);

}
