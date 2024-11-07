
import javax.swing.JOptionPane;

/*
 *classe para usar o tratamento de ecxceções try catch e throws
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class divisao {
    public static void main(String[] args) {
        String numA, numB;
        int a, b;
        int divi = 0;
        
        
        
        numA = JOptionPane.showInputDialog("digite A");
        numB = JOptionPane.showInputDialog("digite B");
        


        
        
        try{ //tenta fazer a divisão
        a = Integer.parseInt(numA);
        b = Integer.parseInt(numB);
        divi = a/b;
        if (a > b){
            throw new DiviExcecao();
        }
        System.out.println("divisao = " + divi);

        }
        catch(ArithmeticException e){ //se não der por conta de falha aritmética
            System.out.println("ERRO: nao existe divisao por zero");
        }
        catch(NumberFormatException e){
            System.out.println("ERRO: falha na insersao de dados, dado invalido.");
        }
        catch(Exception e){ //se não der por qualquer outro motivo
            System.out.println("erro: " + e.toString());
        }
        

        
        
        
    }//fim do main

private static int dividir(int a, int b) throws DiviExcecao{
    if (a < b){
       throw new DiviExcecao();
    }
    else if(a>200){
        throw new DiviExcecao("ww");
    }
    
    return a/b;
    
   
    }
}
