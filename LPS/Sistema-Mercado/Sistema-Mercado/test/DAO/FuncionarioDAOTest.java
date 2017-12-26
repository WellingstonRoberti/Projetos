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
public class FuncionarioDAOTest {
    
    public FuncionarioDAOTest() {
    }

    
    /**
     * Test of excluir method, of class FuncionarioDAO.
     */
    @Test
    public void testExcluir() {
        int a = 200;
        System.out.println("excluir");
        Object obj = a;
        FuncionarioDAO instance = new FuncionarioDAO();
        instance.excluir(obj);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of login method, of class FuncionarioDAO.
     */
    @Test
    public void testLogin() {
        Funcionario func =  new Funcionario();
        func.setLogin("leticia");
        func.setSenha("1234");
        System.out.println("login");
        FuncionarioDAO instance = new FuncionarioDAO();
        int expResult = 1;
        int result = instance.login(func);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CadastrarFuncionario method, of class FuncionarioDAO.
     */
    @Test
    public void testCadastrarFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCodigoEndereco(200);
        funcionario.setLogin("oiii");
        funcionario.setNomeFuncionario("test");
        funcionario.setSenha("test");
        funcionario.setTipo(1);        
        System.out.println("CadastrarFuncionario");
        FuncionarioDAO instance = new FuncionarioDAO();
        instance.CadastrarFuncionario(funcionario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
