/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ClienteDAO;
import java.util.List;
import model.Cliente;
import java.util.List;

public class ClienteController {
    
ClienteDAO clienteDAO = new ClienteDAO();

public ClienteController(){
}
public void cadastrar (String nome, String telefone, String endereco, String email) {
Cliente cliente = new Cliente () ;
cliente.setNome (nome) ;
cliente.setTelefone (telefone) ;
cliente.setEndereco (endereco);
cliente.setEmail (email) ;
clienteDAO.cadastrar (cliente);
}
public List<Cliente> listar (String pesquisa) {
return clienteDAO.listar (pesquisa) ;
}
public void alterar (int codigo, String nome, String telefone, String endereco, String email) {
Cliente cliente = new Cliente () ;
cliente.setCodigo (codigo);
cliente.setNome (nome) ;
cliente.setTelefone (telefone);
cliente.setEndereco (endereco);
cliente.setEmail (email);
clienteDAO.alterar (cliente);
}
public void excluir (int codigo) {
clienteDAO.excluir (codigo);
}
}
