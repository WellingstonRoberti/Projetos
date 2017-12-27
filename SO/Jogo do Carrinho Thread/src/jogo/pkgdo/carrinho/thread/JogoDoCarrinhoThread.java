/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.pkgdo.carrinho.thread;

import javax.swing.JLabel;

/**
 *
 * @author Junim Roberti
 */
public class JogoDoCarrinhoThread extends Thread {
    JLabel label;
    int max;
    @Override
    public void run(){
        for(int i = 0; i < max; i++){
            label.setLocation(i, label.getY()); 
            for(int j = 0; j < max; j++){
                System.out.println("atraso");
            }
        }

    }
    public static void main(String[] args) {
        // TODO code application logic here
        MeuJogo jogo = new MeuJogo();
        jogo.setVisible(true);
    }
    
}
