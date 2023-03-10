/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.marca;

import BarrasInicioFim.CodigoInicio;
import ExcelZpl.AbreExcelNovaLinha;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author v103760
 */
public class MarcasPD extends javax.swing.JFrame {

    @SuppressWarnings("FieldMayBeFinal")
    private String dataForm;
    private static String porta;
    CodigoInicio barras = new CodigoInicio();
    /**
     * Creates new form MarcasPD
     */
    public MarcasPD() {
        initComponents();
        
   Date data = new Date();
   SimpleDateFormat formatador = new SimpleDateFormat("ddMMyyyy");
   dataForm=formatador.format( data );
   
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tf_quant = new javax.swing.JTextField();
        tf_sap = new javax.swing.JTextField();
        lb_tipo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tf_porta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_quantLinhas = new javax.swing.JTextField();
        tf_re = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        tf_LL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_LT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Imprime codigo de data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 180, -1));
        getContentPane().add(tf_quant, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 130, -1));

        tf_sap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sapActionPerformed(evt);
            }
        });
        getContentPane().add(tf_sap, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 106, -1));

        lb_tipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_tipo.setText(".");
        getContentPane().add(lb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 150, -1));

        tf_porta.setText("LPT3");
        getContentPane().add(tf_porta, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 90, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Sap:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Re:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        tf_quantLinhas.setText("110");
        getContentPane().add(tf_quantLinhas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 90, -1));
        getContentPane().add(tf_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Quantidade:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jButton3.setText("Imprime Re");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 160, -1));

        tf_LL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_LL.setText("80");
        getContentPane().add(tf_LL, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 90, -1));

        jLabel4.setText("LL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        tf_LT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_LT.setText("80");
        getContentPane().add(tf_LT, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 90, -1));

        jLabel5.setText("LT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        setSize(new java.awt.Dimension(711, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
impressaoCOD();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_sapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sapActionPerformed
         AbreExcelNovaLinha ab = new AbreExcelNovaLinha();
        try {
            ab.buscar(tf_sap.getText());
            lb_tipo.setText(ab.getB());
        } catch (IOException ex) {
            Logger.getLogger(MarcasPD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tf_sapActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       impressaoCt();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      impressaoRE();
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
            java.util.logging.Logger.getLogger(MarcasPD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcasPD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcasPD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcasPD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcasPD().setVisible(true);
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
    private javax.swing.JLabel lb_tipo;
    private static javax.swing.JTextField tf_LL;
    private static javax.swing.JTextField tf_LT;
    private javax.swing.JTextField tf_porta;
    private javax.swing.JTextField tf_quant;
    private javax.swing.JTextField tf_quantLinhas;
    private static javax.swing.JTextField tf_re;
    private javax.swing.JTextField tf_sap;
    // End of variables declaration//GEN-END:variables

public void impressaoCOD(){
        
       int quant = Integer.parseInt(tf_quant.getText());
       
        
       int posicaoLinha = 150;
        for(int cont=0;cont<quant;cont++){
     //      log.setLinha(posicaoLinha);
            @SuppressWarnings("UnusedAssignment")
         FileOutputStream os = null;
            porta = "LPT2";
               
		try {
			os = new FileOutputStream(porta);
                  try (PrintStream ps = new PrintStream(os)) {
                            
                barras.codigoInicio();  
                ps.println(barras.getBarrasInicio());  
ps.println("^XA^PMY"); 
ps.println("^MMT");
ps.println("^PW605");
ps.println("^LT50");
ps.println("^LL127");
ps.println("^LS0");
ps.println("^FT50,0^A0N,53,50^FH^FD"+dataForm+"^FS");
ps.println("^FT260,0^A0N,53,50^SN095,-1,Y^FS");
ps.println("^FT50,105^A0N,53,50^FH^FD"+dataForm+"^FS");
ps.println("^FT260,105^A0N,53,50^SN095,-1,Y^FS");
ps.println("^FO360,0^BXN,6,200,,,,");
ps.println("^FDwww.contitech.de;aam");
ps.println("^FS");
ps.println("^FO480,20^BXN,6,200,,,,");
ps.println("^FDwww.contitech.de;aam");
ps.println("^FS");
ps.println("^PQ95^FS");
ps.println("^XZ");
                                                      
                            
                               
                               
                               
                         }
                         
                   
                  
                   
                      } catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "N??o foi poss??vel enviar os dados para impress??o\nA porta \""+porta +"\" parece estar inacess??vel\n"+e.getMessage(), "Erro ao enviar os dados para a porta" , JOptionPane.ERROR_MESSAGE);
		}
   
   }
   }
public void impressaoCt(){
        
       int quant = Integer.parseInt(tf_quant.getText());
       
        
       int posicaoLinha = 150;
        for(int cont=0;cont<quant;cont++){
     //      log.setLinha(posicaoLinha);
            @SuppressWarnings("UnusedAssignment")
         FileOutputStream os = null;
            porta = tf_porta.getText();
               
		try {
			os = new FileOutputStream(porta);
                  try (PrintStream ps = new PrintStream(os)) {
                      barras.codigoInicio();  
                      ps.println(barras.getBarrasInicio());                                 
ps.println("^XA^PMY"); 
ps.println("^MMT"); 
ps.println("^PW1600"); 
ps.println("^LT00"); 
ps.println("^LL090"); 
ps.println("^LS0"); 
ps.println("^FO0,10^GFA,04992,04992,00052,:Z64:\n" +
"eJztljFy5CAQRVEpYDP2BhxF19pMuBxs6CP4KFa211C2KZlVZRXt/o00Aw12TeRIbY+MR3weXzSNjLniiiuu+PlwO19G+rYPLep/CsZMFFnNLUuBOJ4oTvwHl4Qbm+HfkdYsGQndiZhmeTjL3TkGiv7Q7BiRzBy564FzJCPwt9xcwMqcFZw1c7gVpNeh8eBYfNvjeHAGUpwZHBmTGfHUPJd+7I2z3jRRNOgfu36s4oC7YcJ8dfJp/XjlZxACumG8vevHKw6e2AYhj+dk7u36TMoP5hpFQ9xOXT+z4jjax22kxLLAS9X4SZIpy1T6wfONeGAzOPgEM2FJojT9LhrjSo7nOf5xfJmEE0ST+HbWgDNiyqUfzzd+W0mahTmL4nCT25sZSg4Pb34hoVnDnNXlwQdJi5PDSVz68UlgktSW5tjxM8iUSk4SGEZbkeL25JR+oCn8YMLC4dEsTVvHTx6+5OwHbADnbXOn5vDD6Ny18DMLZz84ftd+ZLpLzn86Neng8NNx9Jr0+tw0kl7rnZNXgZ+ZI+2ny9lKPy/80/iB9uA0fphj6e8jfu7Pjf08Z03qzE378engDPTvAT/1+jzR/y/XR2kyh/PN3DV3P2PDqfIt0Htv/+h8ozKvzfzey7eo8q3aP2H6eGT/YJ+6c59i/p39o/ZpXQ9C1tT7Z9D1oK47KD2Nn6bu1PVNSk+1Pr36VtfRhiP1TddRqdfjWa/DSM3+aev1WJ0LOCZ0vu2i+fr8CUb76Z0/hspzDnPX+bbjmP7mPA1ZU+2fznnqy3M755L205zb5/tBMoeB1k/zfmDL95Ccf9oP5l9xzvedNXNcZ32a95281PJeZWUbtX6wh2vOFVdcccUVPxufaK12yg==:5AF6"); 
ps.println("^FT427,82^A0N,66,76^FH\\^FD"+lb_tipo.getText()+"^FS"); 
ps.println("^FT712,57^A0N,27,31^FH\\^FDMADE IN^FS"); 
ps.println("^FT712,87^A0N,27,31^FH\\^FDBRAZIL^FS"); 
ps.println("^FT852,57^A0N,27,35^FH\\^FDDO NOT CRIMP^FS"); 
ps.println("^FT852,87^A0N,27,35^FH\\^FDNAO DOBRAR^FS"); 
ps.println("^PQ"+tf_quantLinhas.getText()+",0,0,Y^XZ"); 
                                                      
                            
                               
                               
                               
                         }
                         
                   
                  
                   
                      } catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "N??o foi poss??vel enviar os dados para impress??o\nA porta \""+porta +"\" parece estar inacess??vel\n"+e.getMessage(), "Erro ao enviar os dados para a porta" , JOptionPane.ERROR_MESSAGE);
		}
   
   }
   }  
public void impressaoRE(){
        
       int quant = Integer.parseInt(tf_quant.getText());
       
        
       int posicaoLinha = 150;
        for(int cont=0;cont<quant;cont++){
     //      log.setLinha(posicaoLinha);
            @SuppressWarnings("UnusedAssignment")
         FileOutputStream os = null;
            porta = "LPT2";
               
		try {
			os = new FileOutputStream(porta);
                  try (PrintStream ps = new PrintStream(os)) {
                           
             
ps.println("^XA^PMY"); 
ps.println("^MMT");
ps.println("^PW605");
ps.println("^LT"+tf_LT.getText()+"");
ps.println("^LL"+tf_LL.getText()+"");
ps.println("^LS0");
ps.println("^FT460,0^A0N,53,50^FH^FD"+tf_re.getText()+"^FS");
ps.println("^PQ95^FS");
ps.println("^XZ");
                                                      
                            
                               
                               
                               
                         }
                         
                   
                  
                   
                      } catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "N??o foi poss??vel enviar os dados para impress??o\nA porta \""+porta +"\" parece estar inacess??vel\n"+e.getMessage(), "Erro ao enviar os dados para a porta" , JOptionPane.ERROR_MESSAGE);
		}
   
   }
   }
}
