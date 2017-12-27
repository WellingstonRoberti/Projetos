/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosthread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junim Roberti
 */
public class Desempilha extends Thread {
    Pilha pilha;
    int valor;
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            try {            
                pilha.desempilha();
            } catch (InterruptedException ex) {
                Logger.getLogger(Desempilha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
