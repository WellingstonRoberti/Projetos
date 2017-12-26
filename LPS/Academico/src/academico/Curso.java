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

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Curso> arrayCurso;
    
    public Curso(){
        arrayCurso = new ArrayList(3);
    }
     public void apagar(){
        this.arrayCurso.clear();
    }
    public void lerDadosCurso(Curso curso, String CargaCur, String CodCur, String NomCur){         
        curso.setCodigo(Integer.parseInt(CodCur));
        curso.setNome(NomCur);
        curso.setCargaHoraria(Integer.parseInt(CargaCur));                          
    }
    
    public void imprimirCurso(Curso curso){
        System.out.println("\nCodigo do curso :" + curso.getCodigo());
        System.out.println("Nome do curso: " + curso.getNome());
        System.out.println("CH do curso: " + curso.getCargaHoraria());                
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
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return the arrayCurso
     */
    public ArrayList<Curso> getArrayCurso() {
        return arrayCurso;
    }

    /**
     * @param curso the arrayCurso to set
     */
    public void setArrayCurso(Curso curso) {
        this.arrayCurso.add(curso);
    }
    
    
}
