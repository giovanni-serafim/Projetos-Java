/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Giovanni Rafael
 */
public class Portuguesa implements Pizza{

    @Override
    public void montar() {
        System.out.println("molhode tomate, presunto, ovo, cebola, ervilha, palmito e mussarela");
    }

    @Override
    public void assar() {
        System.out.println("20 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 52,00");
    }
    
}
