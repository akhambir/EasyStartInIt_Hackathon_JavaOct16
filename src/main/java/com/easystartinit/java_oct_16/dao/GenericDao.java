package com.easystartinit.java_oct_16.dao;

import java.util.List;

public interface GenericDao<T> {

    T create(T t);
    T read(Class<T> t, Integer id);
    T update(T t);
    T delete(T t);
    List<T> readAll(Class<T> t);

}
