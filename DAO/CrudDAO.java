package DAO;

public interface CrudDAO<T> {
    void create(T objeto);
    T read(int id);
    void update(T objeto);
    void delete(int id);
}


