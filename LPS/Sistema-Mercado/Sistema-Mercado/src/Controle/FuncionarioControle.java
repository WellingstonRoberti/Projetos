/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.FuncionarioDAO;
import Modelo.Endereco;
import View.JfrmMenuCaixa;
import View.JfrmMenuGerente;
import Modelo.Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Junim Roberti
 */
public class FuncionarioControle {
   
    public boolean login (Funcionario funcionario){
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO ();
        int temp =0;
        temp = funcionarioDAO.login(funcionario);
        if(temp == 1){
            JfrmMenuGerente tela =  new JfrmMenuGerente();                   
            tela.setLocationRelativeTo(null);
            tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE); 
            tela.setVisible(true);
            return true;
        }
        if(temp == 2){
            JfrmMenuCaixa tela =  new JfrmMenuCaixa(funcionario);
            tela.setLocationRelativeTo(null);
            tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);                  
            tela.setVisible(true);
            return true;
        }
        if(temp !=1 && temp != 2){
            JOptionPane.showMessageDialog(null,"Login ou senha invalidos");
            return false;
        }     
        return false;
    }
    
    public void cadastrarFuncionario(Funcionario funcionario){
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO (); 
        funcionarioDAO.CadastrarFuncionario(funcionario);       
        
    }
    
     public ArrayList<Funcionario> buscarFuncionario(){
         
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO ();           
        return funcionarioDAO.buscarFuncionario();
        
     }
     
     public void removerFuncionario(Object i){
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO (); 
        funcionarioDAO.excluir(i);
        
    }
     
    public ArrayList<Funcionario> buscaApenasUm(String nome){ 
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.buscarApenasUm(nome);
    }
    
        public void alterarFuncionario(ArrayList<Funcionario> arrayFun, ArrayList<Endereco> arrayEnd){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.alterar(arrayFun, arrayEnd);
    }
    
}
