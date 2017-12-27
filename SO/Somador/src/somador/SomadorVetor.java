/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somador;

/**
 *
 * @author Junim Roberti
 */
public class SomadorVetor extends Thread {
    public int c1=0;
    public int inicio;
    public int fim;
    public int[] array; 
    
    @Override    
    public void run() {
            for(int i=inicio; i<fim; i++){
               c1 += array[i];
            } 
    }
}
