package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Vendas;

public class CrudVendasDAO implements CrudDAO<Vendas> {

    private Connection connection;

    public CrudVendasDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void inserir(Vendas venda) {
        String sql = "INSERT INTO vendas (idCliente, data_venda, valor_total) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, venda.getIdCliente());
            stmt.setDouble(2, venda.getData_venda());
            stmt.setDouble(3, venda.getValor_total());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Vendas venda) {
        String sql = "UPDATE vendas SET idCliente = ?, data_venda = ?, valor_total = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, venda.getIdCliente());
            stmt.setDouble(2, venda.getData_venda());
            stmt.setDouble(3, venda.getValor_total());
            stmt.setInt(4, venda.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM vendas WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Vendas> listarTodos() {
        List<Vendas> lista = new ArrayList<>();
        String sql = "SELECT * FROM vendas";

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Vendas v = new Vendas();
                v.setId(rs.getInt("id"));
                v.setIdCliente(rs.getInt("idCliente"));
                v.setData_venda(rs.getDouble("data_venda"));
                v.setValor_total(rs.getDouble("valor_total"));
                lista.add(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
