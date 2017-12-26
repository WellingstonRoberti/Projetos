/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import academico.Aluno;
import academico.Curso;
import academico.Matricula;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Junim Roberti
 */
public class ImprimirMatricula extends javax.swing.JFrame {

    /**
     * Creates new form ImprimirMatricula
     */
    private Matricula matricula1;
    private Curso curso1;
    private Aluno aluno1;
    public ImprimirMatricula() {
        initComponents();
    }
     public ImprimirMatricula(Matricula matricula, Aluno aluno, Curso curso){
        this.matricula1 = matricula;
        this.aluno1 = aluno;
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

        TabelaMatriculas = new javax.swing.JScrollPane();
        TabelaMatricula = new javax.swing.JTable();
        Sair = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabelaMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número de Matricula", "Data", "Código do Aluno", "Código do Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaMatriculas.setViewportView(TabelaMatricula);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Alterar.setText("Alterar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sair)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TabelaMatriculas, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TabelaMatriculas, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sair)
                    .addComponent(Alterar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        matricula1.apagar();
        for(int i = 0; i < TabelaMatricula.getRowCount();i++){
                Matricula matricula = new Matricula();
                matricula.setNumero(Integer.parseInt(TabelaMatricula.getValueAt(i, 0).toString()));
                matricula.setData(TabelaMatricula.getValueAt(i,1).toString());
                aluno1.getArrayAluno().get(i).setNome(TabelaMatricula.getValueAt(i,2).toString());
                curso1.getArrayCurso().get(i).setNome(TabelaMatricula.getValueAt(i,3).toString());
                matricula1.setArrayMatricula(matricula);
        }
        dispose();
    }//GEN-LAST:event_SairActionPerformed
    public String VarrerAluno(int cod){
        for(int i = 0; i < aluno1.getArrayAluno().size();i++){
            if(aluno1.getArrayAluno().get(i).getCodigo() == cod){
                System.out.print(aluno1.getArrayAluno().get(i).getCodigo());
                return aluno1.getArrayAluno().get(i).getNome();
            }
        }
        return "Aluno nao existente";
    }
    public String VarrerCurso(int cod){
        for(int i = 0; i < curso1.getArrayCurso().size();i++){
            if(curso1.getArrayCurso().get(i).getCodigo() == cod){
                return curso1.getArrayCurso().get(i).getNome();
            }
        }
        return "Curso não existente";
    }
    public void imprimirMatricula(){
        DefaultTableModel modeloTabela = (DefaultTableModel)TabelaMatricula.getModel();
        modeloTabela = new DefaultTableModel(new String[] {"Número de Matrícula", "Data", "Nome do Curso", "Nome do Aluno"}, 0);
        for (int i = 0; i < matricula1.getArrayMatricula().size(); i++){
            String nomeAlu = null, nomeCurso = null;
            nomeAlu = VarrerAluno(matricula1.getArrayMatricula().get(i).getCodAluno());
            nomeCurso = VarrerCurso(matricula1.getArrayMatricula().get(i).getCodCurso());
            Object[] data = {matricula1.getArrayMatricula().get(i).getNumero(), matricula1.getArrayMatricula().get(i).getData(), nomeCurso, nomeAlu};
            modeloTabela.addRow(data);
        }
        TabelaMatricula.setModel(modeloTabela);
    }
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
            java.util.logging.Logger.getLogger(ImprimirMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImprimirMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImprimirMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImprimirMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>TabelaMatricula   /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImprimirMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Sair;
    private javax.swing.JTable TabelaMatricula;
    private javax.swing.JScrollPane TabelaMatriculas;
    // End of variables declaration//GEN-END:variables
}