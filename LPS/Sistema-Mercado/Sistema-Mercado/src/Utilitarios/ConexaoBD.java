/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junim Roberti
 */
public class ConexaoBD {

    private static Connection conn;
    public ConexaoBD(){
        try{
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MercadoBD", "MercadoBD", "bdlps");
        }catch(SQLException ex){
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //public void executaSQL(String sql){
    //    try {
    //        stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
    //        rs = stm.executeQuery(sql);
    //    } catch (SQLException ex) {
    //        Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
    //        JOptionPane.showMessageDialog(null, "Erro no executaSQL!" + ex.getMessage());
    //    }
    // }
    public static Connection conectar(){
        if(conn == null){
            new ConexaoBD();
        }
        return conn;
    }
    public static void desconecta(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
