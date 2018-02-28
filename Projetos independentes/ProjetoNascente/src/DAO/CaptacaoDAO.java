/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Captacao;
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
public class CaptacaoDAO {
    private Connection conn;
    public void Adicionar(Object obj, int codigo){
        try {
            Captacao captacao =  (Captacao) obj;
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO captacao (NUMERO, TIPO, NUMERORESIDENCIA, NUMEROPESSOAS, DESCRICAO, MICROBACIAS_IDMICROBACIAS) VALUES (?,?,?,?,?,?)");
            stmt.setDouble(1, captacao.getNumero());
            stmt.setString(2, captacao.getTipo());
            stmt.setInt(3, captacao.getResidencia());
            stmt.setInt(4, captacao.getPessoas());
            stmt.setString(5, captacao.getDescricao());
            stmt.setInt(6, codigo);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!");
                    } catch (SQLException ex) {
            Logger.getLogger(CaptacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro no cadastro!");
        }

    }    
    public ArrayList<Captacao> buscar() {
        ArrayList<Captacao> arrayCaptacao = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Captacao");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Captacao captacao = new Captacao();
                captacao.setNumero(rs.getDouble("NUMERO"));
                captacao.setResidencia(rs.getInt("NUMERORESIDENCIA"));
                captacao.setPessoas(rs.getInt("NUMEROPESSOAS"));
                captacao.setTipo(rs.getString("TIPO"));
                captacao.setDescricao(rs.getString("DESCRICAO"));
                captacao.setIdMicrobacia(rs.getInt("MICROBACIAS_IDMICROBACIAS"));
                arrayCaptacao.add(captacao);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CaptacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayCaptacao;
    }    
    public ArrayList<Captacao> buscarJtxt(String valorProcurado){
        ArrayList<Captacao> array = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt;
            stmt = conn.prepareStatement("SELECT * FROM captacao "
                    + "WHERE numero LIKE '"+ valorProcurado+"' OR"
                    + " tipo LIKE '" + valorProcurado + "' "
                    + "OR numeroResidencia LIKE '"+valorProcurado+"' OR "
                    + "numeroPessoas LIKE '"+valorProcurado+"' OR "
                    + "Descricao LIKE '"+ valorProcurado+"';");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Captacao captacao = new Captacao();
                captacao.setNumero(rs.getDouble("numero"));
                captacao.setTipo(rs.getString("tipo"));
                captacao.setResidencia(rs.getInt("numeroResidencia"));
                captacao.setPessoas(rs.getInt("numeroPessoas"));
                captacao.setDescricao(rs.getString("Descricao"));
                captacao.setIdMicrobacia(rs.getInt("idMicrobacias"));
                array.add(captacao);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return array;
    }
public ArrayList<Captacao> buscarPeloCodigo(ArrayList<Microbacia> micro) {
        ArrayList<Captacao> arrayCap = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            for(int i = 0; i < micro.size();i++){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM captacao WHERE Microbacias_idMicrobacias="+micro.get(i).getIdMicrobacia());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Captacao captacao = new Captacao();
                    captacao.setNumero(rs.getDouble("numero"));
                    captacao.setTipo(rs.getString("tipo"));
                    captacao.setResidencia(rs.getInt("numeroResidencia"));
                    captacao.setPessoas(rs.getInt("numeroPessoas"));
                    captacao.setDescricao(rs.getString("Descricao"));
                    captacao.setIdMicrobacia(rs.getInt("Microbacias_idMicrobacias"));
                    arrayCap.add(captacao);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayCap;
    }
}
