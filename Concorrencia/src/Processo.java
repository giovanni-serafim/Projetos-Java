
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Classe para implementar a função threads, promovendo o paralelismo e cconcorrencia entre elas.
 * @author giova
 */
public class Processo extends Thread{
    
    int sleepTime;
    JFrame janela = new JFrame();
    JPanel painel = new JPanel();
    JLabel label = new JLabel();
    
    public Processo (){
        int x, y, h, g, b;
        sleepTime = (int) (Math.random() * 5000); //casting para inteiro (conversão)
        x = (int) (Math.random() * 900); 
        y = (int) (Math.random() * 800); 
        h = (int) (Math.random() * 255); 
        g = (int) (Math.random() * 255); 
        b = (int) (Math.random() * 255); 
        
        label.setText("Giovanni Serafim");
        janela.setSize(400, 400);
        janela.setLocation(x, y);
        painel.setBackground(Color.getHSBColor(h, g, b));
        janela.add(painel);
        janela.add(label);
        janela.setVisible(true);
    }
    
    public void run(){
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException ex) {
            System.out.println("a janela foi interrompida");
        }
        janela.setVisible(false);
    }
    
    
}//fim do Processo
