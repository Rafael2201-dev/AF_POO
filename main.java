import java.sql.Connection;
import java.sql.DriverManager;
import model.*;
import DAO.*;



class main{
    public static void main (String args[]){
        Connection conn = ConexaoMySQL.getConnection();

            if(conn != null){
    //    CrudClienteDAO DAOCliente = new CrudClienteDAO(conn);

    //    Cliente c1 = new Cliente("akaza", "akazalua3@gmail.com", "11987654321", "Rua dos Demônios, 123");

    //    DAOCliente.inserir(c1);
    //      System.out.println("Cliente inserido com sucesso!");

                CrudProdutoDAO DAOProduto = new CrudProdutoDAO(conn);

                Produto p1 = new Produto("espada nichirim", 299.99, "Katanas SA", "Armas", "Espada Nichirin de alta qualidade");

                DAOProduto.inserir(p1);
                System.out.println("Produto inserido com sucesso!");
            }
            else{
                System.out.println("não foi possível conectar ao banco de dados.");
            }
    }
}