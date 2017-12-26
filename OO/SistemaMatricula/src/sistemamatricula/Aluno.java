/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamatricula;

public class Aluno {
 private int codigo;
 private String nome;
 private int cpf; 

 public Aluno(int codigo, String nome, int cpf){ 
     this.codigo = codigo;
     this.nome = nome;
     this.cpf = cpf;     
 }
    
    public int getCodigo() {
        return codigo;
    }

   
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getCpf() {
        return cpf;
    }

    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }  
}
