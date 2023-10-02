
package View;
import model.*;
import model.DAO.*;
import controller.*;
import javax.swing.JOptionPane;


public class ExcluirRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form ExcluirRelatorio
     */
    public ExcluirRelatorio() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoIDRelatorio = new javax.swing.JTextField();
        botaoCancel = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        InsiraIdLbl = new javax.swing.JLabel();
        LabelInsiraID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoIDRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIDRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(CampoIDRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 80, 30));

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

        botaoExcluir.setBackground(new java.awt.Color(51, 51, 51));
        botaoExcluir.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        botaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 20));

        InsiraIdLbl.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        InsiraIdLbl.setText(" ID:");
        getContentPane().add(InsiraIdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        LabelInsiraID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LabelInsiraID.setText("Insira o número do relatório que desejas excluir");
        getContentPane().add(LabelInsiraID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 380, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura de tela login2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoIDRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIDRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIDRelatorioActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
         if(evt.getSource()== botaoExcluir){
              
  int numRelatorio = Integer.parseInt(CampoIDRelatorio.getText());
  
     RelatorioAtendimentoController controlador = new RelatorioAtendimentoController();
             controlador.excluirRelatorioAtendimento(numRelatorio);

        this.dispose();
     }// fim if
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelActionPerformed
       if(evt.getSource() == botaoCancel){
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
            java.util.logging.Logger.getLogger(ExcluirRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoIDRelatorio;
    private javax.swing.JLabel InsiraIdLbl;
    private javax.swing.JLabel LabelInsiraID;
    private javax.swing.JButton botaoCancel;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
