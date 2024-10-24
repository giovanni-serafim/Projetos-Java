/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class Folhagem extends Vegetal{
    
    boolean possuiEspinhos;
    String bioma;
    String estação;
    
    Folhagem (String nome, boolean comestivel, String regiao, boolean possuiEspinhos, String bioma, String estação){
        super(nome, comestivel, regiao);
        this.possuiEspinhos = possuiEspinhos;
        this.bioma = bioma;
        this.estação = estação;
    }
    
    @Override
    public void Crescer(){
        System.out.println("a folhagem esta crescendo");
    }
    
}
