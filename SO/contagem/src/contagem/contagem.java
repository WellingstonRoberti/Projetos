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
public class contagem extends Thread {
    public String nome;
    @Override
    public void run() {
            int c1;
            c1=0;

            for(int i=0; i<1000; i++){
               c1++;
               System.out.println(nome+ " : " +c1);
            } 
    }
}
