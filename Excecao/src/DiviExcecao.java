/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * classe para tratar as especificidade da classe divisão
 * @author giova
 */
class DiviExcecao extends Exception {
    
    public DiviExcecao(){
    super("o A deve ser maior que o B");
    }
    
    public DiviExcecao(String ww){
    super("o A deve ser menor que 200");
    }
    
}
