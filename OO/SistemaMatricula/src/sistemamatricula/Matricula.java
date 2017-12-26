/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamatricula;


public class Matricula {
    private int numero;
    private int data;
    
    public Matricula(int numero, int data){
        this.data = data;
        this.numero = numero;
    }
    
   

 
    public int getNumero() {
        return numero;
    }

    
    public void setNumero(int numero) {
        this.numero = numero;
    }


    public int getData() {
        return data;
    }

   
    public void setData(int data) {
        this.data = data;
    }
}
