/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Endereco;
import Modelo.Funcionario;
import Utilitarios.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Junim Roberti
 */
public class FuncionarioDAO implements InterfaceDAO{

    private String sql;
    private Connection conn;

    @Override
    public void adiciona(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Object obj) {
        
        try {
            int i = (int) obj;
            
            conn = ConexaoBD.conectar(); 
            //aqui eu busco o codigo do endereÃ§o relacionado ao funcionario
            PreparedStatement stmt = conn.prepareStatement("select endereço_CODIGOENDERECO from FUNCIONARIO where CODIGOFUNCIONARIO = "+i);       
            ResultSet rs = stmt.executeQuery();
            
            int dados = 0;
       
            while (rs.next()) {
                dados = Integer.parseInt(rs.getString("endereço_CODIGOENDERECO"));                              
            }          
            
            //aqui eu deleto o funcionario  
            stmt = conn.prepareStatement("Delete from Funcionario where codigofuncionario = "+i);
            stmt.execute();
            
            //aqui eu deleto o endereÃ§o relacionado ao funcionario                         
            stmt = conn.prepareStatement("Delete from ENDERECO where CODIGOENDERECO = "+dados);
            stmt.execute();
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel deletar", "Erro", 0);
            //System.out.println("NÃ£o foi possivel executar o comando SQL");
        }
    }
   


    @Override
    public void alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscar() {
        
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }

      
    public int login(Funcionario funcionario){
        
        PreparedStatement ps2;
        ResultSet rs;       
        int temp=0;
        try {
            ps2 = ConexaoBD.conectar().prepareStatement("SELECT * FROM MERCADOBD.Funcionario where Login='" +funcionario.getLogin()+ "' AND senha='" +funcionario.getSenha() + "'" );
            rs = ps2.executeQuery();
            while (rs.next()) {
                String dados = rs.getString("tipo");
                funcionario.setCodigo(rs.getInt("CODIGOFUNCIONARIO"));
                temp = Integer.parseInt(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }             
        return temp;
    }
    
    public void CadastrarFuncionario(Funcionario funcionario){
       try {
            sql = "Insert into Funcionario (endereço_codigoendereco, login, senha, tipo, nomefuncionario) values (?,?,?,?,?)";
            conn = ConexaoBD.conectar();
            PreparedStatement stmt;        
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, funcionario.getCodigoEndereco());
            stmt.setString(2, funcionario.getLogin());
            stmt.setString(3, funcionario.getSenha());
            stmt.setInt(4, funcionario.getTipo()); 
            stmt.setString(5, funcionario.getNomeFuncionario());           
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }             
    }
    
    public ArrayList<Funcionario> buscarFuncionario(){
         
        PreparedStatement ps;
        ResultSet rs; 
        
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<>();
        
        try {       
            ps =  ConexaoBD.conectar().prepareStatement("SELECT * FROM Funcionario");
            rs = ps.executeQuery();
             
            
            while (rs.next()) {   
                Funcionario funcionario = new Funcionario();
                funcionario.setCodigo(rs.getInt("CODIGOFUNCIONARIO"));
                funcionario.setNomeFuncionario(rs.getString("NOMEFUNCIONARIO"));
                funcionario.setTipo(rs.getInt("TIPO"));         
                funcionario.setCodigoEndereco(rs.getInt("ENDEREÇO_CODIGOENDERECO"));
                arrayFuncionario.add(funcionario);               
            }
            /*
            for(int i=0; i < arrayFuncionario.size(); i++){
                    System.out.println(arrayFuncionario.get(i).getNomeFuncionario()); 
                    System.out.println(arrayFuncionario.get(i).getTipo());                   
                
            }*/
                       
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayFuncionario;       
    }
    
    public ArrayList<Funcionario> buscarApenasUm(String nome){
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<>();
        try {
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM FUNCIONARIO WHERE NOMEFUNCIONARIO='"+ nome + "'");
            ResultSet rs = stmt.executeQuery(); 
                        
            
            while (rs.next()) {  
                Funcionario funcionario = new Funcionario();                                
                funcionario.setCodigo(Integer.parseInt(rs.getString("CODIGOFUNCIONARIO")));
                funcionario.setTipo(Integer.parseInt(rs.getString("TIPO")));
                funcionario.setNomeFuncionario(rs.getString("NOMEFUNCIONARIO")); 
                funcionario.setCodigoEndereco(Integer.parseInt(rs.getString("endereço_CODIGOENDERECO")));
                arrayFuncionario.add(funcionario);             
            }            
                  
                        
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayFuncionario;
    }
    
    public void alterar(ArrayList<Funcionario> arrayFuncionario, ArrayList<Endereco> arrayEndereco) {
        ArrayList<Funcionario> arrayFuncionarioDAO = new ArrayList<>();
        try {
            for(int i = 0; i < arrayFuncionario.size();i++){
                PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("UPDATE FUNCIONARIO SET NOMEFUNCIONARIO='"+arrayFuncionario.get(i).getNomeFuncionario()+"', TIPO="+arrayFuncionario.get(i).getTipo()+" WHERE CODIGOFUNCIONARIO ="+arrayFuncionario.get(i).getCodigo());
                stmt.execute();
            }
            for(int i = 0; i < arrayFuncionario.size();i++){
                PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM FUNCIONARIO WHERE CODIGOFUNCIONARIO="+ arrayFuncionario.get(i).getCodigo());
                stmt.execute();
                while (stmt.getResultSet().next()) {
                    Funcionario funcionario = new Funcionario();
                    funcionario.setCodigoEndereco(Integer.parseInt(stmt.getResultSet().getString("endereço_CODIGOENDERECO")));                    
                    arrayFuncionarioDAO.add(funcionario);
                }
            }
            for(int i = 0; i < arrayFuncionario.size(); i++){
                PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("UPDATE ENDERECO SET RUA ='"+arrayEndereco.get(i).getRua()+"', NUMERO = '"+arrayEndereco.get(i).getNumero()+"',BAIRRO='"+arrayEndereco.get(i).getBairro()+"',CIDADE ='"+arrayEndereco.get(i).getCidade()+"' WHERE CODIGOENDERECO = " + arrayFuncionarioDAO.get(i).getCodigoEndereco());
                stmt.execute();               
            }
            
            JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível alterar!");
        }
    } 
     
    
   
}
