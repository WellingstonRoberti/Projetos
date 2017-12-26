/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Estoque;
import Modelo.Produto;
import Modelo.Venda;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Junim Roberti
 */
public class VendaDAOTest {
    
    public VendaDAOTest() {
    }

    /**
     * Test of realizaVenda method, of class VendaDAO.
     */
    @Test
    public void testRealizaVenda() {
        System.out.println("realizaVenda");
        ArrayList<Produto> arrayProduto = new ArrayList<>();
        Produto produto = new Produto();
        produto.setCodigo(112);
        arrayProduto.add(produto);
        ArrayList<Estoque> arrayEstoque = new ArrayList<>();
        Estoque estoque = new Estoque();
        estoque.setQuantidadeAtual(10);
        arrayEstoque.add(estoque);
        int codigoVenda = 12;
        VendaDAO instance = new VendaDAO();
        instance.realizaVenda(arrayProduto, arrayEstoque, codigoVenda);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of adiciona method, of class VendaDAO.
     */
    @Test
    public void testAdiciona_Venda() {
        System.out.println("adiciona");
        Venda venda = new Venda();
        venda.setCodigoFuncionario(1);
        venda.setDataVenda("10/10/10");
        venda.setFormaPagamento("dinheiro");
        venda.setSomaVenda(100);
        VendaDAO instance = new VendaDAO();
        int expResult = 18;
        int result = instance.adiciona(venda);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
