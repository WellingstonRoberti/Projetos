/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.EnderecoControle;
import Controle.FornecedorControle;
import Modelo.Endereco;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Junim Roberti
 */
public class JfrmRelatorioFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form JfrmRelatorioFornecedor
     */
    public JfrmRelatorioFornecedor() {
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

        jLabel1 = new javax.swing.JLabel();
        jtxtCampo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbtnGerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Relatório Fornecedor");

        jtxtCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCampoActionPerformed(evt);
            }
        });

        jLabel2.setText("Cidade:");

        jbtnGerar.setText("Gerar");
        jbtnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jtxtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnGerar)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbtnGerar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCampoActionPerformed

    private void jbtnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGerarActionPerformed
        // TODO add your handling code here:
        try {
            FornecedorControle fornecedor = new FornecedorControle();
            EnderecoControle endereco = new EnderecoControle();
            ArrayList<Endereco> arrayEndereco = new ArrayList<>();
           for(int i=0; i < fornecedor.buscar().size(); i++){
            for (int j=0;j<endereco.busca().size();j++){
                    if(fornecedor.buscar().get(i).getCodigoEndereco()== endereco.busca().get(j).getCodigo()){
                            
                    arrayEndereco.add(endereco.busca().get(j));
              
                    }
                }
            }
            PdfWriter writer = new PdfWriter("RelatorioFornecedor.pdf");
            PdfDocument pdf = new PdfDocument(writer);           
            Document document = new Document(pdf);            
            document.setMargins(20, 20, 20, 20);
            PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
            document.setFont(font);
            Paragraph cabecalho1 = new Paragraph("Lista de Fornecedores");
            document.add(cabecalho1);
            Table table = new Table(9);
            table.addCell(new Cell().add(new Paragraph("Codigo")));
            table.addCell(new Cell().add(new Paragraph("Nome")));
            table.addCell(new Cell().add(new Paragraph("CPF")));
            table.addCell(new Cell().add(new Paragraph("CNPJ")));
            table.addCell(new Cell().add(new Paragraph("Telefone")));
            table.addCell(new Cell().add(new Paragraph("Rua")));
            table.addCell(new Cell().add(new Paragraph("Numero")));
            table.addCell(new Cell().add(new Paragraph("Bairro")));
            table.addCell(new Cell().add(new Paragraph("Cidade")));
            int x=0;
            for(int i=0;i<fornecedor.buscar().size();i++){          
                if(jtxtCampo.getText().toLowerCase().equals(arrayEndereco.get(i).getCidade().toLowerCase())){
                    table.addCell(new Cell().add(new Paragraph(String.valueOf(fornecedor.buscar().get(i).getCodigo()))));
                    table.addCell(new Cell().add(new Paragraph(fornecedor.buscar().get(i).getNomeFornecedor())));
                    table.addCell(new Cell().add(new Paragraph(fornecedor.buscar().get(i).getCpfFornecedor())));
                    table.addCell(new Cell().add(new Paragraph(fornecedor.buscar().get(i).getCnpjFornecedor())));
                    table.addCell(new Cell().add(new Paragraph(fornecedor.buscar().get(i).getTelefone())));
                    table.addCell(new Cell().add(new Paragraph(arrayEndereco.get(i).getRua())));
                    table.addCell(new Cell().add(new Paragraph(arrayEndereco.get(i).getNumero())));
                    table.addCell(new Cell().add(new Paragraph(arrayEndereco.get(i).getBairro())));
                    table.addCell(new Cell().add(new Paragraph(arrayEndereco.get(i).getCidade())));
                    x++;
                }
            }
            document.add(table);
            document.close();
            if(x>0){
                Desktop.getDesktop().open(new File("RelatorioFornecedor.pdf"));
            }else{
                JOptionPane.showMessageDialog(null, "Cidade não possui fornecedor!!");
            }
        } catch (IOException ex) {
            Logger.getLogger(JfrmMenuGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnGerarActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmRelatorioFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmRelatorioFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmRelatorioFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmRelatorioFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmRelatorioFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnGerar;
    private javax.swing.JTextField jtxtCampo;
    // End of variables declaration//GEN-END:variables
}
