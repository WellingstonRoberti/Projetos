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
public class ExerciciosThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha pilha = new Pilha(20);
        Empilhamento empilhamento = new Empilhamento();
        Desempilha desempilha = new Desempilha();
        empilhamento.pilha = pilha;
        desempilha.pilha = pilha;
        empilhamento.start();
        desempilha.start();
        
    }
    
}
