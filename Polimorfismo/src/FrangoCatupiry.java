/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Giovanni Serafim
 */
public class FrangoCatupiry implements Pizza{

    @Override
    public void montar() {
        System.out.println("pizza Frando com Catupiry");
        System.out.println("molho de tomate, Frango, catupiry, orégano");
    }

    @Override
    public void assar() {
        System.out.println("25 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 40,00");
    }
    
}
