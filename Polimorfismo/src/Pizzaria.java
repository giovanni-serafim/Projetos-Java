/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * classe para preparar as pizzas por meio do objeto polimórfico Forno.
 * @author giova
 */
public class Pizzaria {
    public static void main(String[] args) {
        
        Pizza port = new Portuguesa();
        Pizza marg = new Marguerita();
        Pizza fran = new FrangoCatupiry();
        Pizza bolo = new BoloLaranja();
        Forno forno = new Forno();
        forno.preparar(fran);
        
        
    }//fim do main
    
}//fim da classe
