/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Endereco;
import Modelo.Fornecedor;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Junim Roberti
 */
public class FornecedorDAOTest {
    
    public FornecedorDAOTest() {
    }

    /**
     * Test of cadastrarFornecedor method, of class FornecedorDAO.
     */
    @Test
    public void testCadastrarFornecedor() {
        System.out.println("cadastrarFornecedor");
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNomeFornecedor("Joao");
        fornecedor.setCnpjFornecedor("111");
        fornecedor.setTelefone("111");
        fornecedor.setCpfFornecedor("111");
        fornecedor.setCodigoEndereco(244);
        FornecedorDAO instance = new FornecedorDAO();
        instance.cadastrarFornecedor(fornecedor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class FornecedorDAO.
     */
    @Test
    public void testExcluir() {
        int i=204;
        System.out.println("excluir");
        Object obj = i;
        FornecedorDAO instance = new FornecedorDAO();
        instance.excluir(obj);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

 

    /**
     * Test of alterar method, of class FornecedorDAO.
     */
    @Test
    public void testAlterar_ArrayList_ArrayList() throws Exception {
        System.out.println("alterar");
        ArrayList<Fornecedor> arrayFornecedor = new ArrayList<>();
        ArrayList<Endereco> arrayEndereco = new ArrayList<>();
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setCodigo(203);
        arrayFornecedor.add(fornecedor);
        Endereco endereco = new Endereco();
        endereco.setCodigo(245);
        arrayEndereco.add(endereco);
        
        FornecedorDAO instance = new FornecedorDAO();
        instance.alterar(arrayFornecedor, arrayEndereco);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



  

    /**
     * Test of buscar method, of class FornecedorDAO.
     */
    @Test
    public void testBuscar_Fornecedor() {
        System.out.println("buscar");
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNomeFornecedor("lucas");
        FornecedorDAO instance = new FornecedorDAO();
        int expResult = 4;
        int result = instance.buscar(fornecedor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
