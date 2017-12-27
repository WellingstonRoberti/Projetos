/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

import java.util.Random;

/**
 *
 * @author Junim Roberti
 */
public class Saque extends Thread {
    float valor;
     ContaCorrente contaCorrente ;
    @Override
    public void run() {
        for(int i=0; i<50; i++){
            Random random = new Random();            
            this.valor = random.nextInt(100);
           
            contaCorrente.saque(this.valor);
            contaCorrente.saldo(); 
        }
        
    }
}
