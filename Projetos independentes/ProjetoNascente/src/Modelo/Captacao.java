/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author junim
 */
public class Captacao {
    private double numero;
    private String tipo;
    private int residencia;
    private int pessoas;
    private String descricao;
    private int idMicrobacia;
    /**
     * @return the numero
     */
    public double getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(double numero) {
        this.numero = numero;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the residencia
     */
    public int getResidencia() {
        return residencia;
    }

    /**
     * @param residencia the residencia to set
     */
    public void setResidencia(int residencia) {
        this.residencia = residencia;
    }

    /**
     * @return the pessoas
     */
    public int getPessoas() {
        return pessoas;
    }

    /**
     * @param pessoas the pessoas to set
     */
    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the idMicrobacia
     */
    public int getIdMicrobacia() {
        return idMicrobacia;
    }

    /**
     * @param idMicrobacia the idMicrobacia to set
     */
    public void setIdMicrobacia(int idMicrobacia) {
        this.idMicrobacia = idMicrobacia;
    }
}
