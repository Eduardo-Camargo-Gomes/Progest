/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.ParecerController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author lucia
 */
public class ExcluirParecer extends javax.swing.JFrame {

    /**
     * Creates new form ExcluirParecer
     */
    public ExcluirParecer() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CampoIDParecer = new javax.swing.JTextField();
        botaoExcluir = new javax.swing.JButton();
        InsiraIdLbl = new javax.swing.JLabel();
        LabelInsiraID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoIDParecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIDParecerActionPerformed(evt);
            }
        });
        jPanel1.add(CampoIDParecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 80, 30));

        botaoExcluir.setBackground(new java.awt.Color(51, 51, 51));
        botaoExcluir.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        botaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(botaoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 20));

        InsiraIdLbl.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        InsiraIdLbl.setText(" ID:");
        jPanel1.add(InsiraIdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        LabelInsiraID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LabelInsiraID.setText("Insira o número da parecer que desejas excluir");
        jPanel1.add(LabelInsiraID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 380, 30));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 200));

        botaoCancel.setBackground(new java.awt.Color(51, 51, 51));
        botaoCancel.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        botaoCancel.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancel.setText("Cancelar");
        botaoCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelActionPerformed(evt);
            }
        });
        jPanel1.add(botaoCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoIDParecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIDParecerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIDParecerActionPerformed

    private void botaoCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelActionPerformed
        if(evt.getSource() == botaoCancel){
            this.dispose();
        }// fim if
    }//GEN-LAST:event_botaoCancelActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if(evt.getSource()== botaoExcluir){

            int numParecer = Integer.parseInt(CampoIDParecer.getText());


            ParecerController controlador = new ParecerController();
            try {
                controlador.excluirParecer(numParecer);
            } catch (SQLException ex) {
                Logger.getLogger(ExcluirFicha.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.dispose();
        }// fim if
    }//GEN-LAST:event_botaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(ExcluirParecer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirParecer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirParecer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirParecer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirParecer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoIDParecer;
    private javax.swing.JLabel InsiraIdLbl;
    private javax.swing.JLabel LabelInsiraID;
    private javax.swing.JButton botaoCancel;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
