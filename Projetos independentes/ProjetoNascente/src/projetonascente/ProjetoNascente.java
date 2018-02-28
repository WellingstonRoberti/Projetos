/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonascente;

import Utilitario.ConexaoBD;
import View.Menu;
import javax.swing.UIManager;

/**
 *
 * @author junim
 */
public class ProjetoNascente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{    
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception e){
            
        }
            Menu Menu = new Menu();
            Menu.setTitle("Formulários de Propriedades");
            Menu.setLocationRelativeTo(null);
            Menu.setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
            Menu.setVisible(true);
    }
    
}
