/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class Anfibio extends animal{
    
    boolean pula;
    boolean venenoso;
    int temperatura;
    
    public Anfibio (String raça, int idade, String cor, boolean pula, boolean venenoso, int temperatura){
        super(raça, idade, cor);
        this.pula = pula;
        this.venenoso = venenoso;
        this.temperatura = temperatura;
    }
    
    @Override
    public void ExibirDados(){
        System.out.println("os anfibios sao em maioria sapo");
    }
    
    public void alimentarAnimal(String comida){
        System.out.println("o "+raça+" ta comendo "+ comida);
    }
    
    
}
