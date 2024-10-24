/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *classe para implementar todos os métodos da interface Eletrodomesticos.
 * @author giova
 */
public class TV implements Eletrodomestico{

    String marca;
    int polegada;
    
    
    public void sleepTimer(int min) throws InterruptedException{
        System.out.println("a tv sera desligada em: "  + min + " minutos");
      
        for(min = min; min > 0; min--){
            Thread.sleep(1000);
        }
        
        desligar();
    }
    
    
    
    @Override
    public void ligar() {
        System.out.println("A TV foi ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("A TV foi desligada!");
        
    }
    
}
