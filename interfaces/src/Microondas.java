



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class Microondas implements Eletrodomestico{
    String marca;
    int litros;

    @Override
    public void ligar() {
        System.out.println("O microondas foi ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("O microondas foi desligado!");
    }
    
    //método para ligar o microondar com o tempo escolhido pelo usuario
    public void ligar(int tempo) throws InterruptedException{
        System.out.println("o microondas foi ligado e desligara em: ");
        for (tempo = tempo; tempo>0; tempo--){
            System.out.println(tempo + " segundos");
            Thread.sleep(1000);
        }
        
        desligar();
    }
    

    
   
    
    
    
}
