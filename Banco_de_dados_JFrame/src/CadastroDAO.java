/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CadastroDAO {
    

    public void inserirCadastro(String nome, String email, String telefone) {
        String sql = "INSERT INTO cadastro (nome, email, telefone) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoBanco.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, telefone);

            stmt.executeUpdate();
            System.out.println("Cadastro inserido com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados no banco!");
            e.printStackTrace();
        }
    }
    
    
    public void removerCadastro(int id) {
    String sql = "DELETE FROM cadastro WHERE id = ?"; // SQL para deletar um usuário baseado no ID

    try (Connection conn = ConexaoBanco.connect(); // Obtém a conexão com o banco de dados
         PreparedStatement stmt = conn.prepareStatement(sql)) { // Prepara o comando SQL

        stmt.setInt(1, id); // Substitui o '?' no SQL pelo ID fornecido

        int linhasAfetadas = stmt.executeUpdate(); // Executa o comando SQL (DELETE) e retorna o número de registros afetados
        if (linhasAfetadas > 0) {
            System.out.println("Usuário removido com sucesso!"); // Se uma ou mais linhas foram afetadas, a remoção foi bem-sucedida
        } else {
            System.out.println("Nenhum usuário encontrado com esse ID."); // Se nenhuma linha foi afetada, significa que não encontrou o ID
        }
    } catch (SQLException e) {
        // Caso haja algum erro ao tentar remover o registro, ele será capturado aqui
        System.out.println("Erro ao remover usuário: " + e.getMessage());
    }
}
    

    public static void main(String[] args) {
        // Testando inserção de dados
        CadastroDAO cadastro = new CadastroDAO();
        cadastro.inserirCadastro("giovanni serafim", "joka@example.com", "11923422342");
    }
}
