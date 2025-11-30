package DAO;

import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;

import model.Itens_vednas;

public class CrudItens_vendasDAO implements CrudDAO<Itens_vednas> {
     private Connection connection;

    public CrudItens_vendasDAO(Connection connection) {
        this.connection = connection;
    }
    @Override
    public void inserir(Itens_vednas obj) {
       String sql = "INSERT INTO itens_venda (idVenda, idProduto, quantidade, precoUnitario) VALUES (?, ?, ?, ?)";
        try (var stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, obj.getIdVenda());
            stmt.setInt(2, obj.getIdProduto());
            stmt.setInt(3, obj.getQuantidade());
            stmt.setDouble(4, obj.getPrecoUnitario());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Itens_vednas obj) {
        String sql = "UPDATE itens_venda SET idVenda = ?, idProduto = ?, quantidade = ?, precoUnitario = ? WHERE id = ?";
        try (var stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, obj.getIdVenda());
            stmt.setInt(2, obj.getIdProduto());
            stmt.setInt(3, obj.getQuantidade());
            stmt.setDouble(4, obj.getPrecoUnitario());
            stmt.setInt(5, obj.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM itens_venda WHERE id = ?";
        try (var stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Itens_vednas> listarTodos() {
    String sql = "SELECT * FROM itens_venda";
    List<Itens_vednas> lista = new ArrayList<>();
    try (var stmt = connection.prepareStatement(sql);
        var rs = stmt.executeQuery()) {
        while (rs.next()) {
           Itens_vednas item = new Itens_vednas();
           item.setId(rs.getInt("id"));
           item.setIdVenda(rs.getInt("idVenda"));
           item.setIdProduto(rs.getInt("idProduto"));
           item.setQuantidade(rs.getInt("quantidade"));
           item.setPrecoUnitario(rs.getDouble("precoUnitario"));
           lista.add(item);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

        return lista;
    }
    
}
