/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * classe para implementar todos os métodos da interface Pizza pra preparar um bolo
 * @author giova
 */
public class BoloLaranja implements Pizza{

    @Override
    public void montar() {
        System.out.println("laranja, farinho de trigo, ovo, açucar");
    }

    @Override
    public void assar() {
        System.out.println("40 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$ 22,00");
    }
    
}
