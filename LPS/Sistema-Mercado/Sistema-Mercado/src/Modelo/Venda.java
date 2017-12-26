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
public class Venda {
    private float somaVenda;
    private String formaPagamento;
    private String dataVenda;
    private int codigoFuncionario;
    private int codigo;
    private int codigoItem;
    /**
     * @return the somaVenda
     */
    public float getSomaVenda() {
        return somaVenda;
    }

    /**
     * @param somaVenda the somaVenda to set
     */
    public void setSomaVenda(float somaVenda) {
        this.somaVenda = somaVenda;
    }

    /**
     * @return the formaPagamento
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    /**
     * @return the dataVenda
     */
    public String getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the codigoFuncionario
     */
    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    /**
     * @param codigoFuncionario the codigoFuncionario to set
     */
    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
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
     * @return the codigoItem
     */
    public int getCodigoItem() {
        return codigoItem;
    }

    /**
     * @param codigoItem the codigoItem to set
     */
    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }
    
}
