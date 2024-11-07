package pacote;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class Cadastro {
    

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
    
    public void alterarCadastro(String id, String nome, String email, String telefone) {
    try {
        // Conectar ao banco de dados (substitua com suas credenciais)
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "usuario", "senha");

        // Query de update
        String sql = "UPDATE sua_tabela SET nome = ?, email = ?, telefone = ? WHERE id = ?";

        // Preparar a query
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, email);
        stmt.setString(3, telefone);
        stmt.setString(4, id);  // O ID do registro a ser alterado

        // Executa o update
        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Registro atualizado com sucesso.");
        } else {
            System.out.println("Nenhum registro encontrado com o ID fornecido.");
        }

        // Fechar a conexão
        stmt.close();
        con.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    // Método para carregar os dados na tabela
public DefaultTableModel carregarDados() {
    // Cria o modelo da tabela com as colunas desejadas
    DefaultTableModel modeloTabela = new DefaultTableModel();
    modeloTabela.addColumn("ID");
    modeloTabela.addColumn("Nome");
    modeloTabela.addColumn("Email");
    modeloTabela.addColumn("Telefone");
    
    // Aqui você deve obter os dados do seu banco de dados ou outra fonte de dados
    // Exemplo simples de como os dados poderiam ser adicionados (usando dados fixos)
    // Substitua esse código pelos dados reais da sua aplicação
    Object[] linha1 = {1, "João", "joao@gmail.com", "123456789"};
    Object[] linha2 = {2, "Maria", "maria@gmail.com", "987654321"};
    
    // Adiciona as linhas ao modelo da tabela
    modeloTabela.addRow(linha1);
    modeloTabela.addRow(linha2);

    // Retorna o modelo preenchido
    return modeloTabela;
}

    
    

    public static void main(String[] args) {
        // Testando inserção de dados
        Cadastro cadastro = new Cadastro();
    }
}
