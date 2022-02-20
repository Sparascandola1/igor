package com.api.igor.data.dataModling;

import java.util.List;

/**
 * @author Salvatore Parascandola
 * @version 1.0
 */
public interface DataAccessInterface<T> {

    public List<T> findAll();

    public T findById(Long id);

    public int create(T t);

    public int update(T t);

    public int delete(T t);
}
