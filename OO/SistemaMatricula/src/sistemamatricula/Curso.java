/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamatricula;


public class Curso {
    private int codigo;
    private String nome;
    private int cargaH; 
    
    public Curso(int codigo, String nome, int cargaH){
        this.codigo = codigo;
        this.nome = nome;
        this.cargaH = cargaH;
        
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


    public int getCargaH() {
        return cargaH;
    }

    public void setCargaH(int cargaH) {
        this.cargaH = cargaH;
    }
    
}
