/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class figura {
     Integer a, b, c, d;


    public figura (int a){
        this.a = a;
     
    }
    public figura (int a, int b){
        this.a = a;
        this.b = b;
    }
    public figura (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public figura (int a, int b, int c , int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void exibirFigura (){
        if ( a!= null && b == null && c == null && d == null)
            exibirFigura(a);
        else if(a!= null && b != null && c == null && d == null)
            exibirFigura(a, b);
        else if(a!= null && b != null && c != null && d == null)
            exibirFigura(a, b, c);
        else if(a!= null && b != null && c != null && d != null)
            exibirFigura(a, b, c, d);
            
    }
    
    public void exibirFigura(int x){
        System.out.println("é um ponto de valor: "+ a);
    }
    
    public void exibirFigura (int a, int b){
        System.out.println("é uma linha de cordenadas "+ a + " e "+ b);
    }
    public void exibirFigura (int a, int b, int c){
        System.out.println("é um triangulo de cordenadas "+ a + " e "+ b + " e " + c);
    }
    public void exibirFigura (int a, int b, int c, int d){
        System.out.println("é um retangulo de cordenadas "+ a + " e "+ b + " e " + c + " e " + d);
    }
    
}
