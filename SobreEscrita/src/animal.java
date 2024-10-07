/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *classe para demonstrar o recurso da sobre escrita de métodos.
 * esse recurso só pode ser utilizado em um sistema de herança.
 * @author giova
 */
public class animal {
    String raça;
    int idade;
    String cor;
    
    //construtor
    public animal (String  raça, int idade, String cor) {
        this.raça = raça;
        this.idade = idade;
        this.cor = cor;
    }
    
    //construtor vazio para fazer um construtor com gui em mamifero
    public animal(){
        
    }
    
    public void ExibirDados(){
        System.out.println("raca: " + raça);
        System.out.println("idade: " + idade);
        System.out.println("cor predominante: " + cor);
        
    }
    
    public void alimentarAnimal(){
        System.out.println("o" + raça +" se alimenta de ");
    }
    
}
