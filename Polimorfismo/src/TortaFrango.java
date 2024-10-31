/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class TortaFrango implements Pizza{
    @Override
    public void montar() {
        System.out.println("farinha, ovos, fermento, frango cozido, ervilha, milho");
    }

    @Override
    public void assar() {
        System.out.println("45 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 25,00");
    }
}
