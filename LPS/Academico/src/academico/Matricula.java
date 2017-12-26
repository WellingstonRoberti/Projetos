/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

import java.util.ArrayList;

/**
 *
 * @author Junim Roberti
 */
public class Matricula {



    /**
     * @param codCurso the codCurso to set
     */
    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }
    private int numero;
    private String Data;
    private int codAluno;
    private int codCurso;
    private ArrayList<Matricula> arrayMatricula;
    
    public Matricula(){
        arrayMatricula = new ArrayList(3);
    }
     public void apagar(){
        this.arrayMatricula.clear();
    }
    public void lerDadosMatricula(Matricula matricula, String numMat, String codAluMat, String codCurMat, String dataMat){              
        matricula.setNumero(Integer.parseInt(numMat));
        matricula.setData(dataMat);                 
        matricula.setCodAluno(Integer.parseInt(codAluMat));            
        matricula.setCodCurso(Integer.parseInt(codCurMat));
    }
    
    public void imprimirMatricula(Matricula matricula){
        System.out.println("\nNumero da matricula: " + matricula.getNumero());
        System.out.println("Data da matricula : " + matricula.getData());                
        System.out.println("Codigo do aluno: " + matricula.getCodAluno());
        System.out.println("Codigo do curso: " + matricula.getCodCurso());
    }    

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the Data
     */
    public String getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * @return the codAluno
     */
    public int getCodAluno() {
        return codAluno;
    }

    /**
     * @param codAluno the codAuno to set
     */
    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    /**
     * @return the codCurso
     */
    public int getCodCurso() {
        return codCurso;
    }

    /**
     * @return the arrayMatricula
     */
    public ArrayList<Matricula> getArrayMatricula() {
        return arrayMatricula;
    }

    /**
     * @param matricula the arrayMatricula to set
     */
    public void setArrayMatricula(Matricula matricula) {         
        this.arrayMatricula.add(matricula);
    }
    
    
}

