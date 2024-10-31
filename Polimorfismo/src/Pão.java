/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class Pão implements Pizza{
    
    @Override
    public void montar() {
        System.out.println("farinha, ovos, leite, manteiga e fermento");
    }

    @Override
    public void assar() {
        System.out.println("50 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 12,00");
    }
    
}
