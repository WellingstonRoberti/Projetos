/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Junim Roberti
 */
public class Estoque {
    private float quantidadeTotal;
    private float quantidadeAtual;

    /**
     * @return the quantidadeTotal
     */
    public float getQuantidadeTotal() {
        return quantidadeTotal;
    }

    /**
     * @param quantidadeTotal the quantidadeTotal to set
     */
    public void setQuantidadeTotal(float quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    /**
     * @return the quantidadeAtual
     */
    public float getQuantidadeAtual() {
        return quantidadeAtual;
    }

    /**
     * @param quantidadeAtual the quantidadeAtual to set
     */
    public void setQuantidadeAtual(float quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }
}
