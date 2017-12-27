/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosthread;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junim Roberti
 */
public class Empilhamento extends Thread {
    Pilha pilha;
    int valor;
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            Random random = new Random();            
            this.valor = random.nextInt(100);
            try {
                pilha.empilha(valor);
            } catch (InterruptedException ex) {
                Logger.getLogger(Empilhamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
        
    }
}
