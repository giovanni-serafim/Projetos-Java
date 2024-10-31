/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * classe para criar o objeto de comportamento polimórfico
 * @author giova
 */
public class Forno {
    
    public void preparar(Pizza pizza){
        pizza.montar();
        pizza.assar();
        pizza.cobrar();
    }
    
}
