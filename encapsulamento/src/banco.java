/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class banco {
    public static void main(String[] args) {
        conta cc = new conta("marcelo", 1000, 1234);
        cc.verificarSaldo();
        cc.trocarSenha();
        cc.verificarSaldo();

    }
    
    
}
