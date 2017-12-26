/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Estoque;
import Modelo.Produto;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Junim Roberti
 */
public class ProdutoDAOTest {
    
    public ProdutoDAOTest() {
    }

    /**
     * Test of excluir method, of class ProdutoDAO.
     */
    @Test
    public void testExcluir() {
        int x = 14;
        System.out.println("excluir");
        Object obj = x;
        ProdutoDAO instance = new ProdutoDAO();
        instance.excluir(obj);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of alterar method, of class ProdutoDAO.
     */
    @Test
    public void testAlterar_3args() {
        System.out.println("alterar");
        Produto produto = new Produto();
        produto.setCodigo(9);
        produto.setDataValidade("10/10/10");
        produto.setModelo("oi");
        produto.setNomeProduto("ola");
        produto.setPrecoCompra(10);
        produto.setPrecoVenda(20);
        ArrayList<Produto> arrayProduto = new ArrayList<>();
        arrayProduto.add(produto);
        ArrayList<String> arrayNome = new ArrayList<>();
        String nome = "lucas";
        arrayNome.add(nome);
        ArrayList<Float> arrayQuantidade = new ArrayList<>();
        float x = 10;
        arrayQuantidade.add(x);
        ProdutoDAO instance = new ProdutoDAO();
        instance.alterar(arrayProduto, arrayNome, arrayQuantidade);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of adicionar method, of class ProdutoDAO.
     */
    @Test
    public void testAdicionar() {
        Produto produto = new Produto();
        produto.setDataValidade("10/10/10");
        produto.setModelo("oi");
        produto.setNomeProduto("ola");
        produto.setPrecoCompra(10);
        produto.setPrecoVenda(20);
        System.out.println("adicionar");
        Object obj = produto;
        int codigoEstoque = 14;
        int codigoNotafiscal = 1;
        int codigoFornecedor = 2;
        ProdutoDAO instance = new ProdutoDAO();
        instance.adicionar(obj, codigoEstoque, codigoNotafiscal, codigoFornecedor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
