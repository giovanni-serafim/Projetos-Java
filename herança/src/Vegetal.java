/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class Vegetal {
    
    protected String nome;
    protected boolean comestivel;
    protected String regiao;
    
    public Vegetal(String nome, boolean comestivel, String regiao){
        
        this.nome = nome;
        this.comestivel = comestivel;
        this.regiao = regiao;
        
    }
    
    public void Crescer(){
        System.out.println("o vegetal ta crescendo");
    }
    
    public static void main (String args[]){
        Flor flor = new Flor("gira-sol", false, "campo", "amarelo", true, 15);
        flor.Crescer();
        
        Arvore arvore = new Arvore ("amoreira", false, "floresta" ,"redonda", 10, true);
        arvore.Crescer();
        
        Folhagem folhagem = new Folhagem( "arbusto", false, "pantano",false, "oi", "ola");
        folhagem.Crescer();
    }
    
    
}
