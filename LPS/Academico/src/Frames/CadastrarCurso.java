/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import academico.Curso;
import javax.swing.JOptionPane;

/**
 *
 * @author Junim Roberti
 */
public class CadastrarCurso extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarCurso
     */
    private Curso curso1;
    public CadastrarCurso() {
        initComponents();
    }
    public CadastrarCurso(Curso curso){
          this.curso1 = curso;
          initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastrarCurso = new javax.swing.JPanel();
        CodigoCursoLab = new javax.swing.JLabel();
        NomeCursoLab = new javax.swing.JLabel();
        CodigoCursoText = new javax.swing.JTextField();
        NomeCursoText = new javax.swing.JTextField();
        CargaCursoText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Sair = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        Enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CadastrarCurso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cadastrar Curso"));
        CadastrarCurso.setPreferredSize(new java.awt.Dimension(263, 127));

        CodigoCursoLab.setText("Código do Curso:");

        NomeCursoLab.setText("Nome do Curso:");

        NomeCursoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCursoTextActionPerformed(evt);
            }
        });

        CargaCursoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaCursoTextActionPerformed(evt);
            }
        });

        jLabel1.setText("Carga Horária:");

        javax.swing.GroupLayout CadastrarCursoLayout = new javax.swing.GroupLayout(CadastrarCurso);
        CadastrarCurso.setLayout(CadastrarCursoLayout);
        CadastrarCursoLayout.setHorizontalGroup(
            CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CodigoCursoLab, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NomeCursoLab, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NomeCursoText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(CargaCursoText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CodigoCursoText))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        CadastrarCursoLayout.setVerticalGroup(
            CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoCursoLab)
                    .addComponent(CodigoCursoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeCursoLab)
                    .addComponent(NomeCursoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CargaCursoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Enviar.setText("Enviar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CadastrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sair)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CadastrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sair)
                    .addComponent(Limpar)
                    .addComponent(Enviar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        CodigoCursoText.setText("");
        NomeCursoText.setText("");
        CargaCursoText.setText("");
    }//GEN-LAST:event_LimparActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        // TODO add your handling code here:
        if (CargaCursoText.getText().isEmpty() || CodigoCursoText.getText().isEmpty() || NomeCursoText.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
        }else{
        //int JP = 0;
        Curso curso2 = new Curso();
        curso2.lerDadosCurso(curso2, CargaCursoText.getText(), CodigoCursoText.getText(), NomeCursoText.getText());
        curso1.setArrayCurso(curso2);
        JOptionPane.showMessageDialog(null, "Curso Cadastrado!!", "Sistema Academico", 1);
       //JP = JOptionPane.showConfirmDialog(null, "Você deseja Cadastradar outro Curso?", "Sistema Academico", 0, 3);
        //if(JP == 0){
            dispose();
       //     CadastrarAluno frame = new CadastrarAluno();
       //     frame.setLocationRelativeTo(null);
        //    frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
       //     frame.setVisible(true);
       // }else{
       //     dispose();
       //   }       
        }
    }//GEN-LAST:event_EnviarActionPerformed

    private void NomeCursoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeCursoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeCursoTextActionPerformed

    private void CargaCursoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaCursoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargaCursoTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastrarCurso;
    private javax.swing.JTextField CargaCursoText;
    private javax.swing.JLabel CodigoCursoLab;
    private javax.swing.JTextField CodigoCursoText;
    private javax.swing.JButton Enviar;
    private javax.swing.JButton Limpar;
    private javax.swing.JLabel NomeCursoLab;
    private javax.swing.JTextField NomeCursoText;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
