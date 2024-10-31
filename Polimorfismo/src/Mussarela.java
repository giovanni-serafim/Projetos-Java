/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class Mussarela implements Pizza{
    @Override
    public void montar() {
        System.out.println("molhode tomate, tomate, orégano, mussarela");
    }

    @Override
    public void assar() {
        System.out.println("15 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 40,00");
    }
}
