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
public class Som {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = new int[10000];
        int cont =0;
        for(int i=0; i<10000; i++){
            vetor[i] = i;
            cont += i;
        }
        System.out.println("certo: "+ cont);
        
        SomadorVetor m1 = new SomadorVetor();
        m1.inicio = 0;
        m1.fim = vetor.length/4;
        m1.array = vetor;
        
  
        SomadorVetor m2 = new SomadorVetor(); 
        m2.inicio = vetor.length/4;
        m2.fim = vetor.length/2;
        m2.array = vetor;

        
        
        SomadorVetor m3 = new SomadorVetor(); 
        m3.inicio = vetor.length/2;
        m3.fim = vetor.length - vetor.length/4;
        m3.array = vetor;

        
        
        SomadorVetor m4 = new SomadorVetor(); 
        m4.inicio = vetor.length - vetor.length/4;
        m4.fim = vetor.length;
        m4.array = vetor;

        
        
      
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        int t=0;
        
        while (t == 0){
          if(!m1.isAlive() && !m2.isAlive() && !m3.isAlive() && !m4.isAlive()){
            int soma = m1.c1+m2.c1+m3.c1+m4.c1;
            t = -1;
            System.out.println(soma);
            
        }  
        }
        
        
        
        
        
    
    }
    
}
