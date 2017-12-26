/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.EnderecoControle;
import Controle.FornecedorControle;
import Modelo.Endereco;
import Modelo.Fornecedor;
import Utilitarios.ApenasNumeros;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leticia Ribeiro
 */
public class JfrmAlterarFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form JfrmAlterarFornecedor
     */
    public JfrmAlterarFornecedor() {
        initComponents();
        jtxtBuscado.setDocument(new ApenasNumeros());
        carregaTabela();
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
        jtblFornecedor = new javax.swing.JTable();
        jtxtBuscado = new javax.swing.JTextField();
        jbtnPesquisar = new javax.swing.JButton();
        jbtnSair3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnAlterar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtblFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblFornecedor);

        jtxtBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscadoActionPerformed(evt);
            }
        });

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
        jLabel1.setText("Alterar Fornecedor");

        jbtnAlterar.setText("Alterar");
        jbtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo do Fornecedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtxtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(jbtnPesquisar))))
                        .addGap(0, 171, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnSair3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAlterar)
                    .addComponent(jbtnSair3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBuscadoActionPerformed

    private void jbtnSair3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSair3ActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnSair3ActionPerformed

    private void jbtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPesquisarActionPerformed
        // TODO add your handling code here:
        carregaBusca(Integer.parseInt(jtxtBuscado.getText()));
    }//GEN-LAST:event_jbtnPesquisarActionPerformed
    private void carregaTabela(){
            
            ArrayList<Endereco> arrayEndereco = new ArrayList<>();
            EnderecoControle enderecoControle = new EnderecoControle();
            FornecedorControle fornecedorControle = new FornecedorControle();
            DefaultTableModel tableModel = (DefaultTableModel)jtblFornecedor.getModel();            
            tableModel = new DefaultTableModel(new String[]{"Codigo","Nome", "CPF","CNPJ", "Telefone", "Rua", "Numero", "Bairro", "Cidade"},0);
            
         for(int i=0; i < fornecedorControle.buscar().size(); i++){
            for (int j=0;j<enderecoControle.busca().size();j++){
                    if(fornecedorControle.buscar().get(i).getCodigoEndereco()== enderecoControle.busca().get(j).getCodigo()){
                            
                    arrayEndereco.add(enderecoControle.busca().get(j));
              
                    }
                }
        }
            for(int i=0; i < fornecedorControle.buscar().size(); i++){
                
                Object [] dados = {
                    
                    fornecedorControle.buscar().get(i).getCodigo(),
                    fornecedorControle.buscar().get(i).getNomeFornecedor(),
                    fornecedorControle.buscar().get(i).getCpfFornecedor(),
                    fornecedorControle.buscar().get(i).getCnpjFornecedor(),
                    fornecedorControle.buscar().get(i).getTelefone(),
                    arrayEndereco.get(i).getRua(),
                    arrayEndereco.get(i).getNumero(),
                    arrayEndereco.get(i).getBairro(),
                    arrayEndereco.get(i).getCidade()};
                    
                    
                tableModel.addRow(dados);
                
            }
            jtblFornecedor.setModel(tableModel);
      
    }
    private void carregaBusca(int k){
            ArrayList<Endereco> arrayEndereco = new ArrayList<>();
            EnderecoControle enderecoControle = new EnderecoControle();
            FornecedorControle fornecedorControle = new FornecedorControle();
            DefaultTableModel tableModel = (DefaultTableModel)jtblFornecedor.getModel();     
            tableModel = new DefaultTableModel(new String[]{"Codigo","Nome", "CPF","CNPJ" , "Telefone", "Rua", "Numero", "Bairro", "Cidade"},0);
            
         for(int i=0; i < fornecedorControle.buscar().size(); i++){
            for (int j=0;j<enderecoControle.busca().size();j++){
                    if(fornecedorControle.buscar().get(i).getCodigoEndereco()== enderecoControle.busca().get(j).getCodigo()){
                            
                    arrayEndereco.add(enderecoControle.busca().get(j));
              
                    }
                }
        }
            for(int i=0; i < fornecedorControle.buscar().size(); i++){
                if (fornecedorControle.buscar().get(i).getCodigo() == k){
                Object [] dados = {
                    
                    fornecedorControle.buscar().get(i).getCodigo(),
                    fornecedorControle.buscar().get(i).getNomeFornecedor(),
                    fornecedorControle.buscar().get(i).getCpfFornecedor(),
                    fornecedorControle.buscar().get(i).getCnpjFornecedor(),
                    fornecedorControle.buscar().get(i).getTelefone(),
                    arrayEndereco.get(i).getRua(),
                    arrayEndereco.get(i).getNumero(),
                    arrayEndereco.get(i).getBairro(),
                    arrayEndereco.get(i).getCidade()};
                    
                tableModel.addRow(dados); 
                }     
              
                
            }
            jtblFornecedor.setModel(tableModel);
      
    }
    private void jbtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarActionPerformed
        // TODO add your handling code here:
        ArrayList<Fornecedor> array = new ArrayList<>();
        ArrayList<Endereco> array2 = new ArrayList<>();
      
        for(int i = 0; i < jtblFornecedor.getRowCount(); i++){
            Fornecedor fornecedor = new Fornecedor();
            Endereco endereco = new Endereco();
            fornecedor.setCodigo(Integer.parseInt(jtblFornecedor.getValueAt(i, 0).toString()));
            fornecedor.setNomeFornecedor(jtblFornecedor.getValueAt(i, 1).toString());
            fornecedor.setCpfFornecedor(jtblFornecedor.getValueAt(i, 2).toString());
            fornecedor.setCnpjFornecedor(jtblFornecedor.getValueAt(i, 3).toString());
            fornecedor.setTelefone(jtblFornecedor.getValueAt(i, 4).toString());
            endereco.setRua(jtblFornecedor.getValueAt(i, 5).toString());
            endereco.setNumero(jtblFornecedor.getValueAt(i, 6).toString());
            endereco.setBairro(jtblFornecedor.getValueAt(i, 7).toString());
            endereco.setCidade(jtblFornecedor.getValueAt(i, 8).toString());
            array.add(fornecedor);
            array2.add(endereco);            
        }
        FornecedorControle fornecedorControle = new FornecedorControle();        
        try {
            fornecedorControle.updateFornecedor(array,array2);
        } catch (SQLException ex) {
            Logger.getLogger(JfrmAlterarFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!"); 
        
    }//GEN-LAST:event_jbtnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmAlterarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmAlterarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmAlterarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmAlterarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmAlterarFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAlterar;
    private javax.swing.JButton jbtnPesquisar;
    private javax.swing.JButton jbtnSair3;
    private javax.swing.JTable jtblFornecedor;
    private javax.swing.JTextField jtxtBuscado;
    // End of variables declaration//GEN-END:variables
}
