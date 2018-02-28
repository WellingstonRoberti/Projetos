/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Microbacia;
import Modelo.ReservaLegal;
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
public class ReservaLegalDAO {
     private Connection conn;
    public void Adicionar(Object obj, int codigo){
        try {
            ReservaLegal reservaLegal =  (ReservaLegal) obj;
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO ReservaLegal (CERCAMENTO, SITUACAO, EROSAO, ANIMAIS, DISTANCIA, INVASOR, AREA, DESCRICAO, MICROBACIAS_IDMICROBACIAS) VALUES (?,?,?,?,?,?,?,?,?)");
            stmt.setBoolean(1, reservaLegal.getCercamento());
            stmt.setString(2, reservaLegal.getSituacao());
            stmt.setBoolean(3, reservaLegal.getErosao());
            stmt.setBoolean(4, reservaLegal.getAnimais());
            stmt.setDouble(5, reservaLegal.getDistancia());
            stmt.setBoolean(6, reservaLegal.getInvasor());
            stmt.setDouble(7, reservaLegal.getArea());
            stmt.setString(8, reservaLegal.getDescricao());
            stmt.setInt(9, codigo);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!");
                    } catch (SQLException ex) {
            Logger.getLogger(ReservaLegalDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro no cadastro!");
        }

    }    
    public ArrayList<ReservaLegal> buscar() {
        ArrayList<ReservaLegal> arrayReservaLegal = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ReservaLegal");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ReservaLegal reservaLegal = new ReservaLegal();
                reservaLegal.setCercamento(rs.getBoolean("CERCAMENTO"));
                reservaLegal.setSituacao(rs.getString("SITUACAO"));
                reservaLegal.setErosao(rs.getBoolean("EROSAO"));
                reservaLegal.setAnimais(rs.getBoolean("ANIMAIS"));
                reservaLegal.setDistancia(rs.getDouble("DISTANCIA"));
                reservaLegal.setInvasor(rs.getBoolean("INVASOR"));
                reservaLegal.setArea(rs.getDouble("AREA"));
                reservaLegal.setDescricao(rs.getString("DESCRICAO"));
                reservaLegal.setIdMicrobacia(rs.getInt("MICROBACIAS_IDMICROBACIAS"));
                arrayReservaLegal.add(reservaLegal);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservaLegalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayReservaLegal;
    }    
    public ArrayList<ReservaLegal> buscarJtxt(String valorProcurado){
        ArrayList<ReservaLegal> array = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt;
            stmt = conn.prepareStatement("SELECT * FROM reservalegal "
                    + "WHERE Cercamento LIKE '"+ valorProcurado+"' OR"
                    + " area LIKE '" + valorProcurado + "' "
                    + "OR situacao LIKE '"+valorProcurado+"' OR "
                    + "EROSAO LIKE '"+valorProcurado+ "' OR "
                    + "ANIMAIS LIKE '"+valorProcurado+"' OR "
                    + "DISTANCIA LIKE '" + valorProcurado+ "' OR "
                    + "invasor LIKE '"+ valorProcurado+"' OR "
                    + "DESCRICAO LIKE '"+valorProcurado+"';");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ReservaLegal reservaLegal = new ReservaLegal();
                reservaLegal.setCercamento(rs.getBoolean("Cercamento"));
                reservaLegal.setArea(rs.getDouble("area"));
                reservaLegal.setSituacao(rs.getString("situacao"));
                reservaLegal.setErosao(rs.getBoolean("erosao"));
                reservaLegal.setAnimais(rs.getBoolean("animais"));
                reservaLegal.setDistancia(rs.getDouble("distancia"));
                reservaLegal.setInvasor(rs.getBoolean("invasor"));
                reservaLegal.setDescricao(rs.getString("descricao"));
                reservaLegal.setIdMicrobacia(rs.getInt("Microbacias_idMicrobacias"));
                array.add(reservaLegal);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return array;
    }
    public ArrayList<ReservaLegal> buscarPeloCodigo(ArrayList<Microbacia> micro) {
        ArrayList<ReservaLegal> arrayUso = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            for(int i = 0; i < micro.size();i++){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM reservalegal WHERE Microbacias_idMicrobacias="+micro.get(i).getIdMicrobacia());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    ReservaLegal reservaLegal = new ReservaLegal();
                    reservaLegal.setCercamento(rs.getBoolean("Cercamento"));
                    reservaLegal.setArea(rs.getDouble("area"));
                    reservaLegal.setSituacao(rs.getString("situacao"));
                    reservaLegal.setErosao(rs.getBoolean("erosao"));
                    reservaLegal.setAnimais(rs.getBoolean("animais"));
                    reservaLegal.setDistancia(rs.getDouble("distancia"));
                    reservaLegal.setInvasor(rs.getBoolean("invasor"));
                    reservaLegal.setDescricao(rs.getString("descricao"));
                    reservaLegal.setIdMicrobacia(rs.getInt("Microbacias_idMicrobacias"));
                    arrayUso.add(reservaLegal);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayUso;
    }
}
