/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.marca;

import Config.EditaExcel;
import Config.EditaExcelPorta;
import ExcelZpl.AbreExcelPortas;
import ExcelZpl.AbreExcelZPL;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author v103760
 */
public class Alteracao extends javax.swing.JFrame {

   
    public Alteracao() {
        initComponents();
         AbreExcelPortas portaEx = new AbreExcelPortas();   
        try {
            portaEx.buscar();
            tf_portas.setText(portaEx.getB());
        } catch (IOException ex) {
            Logger.getLogger(Alteracao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tf_modelo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tf_col2D1 = new javax.swing.JTextField();
        tf_col2D2 = new javax.swing.JTextField();
        tf_colMaideBrasil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_quantCaracters = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tf_portas = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 1120, 530));
        jPanel1.add(tf_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 180, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));
        jPanel1.add(tf_col2D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 670, 160, -1));
        jPanel1.add(tf_col2D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 670, 160, -1));

        tf_colMaideBrasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_colMaideBrasilActionPerformed(evt);
            }
        });
        jPanel1.add(tf_colMaideBrasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 670, 160, -1));

        jLabel1.setText("Coluna 1 2D ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, -1, -1));

        jLabel2.setText("Coluna 2 2D ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 650, -1, -1));

        jLabel3.setText("Coluna made in Brazil");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, -1, -1));

        jLabel4.setText("Menor quantiade de caracteres");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, -1, -1));
        jPanel1.add(tf_quantCaracters, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 140, -1));

        jButton2.setText("Alteração");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Porta:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 80, -1, -1));
        jPanel2.add(tf_portas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 210, -1));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jTabbedPane1.addTab("tab2", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 720));

        setSize(new java.awt.Dimension(1222, 779));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          AbreExcelZPL ab = new AbreExcelZPL();  
        try {
            ab.buscar(tf_modelo.getText());
            jTextArea1.setText(ab.getB());
            tf_quantCaracters.setText(ab.getC());
            tf_col2D1.setText(ab.getD());
            tf_col2D2.setText(ab.getE()); 
            tf_colMaideBrasil.setText(ab.getF());
                    
        } catch (IOException ex) {
            Logger.getLogger(SistemaImpressao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_colMaideBrasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_colMaideBrasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_colMaideBrasilActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      EditaExcel excel = new EditaExcel();
      excel.alteracaoExcel(tf_modelo.getText(),
              jTextArea1.getText().trim(), 
              tf_quantCaracters.getText(), 
              tf_col2D1.getText(),
              tf_col2D2.getText(),
              tf_colMaideBrasil.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EditaExcelPorta alt = new EditaExcelPorta();
        alt.alteracaoExcel(tf_portas.getText());
      
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Alteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alteracao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField tf_col2D1;
    private javax.swing.JTextField tf_col2D2;
    private javax.swing.JTextField tf_colMaideBrasil;
    private javax.swing.JTextField tf_modelo;
    private javax.swing.JTextField tf_portas;
    private javax.swing.JTextField tf_quantCaracters;
    // End of variables declaration//GEN-END:variables
}
