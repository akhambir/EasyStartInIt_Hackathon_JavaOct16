package com.easystartinit.java_oct_16.dao.interfaces;

import java.util.List;

public interface GenericDao<T> {

    T create(T t);

    T read(Class<T> t, Long id);

    T update(T t);

    T delete(T t);

    List<T> readAll(Class<T> t);

}
