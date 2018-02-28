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
public class Lancamento {
    private double numero;
    private boolean fossa;
    private String tipo;
    private boolean sumidouro;
    private boolean cursodagua;
    private boolean esgoto;
    private int pessoas;
    private boolean criacao;
    private int animais;
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
     * @return the fossa
     */
    public boolean getFossa() {
        return fossa;
    }

    /**
     * @param fossa the fossa to set
     */
    public void setFossa(boolean fossa) {
        this.fossa = fossa;
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
     * @return the sumidouro
     */
    public boolean getSumidouro() {
        return sumidouro;
    }

    /**
     * @param sumidouro the sumidouro to set
     */
    public void setSumidouro(boolean sumidouro) {
        this.sumidouro = sumidouro;
    }

    /**
     * @return the cursodagua
     */
    public boolean getCursodagua() {
        return cursodagua;
    }

    /**
     * @param cursodagua the cursodagua to set
     */
    public void setCursodagua(boolean cursodagua) {
        this.cursodagua = cursodagua;
    }

    /**
     * @return the esgoto
     */
    public boolean getEsgoto() {
        return esgoto;
    }

    /**
     * @param esgoto the esgoto to set
     */
    public void setEsgoto(boolean esgoto) {
        this.esgoto = esgoto;
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
     * @return the criacao
     */
    public boolean getCriacao() {
        return criacao;
    }

    /**
     * @param criacao the criacao to set
     */
    public void setCriacao(boolean criacao) {
        this.criacao = criacao;
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
