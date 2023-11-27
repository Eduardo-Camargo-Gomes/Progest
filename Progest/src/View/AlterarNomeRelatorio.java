package View;

import model.*;
import model.DAO.*;
import controller.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AlterarNomeRelatorio extends javax.swing.JFrame {

    private int idFicha;
    private String novoNome;
    
  
    public AlterarNomeRelatorio() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public String getNovoNome() {
        return novoNome;
    }

    public void setNovoNome(String novoNome) {
        this.novoNome = novoNome;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoNome = new javax.swing.JTextField();
        botaoCancel = new javax.swing.JButton();
        botaoRenomear = new javax.swing.JButton();
        LabelInsiraID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(CampoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 260, 30));

        botaoCancel.setBackground(new java.awt.Color(51, 51, 51));
        botaoCancel.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        botaoCancel.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancel.setText("Cancelar");
        botaoCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, 20));

        botaoRenomear.setBackground(new java.awt.Color(51, 51, 51));
        botaoRenomear.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        botaoRenomear.setForeground(new java.awt.Color(255, 255, 255));
        botaoRenomear.setText("Renomear");
        botaoRenomear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRenomearActionPerformed(evt);
            }
        });
        getContentPane().add(botaoRenomear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 20));

        LabelInsiraID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LabelInsiraID.setText("                    Insira um novo nome:");
        getContentPane().add(LabelInsiraID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 380, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura de tela login2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void botaoRenomearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRenomearActionPerformed
        if (evt.getSource() == botaoRenomear) {
          
        }
    }//GEN-LAST:event_botaoRenomearActionPerformed

    private void botaoCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelActionPerformed
        if (evt.getSource() == botaoCancel) {
            this.dispose();
        }// fim if
    }//GEN-LAST:event_botaoCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarNomeRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarNomeRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarNomeRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarNomeRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarNomeRelatorio().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoNome;
    private javax.swing.JLabel LabelInsiraID;
    private javax.swing.JButton botaoCancel;
    private javax.swing.JButton botaoRenomear;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
