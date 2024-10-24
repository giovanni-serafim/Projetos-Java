/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class Arvore extends Vegetal{
    String tipoFolha;
    int altura;
    boolean frutifera;
    
    Arvore(String nome, boolean comestivel, String regiao, String tipoFolha, int altura, boolean frutifera){
        super (nome, comestivel, regiao);
        
        this.tipoFolha = tipoFolha;
        this.altura = altura;
        this.frutifera = frutifera;
    }
    
    @Override
    public void Crescer(){
        System.out.println("a arvore esta crescendo");
    }
    
    
    
}
