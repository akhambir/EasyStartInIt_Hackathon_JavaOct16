package com.easystartinit.java_oct_16.dao;

import com.easystartinit.java_oct_16.dao.interfaces.UserDao;
import com.easystartinit.java_oct_16.model.User;
import com.easystartinit.java_oct_16.model.UserRoles;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDaoImpl extends AbstractDao<User> implements UserDao {

    public User read(Class<User> tClass, String username) {
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.get(tClass, username);
        session.flush();
        return user;
    }

    public UserRoles createStandardRole(User user) {
        UserRoles userRoles = new UserRoles();
        userRoles.setUser(user);
        userRoles.setRole("ROLE_USER");
        Session session = sessionFactory.getCurrentSession();
        session.save(userRoles);
        session.flush();
        return userRoles;
    }
}
