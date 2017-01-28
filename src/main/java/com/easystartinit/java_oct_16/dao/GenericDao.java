package com.easystartinit.java_oct_16.dao;

public interface GenericDao<T> {

    T create(T t);
    T read(Class<T> t, String name);
    T update(T t);
    T delete(T t);
    T readAll(Class<T> t);

}
