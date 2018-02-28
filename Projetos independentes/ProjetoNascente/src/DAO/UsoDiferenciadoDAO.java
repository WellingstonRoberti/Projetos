/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Microbacia;
import Modelo.UsoDiferenciado;
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
public class UsoDiferenciadoDAO {
        private Connection conn;
    public void Adicionar(Object obj, int codigo){
        try {
            UsoDiferenciado usoDiferenciado =  (UsoDiferenciado) obj;
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO USODIFERENCIADO (NUMERO, DESCRICAO, MICROBACIAS_IDMICROBACIAS) VALUES (?,?,?)");
            stmt.setDouble(1, usoDiferenciado.getNumero());
            stmt.setString(2, usoDiferenciado.getDescricao());
            stmt.setInt(3, codigo);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!");
                    } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro no cadastro!"+ ex);
        }

    }   
    public ArrayList<UsoDiferenciado> buscar() {
        ArrayList<UsoDiferenciado> arrayUsoDiferenciado = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM USODIFERENCIADO");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                UsoDiferenciado usoDiferenciado = new UsoDiferenciado();
                usoDiferenciado.setNumero(rs.getDouble("NUMERO"));
                usoDiferenciado.setDescricao(rs.getString("DESCRICAO"));
                usoDiferenciado.setIdMicrobacia(rs.getInt("MICROBACIAS_IDMICROBACIAS"));
                arrayUsoDiferenciado.add(usoDiferenciado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsoDiferenciadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayUsoDiferenciado;
    }    
    public ArrayList<UsoDiferenciado> buscarJtxt(String valorProcurado){
        ArrayList<UsoDiferenciado> array = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt;
            stmt = conn.prepareStatement("SELECT * FROM usodiferenciado "
                    + "WHERE numero LIKE '"+ valorProcurado+"' OR"
                    + " Descricao LIKE '" + valorProcurado + "';");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                UsoDiferenciado usoDiferenciado = new UsoDiferenciado();
                usoDiferenciado.setNumero(rs.getDouble("numero"));
                usoDiferenciado.setDescricao(rs.getString("Descricao"));
                usoDiferenciado.setIdMicrobacia(rs.getInt("Microbacias_idMicrobacias"));
                array.add(usoDiferenciado);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return array;
    }
    public ArrayList<UsoDiferenciado> buscarPeloCodigo(ArrayList<Microbacia> micro) {
        ArrayList<UsoDiferenciado> arrayUso = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            for(int i = 0; i < micro.size();i++){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM usodiferenciado WHERE Microbacias_idMicrobacias="+micro.get(i).getIdMicrobacia());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    UsoDiferenciado usoDiferenciado = new UsoDiferenciado();
                    usoDiferenciado.setNumero(rs.getDouble("NUMERO"));
                    usoDiferenciado.setDescricao(rs.getString("Descricao"));
                    usoDiferenciado.setIdMicrobacia(rs.getInt("Microbacias_idMicrobacias"));
                    arrayUso.add(usoDiferenciado);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayUso;
    }
}
