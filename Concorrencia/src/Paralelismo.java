/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * classe para demonstrar a execução de varias  threads em paralelo.
 * @author giova
 */
public class Paralelismo {
    
    public static void main(String[] args) {
        int i = 0;
        while(i<20){

        Processo t1 = new Processo();

        t1.start();
        i++;
        }//fim do looping

        
    }// fim do main
    
}// fim da classe
