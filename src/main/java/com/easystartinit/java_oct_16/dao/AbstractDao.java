package com.easystartinit.java_oct_16.dao;

public class AbstractDao<T> implements GenericDao<T> {

    @Override
    public T create(T t) {
        return null;
    }

    @Override
    public T read(Class<T> t, String name) {
        return null;
    }

    @Override
    public T update(T t) {
        return null;
    }

    @Override
    public T delete(T t) {
        return null;
    }

    @Override
    public T readAll(Class<T> t) {
        return null;
    }
}
