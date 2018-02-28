/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Captacao;
import Modelo.Curral;
import Modelo.Lancamento;
import Modelo.Microbacia;
import Modelo.Microbacia;
import Modelo.Nascentes;
import Modelo.ReservaLegal;
import Modelo.UsoDiferenciado;
import Utilitario.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author junim
 */
public class MicrobaciaDAO {
        private Connection conn;
        public int adicionar(Object obj) {
        try {
            int temp = 0;
            Microbacia microbacia = (Microbacia) obj;
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO MICROBACIAS (NOME, PONTO, DATA, PROPRIEDADE) VALUES (?,?,?,?)");
            stmt.setString(1, microbacia.getNome());
            stmt.setDouble(2, microbacia.getPonto());
            stmt.setString(3, microbacia.getData());
            stmt.setString(4, microbacia.getPropriedade());          
            stmt.execute();
            stmt = conn.prepareStatement("SELECT * FROM MICROBACIAS");
            stmt.executeQuery();
            while(stmt.getResultSet().next()){
                temp = stmt.getResultSet().getInt("IDMICROBACIAS");
            }
            return temp;
        } catch (SQLException ex) {
            Logger.getLogger(MicrobaciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public Microbacia Buscar(int idMicro){
        Microbacia microbacia = new Microbacia();
        try {
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM MICROBACIAS WHERE IDMICROBACIAS="+ idMicro);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                microbacia.setNome(rs.getString("NOME"));
                microbacia.setData(rs.getString("DATA"));
                microbacia.setPonto(rs.getDouble("PONTO"));
                microbacia.setPropriedade(rs.getString("PROPRIEDADE"));
                microbacia.setIdMicrobacia(rs.getInt("idMicrobacias"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MicrobaciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return microbacia;
    }    
    public ArrayList<Microbacia> buscarJtxt(String valorProcurado){
        ArrayList<Microbacia> array = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt;
            stmt = conn.prepareStatement("SELECT * FROM microbacias "
                    + "WHERE Nome LIKE '"+ valorProcurado+"' OR"
                    + " Ponto LIKE '" + valorProcurado + "' "
                    + "OR Data LIKE '"+valorProcurado+"' OR "
                    + "Propriedade LIKE '"+valorProcurado+"';");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Microbacia microbacia = new Microbacia();
                microbacia.setNome(rs.getString("NOME"));
                microbacia.setData(rs.getString("DATA"));
                microbacia.setPonto(rs.getDouble("PONTO"));
                microbacia.setPropriedade(rs.getString("PROPRIEDADE"));
                microbacia.setIdMicrobacia(rs.getInt("idMicrobacias"));
                array.add(microbacia);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return array;
    }
    public void delete(Object obj){
        double numero = (double) obj;
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM microbacias WHERE Ponto="+ numero +"");
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Microbacia> buscarPeloCodigo(ArrayList<Nascentes> nasce) {
        ArrayList<Microbacia> arrayMicro = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            for(int i = 0; i < nasce.size();i++){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM microbacias WHERE idMicrobacias="+nasce.get(i).getIdMicrobacia());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Microbacia microbacia = new Microbacia();
                    microbacia.setNome(rs.getString("Nome"));
                    microbacia.setData(rs.getString("data"));
                    microbacia.setPonto(rs.getDouble("Ponto"));
                    microbacia.setPropriedade(rs.getString("Propriedade"));
                    arrayMicro.add(microbacia);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMicro;
    }
    public ArrayList<Microbacia> buscarPeloCodigo1(ArrayList<Captacao> nasce) {
        ArrayList<Microbacia> arrayMicro = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            for(int i = 0; i < nasce.size();i++){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM microbacias WHERE idMicrobacias="+nasce.get(i).getIdMicrobacia());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Microbacia microbacia = new Microbacia();
                    microbacia.setNome(rs.getString("Nome"));
                    microbacia.setData(rs.getString("data"));
                    microbacia.setPonto(rs.getDouble("Ponto"));
                    microbacia.setPropriedade(rs.getString("Propriedade"));
                    arrayMicro.add(microbacia);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMicro;
    }
    public ArrayList<Microbacia> buscarPeloCodigo2(ArrayList<Curral> nasce) {
        ArrayList<Microbacia> arrayMicro = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            for(int i = 0; i < nasce.size();i++){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM microbacias WHERE idMicrobacias="+nasce.get(i).getIdMicrobacia());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Microbacia microbacia = new Microbacia();
                    microbacia.setNome(rs.getString("Nome"));
                    microbacia.setData(rs.getString("data"));
                    microbacia.setPonto(rs.getDouble("Ponto"));
                    microbacia.setPropriedade(rs.getString("Propriedade"));
                    arrayMicro.add(microbacia);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMicro;
    }
    public ArrayList<Microbacia> buscarPeloCodigo3(ArrayList<Lancamento> nasce) {
        ArrayList<Microbacia> arrayMicro = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            for(int i = 0; i < nasce.size();i++){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM microbacias WHERE idMicrobacias="+nasce.get(i).getIdMicrobacia());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Microbacia microbacia = new Microbacia();
                    microbacia.setNome(rs.getString("Nome"));
                    microbacia.setData(rs.getString("data"));
                    microbacia.setPonto(rs.getDouble("Ponto"));
                    microbacia.setPropriedade(rs.getString("Propriedade"));
                    arrayMicro.add(microbacia);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMicro;
    }
    public ArrayList<Microbacia> buscarPeloCodigo4(ArrayList<ReservaLegal> nasce) {
        ArrayList<Microbacia> arrayMicro = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            for(int i = 0; i < nasce.size();i++){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM microbacias WHERE idMicrobacias="+nasce.get(i).getIdMicrobacia());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Microbacia microbacia = new Microbacia();
                    microbacia.setNome(rs.getString("Nome"));
                    microbacia.setData(rs.getString("data"));
                    microbacia.setPonto(rs.getDouble("Ponto"));
                    microbacia.setPropriedade(rs.getString("Propriedade"));
                    arrayMicro.add(microbacia);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMicro;
    }
    public ArrayList<Microbacia> buscarPeloCodigo5(ArrayList<UsoDiferenciado> nasce) {
        ArrayList<Microbacia> arrayMicro = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            for(int i = 0; i < nasce.size();i++){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM microbacias WHERE idMicrobacias="+nasce.get(i).getIdMicrobacia());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Microbacia microbacia = new Microbacia();
                    microbacia.setNome(rs.getString("Nome"));
                    microbacia.setData(rs.getString("data"));
                    microbacia.setPonto(rs.getDouble("Ponto"));
                    microbacia.setPropriedade(rs.getString("Propriedade"));
                    arrayMicro.add(microbacia);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMicro;
    }
}
