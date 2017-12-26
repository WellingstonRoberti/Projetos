/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Endereco;
import Modelo.Funcionario;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Junim Roberti
 */
public class EnderecoDAOTest {
    
    public EnderecoDAOTest() {
    }
    /**
     * Test of buscarEndFun method, of class EnderecoDAO.
     */
    @Test
    public void testBuscarEndFun() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCodigoEndereco(108);
        ArrayList<Funcionario> arrayFun = new ArrayList<>();
        arrayFun.add(funcionario);
        Endereco endereco = new Endereco();
        endereco.setBairro("lkjasdlkj");
        endereco.setCidade("lksjd");
        endereco.setNumero("lkdjaslkdj");
        endereco.setRua("kjas");
        ArrayList<Endereco> arrayEndereco = new ArrayList<>();
        arrayEndereco.add(endereco);
        System.out.println("buscarEndFun");
        ArrayList<Funcionario> funcionarioBuscado = arrayFun;
        EnderecoDAO instance = new EnderecoDAO();
        ArrayList<Endereco> result = instance.buscarEndFun(funcionarioBuscado);
        assertEquals(arrayEndereco, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of CadastrarEnderecoFuncionario method, of class EnderecoDAO.
     */
    @Test
    public void testCadastrarEnderecoFuncionario() {
        Endereco endereco = new Endereco();
        endereco.setBairro("qqr");
        endereco.setCidade("qqqr");
        endereco.setNumero("oi");
        endereco.setRua("oi");        
        System.out.println("CadastrarEnderecoFuncionario");
        EnderecoDAO instance = new EnderecoDAO();
        int expResult = 256;
        int result = instance.CadastrarEnderecoFuncionario(endereco);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CadastrarEndereco method, of class EnderecoDAO.
     */
    @Test
    public void testCadastrarEndereco() {
        Endereco endereco = new Endereco();
        endereco.setBairro("qqr");
        endereco.setCidade("qqqr");
        endereco.setNumero("oi");
        endereco.setRua("oi");
        System.out.println("CadastrarEndereco");
        EnderecoDAO instance = new EnderecoDAO();
        int expResult = 255;
        int result = instance.CadastrarEndereco(endereco);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class EnderecoDAO.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        EnderecoDAO instance = new EnderecoDAO();
        ArrayList<Endereco> expResult = null;
        ArrayList<Endereco> result = instance.buscar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
