/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Microbacia;
import Modelo.Nascentes;
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
public class NascenteDAO {
    private Connection conn;
    public void Adicionar(Object obj, int codigo){
        try {
            Nascentes nascentes =  (Nascentes) obj;
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Nascentes (NUMERO, CERCAMENTO, CONSTRUCAO, OBS, APP, EROSAO, ANIMAIS, DISTANCIA, INSAVOR, RAIO, DESCRICAO, MICROBACIAS_IDMICROBACIAS) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setDouble(1, nascentes.getNumero());
            stmt.setBoolean(2, nascentes.getCercamento());
            stmt.setBoolean(3, nascentes.getContrucao());
            stmt.setString(4, nascentes.getObs());
            stmt.setString(5, nascentes.getApp());
            stmt.setBoolean(6, nascentes.getErosao());
            stmt.setBoolean(7, nascentes.getAnimais());
            stmt.setDouble(8, nascentes.getDistancia());
            stmt.setBoolean(9, nascentes.getInvasor());
            stmt.setDouble(10, nascentes.getRaio());
            stmt.setString(11, nascentes.getDescricao());
            stmt.setInt(12, codigo);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!");
                    } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro no cadastro!");
        }

    }
    public ArrayList<Nascentes> buscar() {
        ArrayList<Nascentes> arrayNascente = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM nascentes");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Nascentes nascentes = new Nascentes();
                nascentes.setNumero(rs.getDouble("NUMERO"));
                nascentes.setCercamento(rs.getBoolean("CERCAMENTO"));
                nascentes.setContrucao(rs.getBoolean("CONSTRUCAO"));
                nascentes.setObs(rs.getString("OBS"));
                nascentes.setApp(rs.getString("APP"));
                nascentes.setErosao(rs.getBoolean("EROSAO"));
                nascentes.setAnimais(rs.getBoolean("ANIMAIS"));
                nascentes.setDistancia(rs.getDouble("DISTANCIA"));
                nascentes.setInvasor(rs.getBoolean("INSAVOR"));
                nascentes.setDescricao(rs.getString("DESCRICAO"));
                nascentes.setRaio(rs.getDouble("RAIO"));
                nascentes.setIdMicrobacia(rs.getInt("MICROBACIAS_IDMICROBACIAS"));
                arrayNascente.add(nascentes);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayNascente;
    }
    public ArrayList<Nascentes> buscarJtxt(String valorProcurado){
        ArrayList<Nascentes> array = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt;
            stmt = conn.prepareStatement("SELECT * FROM nascentes "
                    + "WHERE NUMERO LIKE '"+ valorProcurado+"' OR"
                    + " CERCAMENTO LIKE '" + valorProcurado + "' "
                    + "OR RAIO LIKE '"+valorProcurado+"' OR "
                    + "CONSTRUCAO LIKE '"+valorProcurado+"' OR "
                    + "OBS LIKE '"+valorProcurado+"' OR "
                    + "APP LIKE '"+ valorProcurado+"' OR "
                    + "EROSAO LIKE '"+valorProcurado+ "' OR "
                    + "ANIMAIS LIKE '"+valorProcurado+"' OR "
                    + "DISTANCIA LIKE '" + valorProcurado+ "' OR "
                    + "INSAVOR LIKE '"+ valorProcurado+"' OR "
                    + "DESCRICAO LIKE '"+valorProcurado+"';");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Nascentes nascentes = new Nascentes();
                nascentes.setNumero(rs.getDouble("NUMERO"));
                nascentes.setCercamento(rs.getBoolean("CERCAMENTO"));
                nascentes.setContrucao(rs.getBoolean("CONSTRUCAO"));
                nascentes.setObs(rs.getString("OBS"));
                nascentes.setApp(rs.getString("APP"));
                nascentes.setErosao(rs.getBoolean("EROSAO"));
                nascentes.setAnimais(rs.getBoolean("ANIMAIS"));
                nascentes.setDistancia(rs.getDouble("DISTANCIA"));
                nascentes.setInvasor(rs.getBoolean("INSAVOR"));
                nascentes.setDescricao(rs.getString("DESCRICAO"));
                nascentes.setRaio(rs.getDouble("RAIO"));
                nascentes.setIdMicrobacia(rs.getInt("Microbacias_idMicrobacias"));
                array.add(nascentes);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return array;
    }

    public ArrayList<Nascentes> buscarPeloCodigo(ArrayList<Microbacia> micro) {
        ArrayList<Nascentes> arrayNascente = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            for(int i = 0; i < micro.size();i++){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM nascentes WHERE Microbacias_idMicrobacias="+micro.get(i).getIdMicrobacia());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Nascentes nascentes = new Nascentes();
                    nascentes.setNumero(rs.getDouble("NUMERO"));
                    nascentes.setCercamento(rs.getBoolean("CERCAMENTO"));
                    nascentes.setContrucao(rs.getBoolean("CONSTRUCAO"));
                    nascentes.setObs(rs.getString("OBS"));
                    nascentes.setApp(rs.getString("APP"));
                    nascentes.setErosao(rs.getBoolean("EROSAO"));
                    nascentes.setAnimais(rs.getBoolean("ANIMAIS"));
                    nascentes.setDistancia(rs.getDouble("DISTANCIA"));
                    nascentes.setInvasor(rs.getBoolean("INSAVOR"));
                    nascentes.setDescricao(rs.getString("DESCRICAO"));
                    nascentes.setRaio(rs.getDouble("RAIO"));
                    nascentes.setIdMicrobacia(rs.getInt("Microbacias_idMicrobacias"));
                    arrayNascente.add(nascentes);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayNascente;
    }
}
