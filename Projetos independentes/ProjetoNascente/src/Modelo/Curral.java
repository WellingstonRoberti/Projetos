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
public class Curral {
    private double numero;
    private String lancamento; 
    private int animais;
    private String higienizacao;       
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
     * @return the lancamento
     */
    public String getLancamento() {
        return lancamento;
    }

    /**
     * @param lancamento the lancamento to set
     */
    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    /**
     * @return the animais
     */
    public int getAnimais() {
        return animais;
    }

    /**
     * @param animais the animais to set
     */
    public void setAnimais(int animais) {
        this.animais = animais;
    }

    /**
     * @return the higienizacao
     */
    public String getHigienizacao() {
        return higienizacao;
    }

    /**
     * @param higienizacao the higienizacao to set
     */
    public void setHigienizacao(String higienizacao) {
        this.higienizacao = higienizacao;
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
