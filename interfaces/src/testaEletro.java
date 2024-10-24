/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * classe para instanciar objetos do tipo Eletrodomestico
 * @author giova
 */
public class testaEletro {
    public static void main(String[] args) throws InterruptedException {
        TV tv = new TV();
        
        tv.ligar();
        tv.sleepTimer(5);
        
        Microondas micro = new Microondas();
        micro.ligar(8);
                
                
    }//fim do main
}//fim da classe
