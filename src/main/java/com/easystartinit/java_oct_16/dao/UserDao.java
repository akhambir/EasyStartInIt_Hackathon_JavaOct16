package com.easystartinit.java_oct_16.dao;

import com.easystartinit.java_oct_16.model.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDao extends AbstractDao<User> {

    public User read(Class<User> tClass, String username) {
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.get(tClass, username);
        session.flush();
        return user;
    }
}
