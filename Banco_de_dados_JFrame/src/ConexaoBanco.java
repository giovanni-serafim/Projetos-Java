import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    public static Connection connect() {
        String url = "jdbc:mysql://localhost:3306/agenda"; // Nome do banco de dados
        String usuario = "root"; // Seu usuário do MySQL
        String senha = "root"; // Sua senha do MySQL
        
        try {
            // Carrega o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão bem-sucedida!");
            return conn;
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado!");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados!");
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args) {
        // Testando a conexão
        Connection conexao = connect();
        if (conexao != null) {
            System.out.println("Tudo funcionando corretamente!");
        }
    }
}
