/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modelo.Produto;
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
public class ProdutoDAO implements InterfaceDAO{
    private Connection conn;
    @Override
    public void adiciona(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void excluir(Object obj) {
        try {
            int codigo = (int) obj;
            int codigoEstoque= 0;
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM produto WHERE codigoproduto=" + codigo);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                codigoEstoque = Integer.parseInt(rs.getString("estoque_codigoestoque"));
            }
            stmt = conn.prepareStatement("DELETE FROM produto WHERE codigoproduto=" + codigo);
            stmt.execute();            
            stmt = conn.prepareStatement("DELETE FROM ESTOQUE WHERE codigoestoque=" + codigoEstoque);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }
    public void alterar(ArrayList<Produto> arrayProduto, ArrayList<String> arrayNome, ArrayList<Float> arrayQuantidade) {
        ArrayList<Produto> arrayProdutoDAO = new ArrayList<>();
        try {
            for(int i = 0; i < arrayProduto.size();i++){
                PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("UPDATE Produto SET NOMEPRODUTO='"+arrayProduto.get(i).getNomeProduto()+"', MODELO='"+arrayProduto.get(i).getModelo()+"', PRECOCOMPRA="+arrayProduto.get(i).getPrecoCompra()+", PRECOVENDA="+arrayProduto.get(i).getPrecoVenda()+", DATAVALIDADE='"+arrayProduto.get(i).getDataValidade()+"' WHERE CODIGOPRODUTO="+arrayProduto.get(i).getCodigo());
                stmt.execute();
            }
            for(int i = 0; i < arrayProduto.size();i++){
                PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM produto WHERE codigoproduto="+ arrayProduto.get(i).getCodigo());
                stmt.execute();
                while (stmt.getResultSet().next()) {
                    Produto produto = new Produto();
                    produto.setCodigoEstoque(Integer.parseInt(stmt.getResultSet().getString("ESTOQUE_CODIGOESTOQUE")));
                    produto.setCodigoFornecedor(stmt.getResultSet().getInt("FORNECEDOR_CODIGOFORNECEDOR"));
                    arrayProdutoDAO.add(produto);
                }
            }
            for(int i = 0; i < arrayProduto.size();i++){
                PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("UPDATE Estoque SET quantidadeTotal="+ arrayQuantidade.get(i)+" WHERE codigoEstoque="+ arrayProdutoDAO.get(i).getCodigoEstoque());
                stmt.execute();
                stmt = ConexaoBD.conectar().prepareStatement("UPDATE Fornecedor SET nomeFornecedor='"+ arrayNome.get(i)+"' WHERE CODIGOFORNECEDOR="+ arrayProdutoDAO.get(i).getCodigoFornecedor());
                stmt.execute();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    public ArrayList<Float> pegaCodigoEstoque(String nome){
        ArrayList<Produto> arrayProduto = new ArrayList<>();
        ArrayList<Float> arrayEstoque = new ArrayList<>();
        try {
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM produto WHERE nomeproduto='"+ nome + "'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigoEstoque(Integer.parseInt(rs.getString("ESTOQUE_CODIGOESTOQUE")));
                arrayProduto.add(produto);
            }
            for(int i = 0; i < arrayProduto.size();i++){
                stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM ESTOQUE WHERE CODIGOESTOQUE=" + arrayProduto.get(i).getCodigoEstoque());
                stmt.executeQuery();
                while(stmt.getResultSet().next()){
                    arrayEstoque.add(stmt.getResultSet().getFloat("QuantidadeTotal"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayEstoque;
    }
        public ArrayList<Float> pegaCodigoEstoque2(String nome){
        ArrayList<Produto> arrayProduto = new ArrayList<>();
        ArrayList<Float> arrayEstoque = new ArrayList<>();
        try {
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM produto WHERE nomeproduto='"+ nome + "'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigoEstoque(Integer.parseInt(rs.getString("ESTOQUE_CODIGOESTOQUE")));
                arrayProduto.add(produto);
            }
            for(int i = 0; i < arrayProduto.size();i++){
                stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM ESTOQUE WHERE CODIGOESTOQUE=" + arrayProduto.get(i).getCodigoEstoque());
                stmt.executeQuery();
                while(stmt.getResultSet().next()){
                    arrayEstoque.add(stmt.getResultSet().getFloat("QuantidadeAtual"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayEstoque;
    }
    
    public ArrayList<Float> pegaTodosEstoque(){
        ArrayList<Produto> arrayProduto = new ArrayList<>();
        ArrayList<Float> arrayEstoque = new ArrayList<>();
        try {
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM produto");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigoEstoque(Integer.parseInt(rs.getString("ESTOQUE_CODIGOESTOQUE")));
                arrayProduto.add(produto);
            }
            for(int i = 0; i < arrayProduto.size();i++){
                stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM ESTOQUE WHERE CODIGOESTOQUE=" + arrayProduto.get(i).getCodigoEstoque());
                stmt.executeQuery();
                while(stmt.getResultSet().next()){
                    arrayEstoque.add(stmt.getResultSet().getFloat("QuantidadeTotal"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayEstoque;
    }
    public ArrayList<String> pegaCodigoFornecedor(String nome){
        ArrayList<Produto> arrayProduto = new ArrayList<>();
        ArrayList<String> arrayFornecedor = new ArrayList<>();
        try {
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM produto WHERE nomeproduto='"+ nome + "'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigoEstoque(Integer.parseInt(rs.getString("FORNECEDOR_CODIGOFORNECEDOR")));
                arrayProduto.add(produto);
            }
            for(int i = 0; i < arrayProduto.size();i++){
                stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM Fornecedor WHERE CODIGOFORNECEDOR=" + arrayProduto.get(i).getCodigoEstoque());
                stmt.executeQuery();
                while(stmt.getResultSet().next()){
                    arrayFornecedor.add(stmt.getResultSet().getString("nomeFornecedor"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayFornecedor;
    }
    public ArrayList<String> pegaTodosFornecedor(){
        ArrayList<Produto> arrayProduto = new ArrayList<>();
        ArrayList<String> arrayFornecedor = new ArrayList<>();
        try {
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM produto");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigoEstoque(Integer.parseInt(rs.getString("FORNECEDOR_CODIGOFORNECEDOR")));
                arrayProduto.add(produto);
            }
            for(int i = 0; i < arrayProduto.size();i++){
                stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM Fornecedor WHERE CODIGOFORNECEDOR=" + arrayProduto.get(i).getCodigoEstoque());
                stmt.executeQuery();
                while(stmt.getResultSet().next()){
                    arrayFornecedor.add(stmt.getResultSet().getString("nomeFornecedor"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayFornecedor;
    }    
    public ArrayList<Produto> buscarUm(String nome){
        ArrayList<Produto> arrayProduto = new ArrayList<>();
        try {
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM MERCADOBD.produto WHERE nomeproduto='"+ nome + "'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigo(Integer.parseInt(rs.getString("codigoproduto")));
                produto.setDataValidade(rs.getString("datavalidade"));
                produto.setModelo(rs.getString("modelo"));
                produto.setNomeProduto(rs.getString("nomeproduto"));
                produto.setPrecoCompra(rs.getFloat("precocompra"));
                produto.setPrecoVenda(rs.getFloat("precovenda"));
                produto.setCodigoEstoque(Integer.parseInt(rs.getString("ESTOQUE_CODIGOESTOQUE")));
                produto.setCodigoFornecedor(Integer.parseInt(rs.getString("FORNECEDOR_CODIGOFORNECEDOR")));
                produto.setCodigoNotaFiscal(Integer.parseInt(rs.getString("NOTAFISCAL_CODIGONOTAFISCAL")));
                arrayProduto.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayProduto;
    }
    @Override

 
   public ArrayList<Produto> buscar() {
        ArrayList<Produto> arrayProduto = new ArrayList<>();
        
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM produto");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigo(Integer.parseInt(rs.getString("codigoproduto")));
                produto.setDataValidade(rs.getString("datavalidade"));
                produto.setModelo(rs.getString("modelo"));
                produto.setNomeProduto(rs.getString("nomeproduto"));
                produto.setPrecoCompra(rs.getFloat("precocompra"));
                produto.setPrecoVenda(rs.getFloat("precovenda"));
                produto.setCodigoEstoque(Integer.parseInt(rs.getString("ESTOQUE_CODIGOESTOQUE")));
                produto.setCodigoFornecedor(rs.getInt("FORNECEDOR_CODIGOFORNECEDOR"));
                produto.setCodigoNotaFiscal(Integer.parseInt(rs.getString("NOTAFISCAL_CODIGONOTAFISCAL")));
                arrayProduto.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayProduto;
    }
    public void adicionar(Object obj, int codigoEstoque, int codigoNotafiscal, int codigoFornecedor){
        try {
            Produto produto =  (Produto) obj;
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO PRODUTO ( NOTAFISCAL_CODIGONOTAFISCAL, ESTOQUE_CODIGOESTOQUE, FORNECEDOR_CODIGOFORNECEDOR, nomeproduto, modelo, precocompra, precovenda, DATAVALIDADE) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setInt(1, codigoNotafiscal);
            stmt.setInt(2, codigoEstoque);
            stmt.setInt(3, codigoFornecedor);
            stmt.setString(4, produto.getNomeProduto());
            stmt.setString(5, produto.getModelo());
            stmt.setFloat(6, produto.getPrecoCompra());
            stmt.setFloat(7, produto.getPrecoVenda());
            stmt.setString(8, produto.getDataValidade());
            stmt.execute();
                    } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro no cadastro!");
        }

    }
            
}
