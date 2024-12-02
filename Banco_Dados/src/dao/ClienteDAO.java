package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import utilitarios.Conexao;

public class ClienteDAO {
    public void cadastrar(Cliente cliente) {
        Connection conexao = Conexao.obterConexao();
        try {
            String sql = "INSERT INTO cliente (nome, telefone, endereco, email) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getTelefone());
            pst.setString(3, cliente.getEndereco());
            pst.setString(4, cliente.getEmail());
            pst.execute();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> listar(String pesquisa) {
        Connection conexao = Conexao.obterConexao();
        List<Cliente> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM cliente WHERE nome LIKE ?";
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, pesquisa + "%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(rs.getInt("codigo"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setEmail(rs.getString("email"));
                lista.add(cliente);
            }
            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public void alterar (Cliente cliente) {
    Connection conexao = Conexao.obterConexao () ;
    try {
    String sql = "update cliente set nome =? , telefone =? , endereco =? , email =? where codigo =? ";
    PreparedStatement pst = conexao.prepareStatement (sql) ;
    pst.setString (1, cliente. getNome () );
    pst.setString (2, cliente.getTelefone () );
    pst.setString (3, cliente.getEndereco () );
    pst.setString (4, cliente.getEmail());
    pst.setInt (5, cliente.getCodigo () );
    pst.execute () ;
    pst.close () ;
    } catch (Exception e) {
    e.printStackTrace () ;

    }
    }//fim alterar

    public void excluir (int codigo){
    Connection conexao = Conexao. obterConexao () ;
    try {
    String sql = "delete from cliente where codigo =? ";
    PreparedStatement pst = conexao.prepareStatement (sql) ;
    pst.setInt (1, codigo) ;
    pst.execute () ;
    pst.close () ;
    } catch (Exception e) {
    e.printStackTrace () ;

    }//fim excluir
    }
}
