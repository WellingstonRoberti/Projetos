/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junim Roberti
 */
public class ContaCorrente extends Thread {
    private float valor;
    
    public synchronized void deposito(float x){
        System.out.print("+ "+ x);
        this.valor +=x;
        notify();   
    }
    
    public synchronized void saque(float x){
        while (this.valor < x){
            System.out.println("- esperando saldo");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ContaCorrente.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
            System.out.print("- "+ x);
            this.valor -=x;
            
        
    }
    
    public void saldo(){
        System.out.println(" saldo: " + this.valor);
    }
    
}
