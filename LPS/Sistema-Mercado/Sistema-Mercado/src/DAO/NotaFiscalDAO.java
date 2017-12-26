/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modelo.NotaFiscal;
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
public class NotaFiscalDAO implements InterfaceDAO{
    @Override
    public void adiciona(Object obj) {
        try {
            NotaFiscal notaFiscal = (NotaFiscal) obj;
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("INSERT INTO notafiscal (dataCompra, cnpj) values (?,?)");
            stmt.setString(1, notaFiscal.getDataCompra());
            stmt.setString(2, notaFiscal.getCnpj());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Nota Fiscal cadastrada com sucesso!!");
        } catch (SQLException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void excluir(Object obj) {
        try {
            int codigo = (int) obj;
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("DELETE FROM notafiscal WHERE codigonotafiscal=" + codigo);
            stmt.execute();            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }
    public ArrayList<NotaFiscal> buscarData(String dataCompra){
        ArrayList<NotaFiscal> arrayNotaFiscal = new ArrayList<>();
        try {
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM Notafiscal WHERE dataCompra='"+ dataCompra + "'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                NotaFiscal notaFiscal = new NotaFiscal();
                notaFiscal.setDataCompra(rs.getString("dataCompra"));
                notaFiscal.setCnpj(rs.getString("cnpj"));
                arrayNotaFiscal.add(notaFiscal);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayNotaFiscal;
    }
    @Override
    public ArrayList<NotaFiscal> buscar() {
        ArrayList<NotaFiscal> arrayNotaFiscal = new ArrayList<>();
        try{
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM notafiscal");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                NotaFiscal notaFiscal = new NotaFiscal();
                notaFiscal.setCodigoFiscal(rs.getInt("codigonotafiscal"));
                notaFiscal.setDataCompra(rs.getString("dataCompra"));
                notaFiscal.setCnpj(rs.getString("cnpj"));
                arrayNotaFiscal.add(notaFiscal);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayNotaFiscal;
    }
    public int buscar(Object obj){
        try {
            int temp = 0;
            NotaFiscal notaFiscal = (NotaFiscal) obj;
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM notafiscal WHERE cnpj='" + notaFiscal.getCnpj() + "' AND datacompra='" + notaFiscal.getDataCompra() +"'");
            stmt.executeQuery();
            while(stmt.getResultSet().next()){
                temp = stmt.getResultSet().getInt("CODIGONOTAFISCAL");
            }
            return temp;
        } catch (SQLException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
