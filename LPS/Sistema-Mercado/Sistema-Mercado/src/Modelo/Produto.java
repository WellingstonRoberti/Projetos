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
public class Produto{
    private int codigo;
    private int codigoFornecedor;
    private int codigoEstoque;
    private int codigoNotaFiscal;
    private String nomeProduto;
    private String modelo;
    private float precoCompra;
    private float precoVenda;
    private String dataValidade;
    
    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precoCompra
     */
    public float getPrecoCompra() {
        return precoCompra;
    }

    /**
     * @param precoCompra the precoCompra to set
     */
    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    /**
     * @return the precoVenda
     */
    public float getPrecoVenda() {
        return precoVenda;
    }

    /**
     * @param precoVenda the precoVenda to set
     */
    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    /**
     * @return the dataValidade
     */
    public String getDataValidade() {
        return dataValidade;
    }

    /**
     * @param dataValidade the dataValidade to set
     */
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
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
     * @return the codigoFornecedor
     */
    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    /**
     * @param codigoFornecedor the codigoFornecedor to set
     */
    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    /**
     * @return the codigoEstoque
     */
    public int getCodigoEstoque() {
        return codigoEstoque;
    }

    /**
     * @param codigoEstoque the codigoEstoque to set
     */
    public void setCodigoEstoque(int codigoEstoque) {
        this.codigoEstoque = codigoEstoque;
    }

    /**
     * @return the codigoNotaFiscal
     */
    public int getCodigoNotaFiscal() {
        return codigoNotaFiscal;
    }

    /**
     * @param codigoNotaFiscal the codigoNotaFiscal to set
     */
    public void setCodigoNotaFiscal(int codigoNotaFiscal) {
        this.codigoNotaFiscal = codigoNotaFiscal;
    }

   
}
