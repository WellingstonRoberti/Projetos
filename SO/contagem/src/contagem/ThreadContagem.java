/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contagem;

/**
 *
 * @author Junim Roberti
 */
public class ThreadContagem {
    
    public static void main(String[] args) {
        
        contagem m1 = new contagem();
        m1.nome="c1";
        m1.setPriority(Thread.MIN_PRIORITY); 
        contagem m2 = new contagem(); 
        m2.setPriority(Thread.NORM_PRIORITY);
        m2.nome="c2";
        contagem m3 = new contagem(); 
        m3.setPriority(Thread.MAX_PRIORITY);
        m3.nome="c3";
        m1.start();
        m2.start();
        m3.start();
        
        
    }
    
}
