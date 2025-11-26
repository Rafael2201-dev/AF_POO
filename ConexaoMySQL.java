import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySQL {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/loja"; 
        String user = "root";        // coloque seu usuário
        String password = "2201"; // coloque sua senha

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem-sucedida!");

            conn.close();
        } catch (Exception e) {
            System.out.println("Erro ao conectar:");
            e.printStackTrace();
        }
    }
}

