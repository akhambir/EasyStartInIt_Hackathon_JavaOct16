package com.easystartinit.java_oct_16.dao;

import com.easystartinit.java_oct_16.dao.interfaces.GenericDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AbstractDao<T> implements GenericDao<T> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public T create(T t) {
        Session session = sessionFactory.getCurrentSession();
        session.save(t);
        session.flush();
        return t;
    }

    @Override
    public T read(Class<T> tClass, Long id) {
        Session session = sessionFactory.getCurrentSession();
        T t = (T) session.get(tClass, id);
        session.flush();
        return t;
    }

    @Override
    public T update(T t) {
        Session session = sessionFactory.getCurrentSession();
        session.update(t);
        session.flush();
        return t;
    }

    @Override
    public T delete(T t) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(t);
        session.flush();
        return t;
    }

    @Override
    public List<T> readAll(Class<T> tClass) {
        return (List<T>) sessionFactory.getCurrentSession().createCriteria(tClass).list();
    }
}