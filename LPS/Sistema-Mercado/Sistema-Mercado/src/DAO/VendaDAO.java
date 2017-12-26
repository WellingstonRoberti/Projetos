/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Estoque;
import Modelo.Produto;
import Modelo.Venda;
import Utilitarios.ConexaoBD;
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
public class VendaDAO implements InterfaceDAO{

    @Override
    public void adiciona(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }
    public void realizaVenda(ArrayList<Produto> arrayProduto, ArrayList<Estoque> arrayEstoque, int codigoVenda){
        int codigoEstoque = 0;
        float quantidadeAtual = 0;
        PreparedStatement stmt;
        try {
            for(int i = 0; i < arrayProduto.size();i++){
                stmt = ConexaoBD.conectar().prepareStatement("INSERT INTO itemVenda (PRODUTO_CODIGOPRODUTO, VENDA_CODIGOVENDA) values(?,?)");
                stmt.setInt(1, arrayProduto.get(i).getCodigo());
                stmt.setInt(2, codigoVenda);
                stmt.execute();
            }
            for(int i = 0; i < arrayProduto.size();i++){
            stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM produto WHERE codigoProduto="+ arrayProduto.get(i).getCodigo());
            stmt.execute();
            while(stmt.getResultSet().next()){
                codigoEstoque = stmt.getResultSet().getInt("ESTOQUE_CODIGOESTOQUE");
            }
            stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM estoque WHERE codigoEstoque=" +codigoEstoque);
            stmt.execute();
            while(stmt.getResultSet().next()){
                quantidadeAtual = stmt.getResultSet().getFloat("quantidadeAtual");
            }
            stmt = ConexaoBD.conectar().prepareStatement("UPDATE estoque SET quantidadeAtual="+ (quantidadeAtual-arrayEstoque.get(i).getQuantidadeAtual())+" WHERE codigoEstoque="+codigoEstoque);
            stmt.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Venda Realizada!!");
         
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int adiciona(Venda venda){
        int temp=0;
        try {
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("INSERT INTO venda (FUNCIONARIO_CODIGOFUNCIONARIO, SOMAVENDA, FORMAPAGAMENTO, DATAVENDA) values (?,?,?,?)");
            stmt.setString(1, String.valueOf(venda.getCodigoFuncionario()));
            stmt.setString(2, String.valueOf(venda.getSomaVenda()));
            stmt.setString(3, venda.getFormaPagamento());
            stmt.setString(4, venda.getDataVenda());
            stmt.execute();
            stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM venda");
            stmt.execute();
            while(stmt.getResultSet().next()){
                temp = stmt.getResultSet().getInt("codigovenda");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
    @Override
    public ArrayList<Venda> buscar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        PreparedStatement ps;
        ResultSet rs;         
        ArrayList<Venda> arrayVenda = new ArrayList<>();
        try {       
            ps =  ConexaoBD.conectar().prepareStatement("SELECT * FROM Venda");
            rs = ps.executeQuery();             
            
            while (rs.next()) {
                Venda venda = new Venda();
                venda.setCodigo(rs.getInt("CODIGOVENDA"));
                venda.setCodigoFuncionario(rs.getInt("FUNCIONARIO_CODIGOFUNCIONARIO"));
                venda.setFormaPagamento(rs.getString("FORMAPAGAMENTO"));
                venda.setDataVenda(rs.getString("DATAVENDA"));
                venda.setSomaVenda(rs.getInt("SOMAVENDA"));
                arrayVenda.add(venda);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayVenda;
    }
    public ArrayList<Produto> buscaItem(){
        
        PreparedStatement ps;
        ResultSet rs;        
        ArrayList<Venda> arrayItens = new ArrayList<>();
        ArrayList<Produto> arrayProduto = new ArrayList<>();
        try {       
            ps =  ConexaoBD.conectar().prepareStatement("SELECT * FROM Itemvenda");
            rs = ps.executeQuery();             
            
            while (rs.next()) {
                Venda venda = new Venda();
                venda.setCodigoItem(rs.getInt("PRODUTO_CODIGOPRODUTO"));                
                venda.setCodigo(rs.getInt("VENDA_CODIGOVENDA"));         
                arrayItens.add(venda);
            }
            for(int i= 0; i<arrayItens.size();i++){
            ps =  ConexaoBD.conectar().prepareStatement("SELECT * FROM Produto WHERE CODIGOPRODUTO= "+ arrayItens.get(i).getCodigoItem());
            rs = ps.executeQuery();
            while(rs.next()){
                Produto produto = new Produto();
                produto.setNomeProduto(rs.getString("NOMEPRODUTO"));
                produto.setModelo(rs.getString("MODELO"));
                produto.setCodigo(arrayItens.get(i).getCodigo());
                arrayProduto.add(produto);
            }
         
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    return arrayProduto;
    }
    
    @Override
    public void excluir(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }
}
