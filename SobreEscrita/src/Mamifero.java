
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *classe que herda a classe animal para demonstrar a sobrescrita
 * @author giova
 */
public class Mamifero extends animal{
    boolean pelo;
    int qtdePatas;
    int tetas;
    
    //contrutor de animal do tipo mamifero.
    public Mamifero(String raça, int idade, String cor, boolean pelo, int qtdePatas, int tetas){
        super(raça, idade, cor); //o que vai pra super classe
        this.pelo = pelo;
        this.qtdePatas = qtdePatas;
        this.tetas = tetas;
    }
    
    //construtor gui
    public Mamifero(){ 
        this.raça = JOptionPane.showInputDialog("raca: ");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("idade: "));
        this.cor = JOptionPane.showInputDialog("cor: ");
        this.pelo = Boolean.parseBoolean(JOptionPane.showInputDialog("tem pelo?: "));
        this.qtdePatas = Integer.parseInt(JOptionPane.showInputDialog("quantas patas?: "));
        this.tetas = Integer.parseInt(JOptionPane.showInputDialog("quantas tetas?: "));
        
    }
    
    
    //sobreescrita
    @Override //opcional, porém recomendado.
    public void ExibirDados(){
        System.out.println("o mamifero da raca "+raça+" tem "+qtdePatas+" patas");
    }
    
    //mais uma sobrescrita
    @Override
    public void alimentarAnimal(){
        System.out.println("a maioria dos mamiferos se alimenta de leite nos primeiros anos");
    }
    
    public void alimentarAnimal(String alimento){ //sobrecarga
        System.out.println("o mamifero "+ raça + " comeu "+ alimento);
    }
    
}//fim da class
