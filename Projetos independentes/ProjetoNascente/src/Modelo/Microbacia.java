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
public class Microbacia {
    private String nome;
    private double ponto;
    private String data;
    private String propriedade;
    private int idMicrobacia;
    /**
     * @return the ponto
     */
    public double getPonto() {
        return ponto;
    }

    /**
     * @param ponto the ponto to set
     */
    public void setPonto(double ponto) {
        this.ponto = ponto;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the propriedade
     */
    public String getPropriedade() {
        return propriedade;
    }

    /**
     * @param propriedade the propriedade to set
     */
    public void setPropriedade(String propriedade) {
        this.propriedade = propriedade;
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
