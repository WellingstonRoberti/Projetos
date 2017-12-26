/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.ProdutoDAO;
import Modelo.Produto;
import java.util.ArrayList;

/**
 *
 * @author Junim Roberti
 */
public class ProdutoControle {
    public void salvar(Produto produto, int codigoEstoque, int codigoNotafiscal, int codigoFornecedor){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.adicionar(produto, codigoEstoque, codigoNotafiscal, codigoFornecedor);
    }
    public ArrayList<Produto> popular(){
        ProdutoDAO produtoDAO = new ProdutoDAO();        
        return produtoDAO.buscar();
    }
    public ArrayList<Float> popularEstoque(){
        ProdutoDAO produtoDAO = new ProdutoDAO();        
        return produtoDAO.pegaTodosEstoque();
    } 
    public ArrayList<String> popularFornecedor(){
        ProdutoDAO produtoDAO = new ProdutoDAO();        
        return produtoDAO.pegaTodosFornecedor();
    }     
    public void remover(Object codigo){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.excluir(codigo);
    }
    public ArrayList<Produto> buscar(String nome){ 
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.buscarUm(nome);
    }
    public ArrayList<Float> pegaQuantidade(String nome){ 
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.pegaCodigoEstoque(nome);
    }
    public ArrayList<Float> pegaQuantidade2(String nome){ 
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.pegaCodigoEstoque2(nome);
    }
    public ArrayList<String> pegaNomeFornecedor(String nome){ 
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.pegaCodigoFornecedor(nome);
    }
    public void updateProduto(ArrayList<Produto> array, ArrayList<String> array1, ArrayList<Float> array2){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.alterar(array, array1, array2);
    }
}
