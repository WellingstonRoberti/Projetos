/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitario;

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
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:~/BDNascente", "BDNascente","nascente");
        }catch(SQLException ex){
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
