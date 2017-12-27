/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

/**
 *
 * @author Junim Roberti
 */
public class ContaCorrenteComThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(); 
        Saque saque = new Saque();
        Deposito deposito = new Deposito();
        saque.contaCorrente = contaCorrente;
        deposito.contaCorrente = contaCorrente;
        saque.start();
        deposito.start();
        
    }
    
}
