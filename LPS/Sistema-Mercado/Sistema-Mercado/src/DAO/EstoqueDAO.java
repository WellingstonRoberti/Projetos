/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modelo.Estoque;
import Utilitarios.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Junim Roberti
 */
public class EstoqueDAO implements InterfaceDAO{
    private Connection conn;
    public int adicionar(Object obj) {
        try {
            int temp = 0;
            Estoque estoque = (Estoque) obj;
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Estoque (quantidadetotal, quantidadeatual) VALUES (?,?)");
            stmt.setString(1, Float.toString(estoque.getQuantidadeTotal()));
            stmt.setString(2, Float.toString(estoque.getQuantidadeAtual()));
            stmt.execute();
            stmt = conn.prepareStatement("SELECT * FROM estoque");
            stmt.executeQuery();
            while(stmt.getResultSet().next()){
                temp = stmt.getResultSet().getInt("codigoEstoque");
            }
            return temp;
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public void excluir(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adiciona(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}