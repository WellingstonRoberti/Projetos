/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import View.JfrmLogin;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author Junim Roberti
 */
public class SistemaMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            JfrmLogin login = new JfrmLogin();
            login.setLocationRelativeTo(null);
            login.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
            login.setVisible(true);
            while(login.isEnabled()){
                boolean capsLigado = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK );
                if ( capsLigado ) {
                    login.getjLabel5().setText("CAPSLOCK LIGADO!");
                } else {
                    login.getjLabel5().setText("");
                }
            }
    }
    
}
