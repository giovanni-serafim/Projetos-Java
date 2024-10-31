/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *classe para implementar os métodos da interface pizza
 * @author Giovanni Serafim
 */
public class Marguerita implements Pizza{

    @Override
    public void montar() {
        System.out.println("pizza marguerita");
        System.out.println("molho de tomate, queijo, tomate, manjericão, orégano");
    }

    @Override
    public void assar() {
        System.out.println("15 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 45,00");
    }
    
    
    
}
