/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.EnderecoControle;
import Controle.FuncionarioControle;
import Modelo.Endereco;
import Modelo.Funcionario;
import Utilitarios.ApenasNumeros;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leticia Ribeiro
 */
public class JfrmBuscarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form JfrmConsultaFuncionario
     */
    public JfrmBuscarFuncionario() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblFuncionario = new javax.swing.JTable();
        jtxtBuscado = new javax.swing.JTextField();
        jbtnPesquisar = new javax.swing.JButton();
        jbtnSair3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtblFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblFuncionario);

        jbtnPesquisar.setText("Pesquisar");
        jbtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPesquisarActionPerformed(evt);
            }
        });

        jbtnSair3.setText("Sair");
        jbtnSair3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSair3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Buscar Funcionário");

        jLabel2.setText("Nome do Funcionário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnPesquisar))
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addComponent(jbtnSair3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSair3)
                    .addComponent(jtxtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPesquisar))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSair3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSair3ActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnSair3ActionPerformed

    private void jbtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPesquisarActionPerformed
        // TODO add your handling code here:
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeFuncionario(jtxtBuscado.getText());
        FuncionarioControle funcionarioControle = new FuncionarioControle();
        EnderecoControle enderecoControle = new EnderecoControle();
        DefaultTableModel modeloTabela = (DefaultTableModel)jtblFuncionario.getModel();
        modeloTabela = new DefaultTableModel(new String[] {"Código", "Tipo", "Nome", "Rua", "Número", "Bairro", "Cidade"}, 0);
        ArrayList<Funcionario> funcionarioBuscado = funcionarioControle.buscaApenasUm(funcionario.getNomeFuncionario());
        ArrayList<Endereco> enderecoBuscado = enderecoControle.buscarEndFuncionario(funcionarioBuscado);
        
        for(int i = 0; i < funcionarioBuscado.size();i++){
            Object[] data = {
                funcionarioBuscado.get(i).getCodigo(),
                funcionarioBuscado.get(i).getTipo(),
                funcionarioBuscado.get(i).getNomeFuncionario(),
                enderecoBuscado.get(i).getRua(),
                enderecoBuscado.get(i).getNumero(),
                enderecoBuscado.get(i).getBairro(),
                enderecoBuscado.get(i).getCidade(),
                };                
            modeloTabela.addRow(data);
        }
        jtblFuncionario.setModel(modeloTabela);
    }//GEN-LAST:event_jbtnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmBuscarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmBuscarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmBuscarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmBuscarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmBuscarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnPesquisar;
    private javax.swing.JButton jbtnSair3;
    private javax.swing.JTable jtblFuncionario;
    private javax.swing.JTextField jtxtBuscado;
    // End of variables declaration//GEN-END:variables
}