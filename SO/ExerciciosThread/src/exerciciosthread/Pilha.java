/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosthread;

/**
 *
 * @author Junim Roberti
 */
public class Pilha {
    private int corpo[];
    private int MAX;
    private int topo;
    
    public Pilha(int MAX){
        this.corpo = new int[MAX];
        this.topo = -1;
        this.MAX = MAX;
    }
    
    public boolean vazia(){
       if(this.topo == -1){
           return true;
       } 
       else{
           return false;
       }
    }

    public boolean cheia(){
        if(this.topo == MAX){
            return true;
        }else{
            return false;
        }
    }
    
    public synchronized void empilha(int x) throws InterruptedException{    
        if(!this.cheia()){
            this.topo ++;
            this.corpo[this.topo] = x;
            System.out.println("empilhou: " + this.corpo[this.topo]);
            notify();
        }else{            
            System.out.println("Pilha Cheia");
            wait();
        }
                
    }
    
    public synchronized void desempilha() throws InterruptedException{
        if(!this.vazia()){
            this.topo --;
            System.out.println("retirou: " + this.corpo[this.topo+1]);
            notify(); 
        }else{
            System.out.println("Pilha está Vazia");
            wait();
            
        }
    }
    
}
