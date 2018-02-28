/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Lancamento;
import Modelo.Microbacia;
import Utilitario.ConexaoBD;
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
 * @author junim
 */
public class LancamentoDAO {
    private Connection conn;
    public void Adicionar(Object obj, int codigo){
        try {
            Lancamento lancamento =  (Lancamento) obj;
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO LANÇAMENTO (NUMERO, FOSSA, TIPO, SUMIDOURO, CURSOAGUA, ESGOTO, NUMEROPESSOAS, CRIACAO, NUMEROANIMAIS, DESCRICAO, MICROBACIAS_IDMICROBACIAS) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setDouble(1, lancamento.getNumero());
            stmt.setBoolean(2, lancamento.getFossa());
            stmt.setString(3, lancamento.getTipo());
            stmt.setBoolean(4, lancamento.getSumidouro());
            stmt.setBoolean(5, lancamento.getCursodagua());
            stmt.setBoolean(6, lancamento.getEsgoto());
            stmt.setDouble(7, lancamento.getPessoas());
            stmt.setBoolean(8, lancamento.getCriacao());
            stmt.setInt(9, lancamento.getAnimais());
            stmt.setString(10, lancamento.getDescricao());
            stmt.setInt(11, codigo);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!");
                    } catch (SQLException ex) {
            Logger.getLogger(LancamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro no cadastro!");
        }

    }    
    public ArrayList<Lancamento> buscar() {
        ArrayList<Lancamento> arrayLancamento = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM LANÇAMENTO");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Lancamento lancamento = new Lancamento();
                lancamento.setNumero(rs.getDouble("NUMERO"));
                lancamento.setFossa(rs.getBoolean("FOSSA"));
                lancamento.setTipo(rs.getString("TIPO"));
                lancamento.setSumidouro(rs.getBoolean("SUMIDOURO"));
                lancamento.setCursodagua(rs.getBoolean("CURSOAGUA"));
                lancamento.setEsgoto(rs.getBoolean("ESGOTO"));
                lancamento.setPessoas(rs.getInt("NUMEROPESSOAS"));
                lancamento.setAnimais(rs.getInt("NUMEROANIMAIS"));
                lancamento.setCriacao(rs.getBoolean("CRIACAO"));
                lancamento.setDescricao(rs.getString("DESCRICAO"));
                lancamento.setIdMicrobacia(rs.getInt("MICROBACIAS_IDMICROBACIAS"));
                arrayLancamento.add(lancamento);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LancamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayLancamento;
    }    
    public void delete(Object obj){
        double numero = (double) obj;
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM lançamento WHERE numero="+ numero +"");
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Lancamento> buscarJtxt(String valorProcurado){
        ArrayList<Lancamento> array = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt;
            stmt = conn.prepareStatement("SELECT * FROM Lançamento "
                    + "WHERE NUMERO LIKE '"+ valorProcurado+"' OR"
                    + " Fossa LIKE '" + valorProcurado + "' "
                    + "OR tipo LIKE '"+valorProcurado+"' OR "
                    + "sumidouro LIKE '"+valorProcurado+"' OR "
                    + "cursoAgua LIKE '"+valorProcurado+"' OR "
                    + "esgoto LIKE '"+ valorProcurado+"' OR "
                    + "numeroPessoas LIKE '"+valorProcurado+ "' OR "
                    + "criacao LIKE '"+valorProcurado+"' OR "
                    + "numeroAnimais LIKE '" + valorProcurado+ "' OR "
                    + "DESCRICAO LIKE '"+valorProcurado+"';");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Lancamento lancamento = new Lancamento();
                lancamento.setNumero(rs.getDouble("numero"));
                lancamento.setFossa(rs.getBoolean("Fossa"));
                lancamento.setTipo(rs.getString("tipo"));
                lancamento.setSumidouro(rs.getBoolean("sumidouro"));
                lancamento.setCursodagua(rs.getBoolean("cursoAgua"));
                lancamento.setEsgoto(rs.getBoolean("esgoto"));
                lancamento.setPessoas(rs.getInt("numeroPessoas"));
                lancamento.setCriacao(rs.getBoolean("criacao"));
                lancamento.setAnimais(rs.getInt("numeroAnimais"));
                lancamento.setDescricao(rs.getString("Descricao"));
                lancamento.setIdMicrobacia(rs.getInt("Microbacias_idMicrobacias"));
                array.add(lancamento);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return array;
    }
    public ArrayList<Lancamento> buscarPeloCodigo(ArrayList<Microbacia> micro) {
        ArrayList<Lancamento> arrayUso = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            for(int i = 0; i < micro.size();i++){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lançamento WHERE Microbacias_idMicrobacias="+micro.get(i).getIdMicrobacia());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Lancamento lancamento = new Lancamento();
                    lancamento.setNumero(rs.getDouble("numero"));
                    lancamento.setFossa(rs.getBoolean("Fossa"));
                    lancamento.setTipo(rs.getString("tipo"));
                    lancamento.setSumidouro(rs.getBoolean("sumidouro"));
                    lancamento.setCursodagua(rs.getBoolean("cursoAgua"));
                    lancamento.setEsgoto(rs.getBoolean("esgoto"));
                    lancamento.setPessoas(rs.getInt("numeroPessoas"));
                    lancamento.setCriacao(rs.getBoolean("criacao"));
                    lancamento.setAnimais(rs.getInt("numeroAnimais"));
                    lancamento.setDescricao(rs.getString("Descricao"));
                    lancamento.setIdMicrobacia(rs.getInt("Microbacias_idMicrobacias"));
                    arrayUso.add(lancamento);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayUso;
    }
}
