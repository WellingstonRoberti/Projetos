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
public class NotaFiscal {
    private int codigoFiscal;    
    private String dataCompra;
    private String cnpj;

    /**
     * @return the dataCompra
     */
    public String getDataCompra() {
        return dataCompra;
    }

    /**
     * @param dataCompra the dataCompra to set
     */
    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the codigoFiscal
     */
    public int getCodigoFiscal() {
        return codigoFiscal;
    }

    /**
     * @param codigoFiscal the codigoFiscal to set
     */
    public void setCodigoFiscal(int codigoFiscal) {
        this.codigoFiscal = codigoFiscal;
    }
}
