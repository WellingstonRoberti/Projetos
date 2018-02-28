/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Curral;
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
public class CurralDAO {
    private Connection conn;
    public void Adicionar(Object obj, int codigo){
        try {
            Curral curral =  (Curral) obj;
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Curral (NUMERO, lancamento, ANIMAIS, HIGIENIZACAO, DESCRICAO, MICROBACIAS_IDMICROBACIAS) VALUES (?,?,?,?,?,?)");
            stmt.setDouble(1, curral.getNumero());
            stmt.setString(2, curral.getLancamento());
            stmt.setInt(3, curral.getAnimais());
            stmt.setString(4, curral.getHigienizacao());
            stmt.setString(5, curral.getDescricao());
            stmt.setInt(6, codigo);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!");
                    } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro no cadastro!");
        }

    }    
    public ArrayList<Curral> buscar() {
        ArrayList<Curral> arrayCurral = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Curral");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Curral curral = new Curral();
                curral.setNumero(rs.getDouble("NUMERO"));
                curral.setLancamento(rs.getString("LANCAMENTO"));
                curral.setHigienizacao(rs.getString("HIGIENIZACAO"));
                curral.setAnimais(rs.getInt("ANIMAIS"));
                curral.setDescricao(rs.getString("DESCRICAO"));
                curral.setIdMicrobacia(rs.getInt("MICROBACIAS_IDMICROBACIAS"));
                arrayCurral.add(curral);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CurralDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayCurral;
    }    
    public ArrayList<Curral> buscarJtxt(String valorProcurado){
        ArrayList<Curral> array = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt;
            stmt = conn.prepareStatement("SELECT * FROM Curral "
                    + "WHERE numero LIKE '"+ valorProcurado+"' OR"
                    + " lancamento LIKE '" + valorProcurado + "' "
                    + "OR animais LIKE '"+valorProcurado+"' OR "
                    + "higienizacao LIKE '"+valorProcurado+"' OR "
                    + "Descricao LIKE '"+valorProcurado+"';");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Curral curral = new Curral();
                curral.setNumero(rs.getDouble("numero"));
                curral.setLancamento(rs.getString("lancamento"));
                curral.setAnimais(rs.getInt("animais"));
                curral.setHigienizacao(rs.getString("higienizacao"));
                curral.setDescricao(rs.getString("Descricao"));
                curral.setIdMicrobacia(rs.getInt("Microbacias_idMicrobacias"));
                array.add(curral);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return array;
    }
    public ArrayList<Curral> buscarPeloCodigo(ArrayList<Microbacia> micro) {
        ArrayList<Curral> arrayUso = new ArrayList<>();
        try {
            conn = ConexaoBD.conectar();
            for(int i = 0; i < micro.size();i++){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM curral WHERE Microbacias_idMicrobacias="+micro.get(i).getIdMicrobacia());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Curral curral = new Curral();
                    curral.setNumero(rs.getDouble("numero"));
                    curral.setLancamento(rs.getString("lancamento"));
                    curral.setAnimais(rs.getInt("animais"));
                    curral.setHigienizacao(rs.getString("higienizacao"));
                    curral.setDescricao(rs.getString("Descricao"));
                    curral.setIdMicrobacia(rs.getInt("Microbacias_idMicrobacias"));
                    arrayUso.add(curral);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NascenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayUso;
    }
}
