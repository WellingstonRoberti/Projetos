/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Estoque;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Junim Roberti
 */
public class EstoqueDAOTest {
    
    public EstoqueDAOTest() {
    }

    /**
     * Test of adicionar method, of class EstoqueDAO.
     */
    @Test
    public void testAdicionar() {
        Estoque estoque = new Estoque();
        estoque.setQuantidadeAtual(10);
        estoque.setQuantidadeTotal(20);
        System.out.println("adicionar");
        Object obj = estoque;
        EstoqueDAO instance = new EstoqueDAO();
        int expResult = 50;
        int result = instance.adicionar(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
