/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Endereco;
import Modelo.Funcionario;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Junim Roberti
 */
public class FuncionarioControleTest {
    
    public FuncionarioControleTest() {
    }
    Funcionario funcionarioTeste = new Funcionario();
    
    /**
     * Test of login method, of class FuncionarioControle.
     */
    @Test
    public void testLogin() {
        funcionarioTeste.setLogin("renan");
        funcionarioTeste.setSenha("1234");
        System.out.println("login");
        Funcionario funcionario = funcionarioTeste;
        FuncionarioControle instance = new FuncionarioControle();
        boolean expResult = true;
        boolean result = instance.login(funcionario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}
