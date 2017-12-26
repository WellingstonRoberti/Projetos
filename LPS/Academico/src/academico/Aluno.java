/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

import java.util.ArrayList;

/**
 * @author Junim Roberti
 */

public class Aluno {
    
    private int codigo;
    private String nome;
    private int cpf;
    private ArrayList<Aluno> arrayAluno;
    
    public Aluno(){
        arrayAluno = new ArrayList(3);
    }


    public void lerDadosAluno(Aluno aluno, String CPFAlu, String CodAlu, String NomAlu){
        aluno.setCodigo(Integer.parseInt(CodAlu));        
        aluno.setNome(NomAlu);
        aluno.setCpf(Integer.parseInt(CPFAlu));                          
    }
    
    public void imprimirAluno(Aluno aluno){
        System.out.println("\nCodigo do Aluno :" + aluno.getCodigo());
        System.out.println("Nome do Aluno : " + aluno.getNome());
        System.out.println("CPF do Aluno : " + aluno.getCpf());                
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the arrayAluno
     */
    public ArrayList<Aluno> getArrayAluno() {
        return arrayAluno;
    }

    /**
     * @param aluno the arrayAluno to set
     */
    public void setArrayAluno(Aluno aluno) {
        this.arrayAluno.add(aluno);
    }
    public void apagar(){
        this.arrayAluno.clear();
    }

    
    
    
}
