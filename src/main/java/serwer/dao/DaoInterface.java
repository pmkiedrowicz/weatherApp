package serwer.dao;

import java.util.List;

public interface DaoInterface<T> {
    public T save(T entity);

    public void update(T entity);

    public T findByName(String name);

    public void delete(T entity);

    public List<T> findAll();

    public void deleteAll();
}
