/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.NotaFiscal;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Junim Roberti
 */
public class NotaFiscalDAOTest {
    
    public NotaFiscalDAOTest() {
    }

    /**
     * Test of adiciona method, of class NotaFiscalDAO.
     */
    @Test
    public void testAdiciona() {
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setCnpj("123");
        notaFiscal.setDataCompra("10/10/1010");
        System.out.println("adiciona");
        Object obj = notaFiscal;
        NotaFiscalDAO instance = new NotaFiscalDAO();
        instance.adiciona(obj);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class NotaFiscalDAO.
     */
    @Test
    public void testExcluir() {
        int x = 6;
        System.out.println("excluir");
        Object obj = x;
        NotaFiscalDAO instance = new NotaFiscalDAO();
        instance.excluir(obj);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarData method, of class NotaFiscalDAO.
     */
    @Test
    public void testBuscarData() {
        System.out.println("buscarData");
        String dataCompra = "10/10/1010";
        ArrayList<NotaFiscal> arrayNotaFiscal = new ArrayList<>();
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setCnpj("123");
        notaFiscal.setDataCompra("10/10/1010");
        arrayNotaFiscal.add(notaFiscal);
        NotaFiscalDAO instance = new NotaFiscalDAO();
        ArrayList<NotaFiscal> expResult = arrayNotaFiscal;
        ArrayList<NotaFiscal> result = instance.buscarData(dataCompra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class NotaFiscalDAO.
     */
    @Test
    public void testBuscar_0args() {
        System.out.println("buscar");
        NotaFiscalDAO instance = new NotaFiscalDAO();
        ArrayList<NotaFiscal> expResult = null;
        ArrayList<NotaFiscal> result = instance.buscar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class NotaFiscalDAO.
     */
    @Test
    public void testBuscar_Object() {
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setCnpj("123123123123");
        notaFiscal.setDataCompra("10/10/10");
        System.out.println("buscar");
        Object obj = notaFiscal;
        NotaFiscalDAO instance = new NotaFiscalDAO();
        int expResult = 1;
        int result = instance.buscar(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
