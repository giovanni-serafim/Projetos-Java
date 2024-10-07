/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *classe para instanciar objetos do tipo animal
 * @author giova
 */
public class Zoo {
    public static void main(String args[]){
        
        Mamifero m = new Mamifero();
        m.ExibirDados();
        
        System.out.println("_____________________");
        
        
        Mamifero gato = new Mamifero("Siames",3,"bege e preto",true,4,8);
        Anfibio sapo = new Anfibio("cururu", 2, "verde", true,  false, 10);
        animal macaco = new animal("orangotango", 4, "preto");
        gato.ExibirDados();
        gato.alimentarAnimal();
        gato.alimentarAnimal("peixe");
        System.out.println("___________________________");
        sapo.ExibirDados();
        sapo.alimentarAnimal("mosca");
        System.out.println("___________________________");
        macaco.ExibirDados();
        macaco.alimentarAnimal();
        
    }//fim do main
}
