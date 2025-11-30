package DAO;

import java.util.List;

public interface CrudDAO<T> {
    void inserir(T obj);
    void atualizar(T obj);
    void deletar(int id);
    List<T> listarTodos();
}



