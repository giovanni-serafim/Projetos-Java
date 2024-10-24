/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class Flor extends Vegetal{
    
    String cor;
    boolean cheiroForte;
    int qtdPetalas;
    
    public Flor(String nome, boolean comestivel, String regiao, String cor, boolean cheiroForte, int qtdPetalas){
        super(nome, comestivel, regiao);
        this.cor = cor;
        this.cheiroForte = cheiroForte;
        this.qtdPetalas = qtdPetalas;
    }
    
    @Override
    public void Crescer(){
        System.out.println("a flor esta crescendo");
    }
    
}
