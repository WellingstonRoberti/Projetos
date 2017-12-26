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
public class Fornecedor {
    private int codigo;
    private int codigoEndereco;
    private String nomeFornecedor;
    private String cpfFornecedor;
    private String cnpjFornecedor;
    private String telefone;
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigoEndereco(){
        return codigoEndereco;
    }
    public void setCodigoEndereco(int codigoEndereco){
        this.codigoEndereco = codigoEndereco;
    }
    
    /**
     * @return the nomeFornecedor
     */
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    /**
     * @param nomeFornecedor the nomeFornecedor to set
     */
    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    /**
     * @return the cpfFornecedor
     */
    public String getCpfFornecedor() {
        return cpfFornecedor;
    }

    /**
     * @param cpfFornecedor the cpfFornecedor to set
     */
    public void setCpfFornecedor(String cpfFornecedor) {
        this.cpfFornecedor = cpfFornecedor;
    }

    /**
     * @return the cnpjFornecedor
     */
    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    /**
     * @param cnpjFornecedor the cnpjFornecedor to set
     */
    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }
    
    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
