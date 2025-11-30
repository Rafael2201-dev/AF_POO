import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySQL {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/loja"; 
        String user = "root";        // coloque seu usuário
        String password = "2201"; // coloque sua senha
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem-sucedida!");

            return conn;
        } catch (Exception e) {

            System.out.println("Erro ao conectar:");
            e.printStackTrace();

            return null;

        }
    }
}

