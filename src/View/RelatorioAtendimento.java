
package View;

public class RelatorioAtendimento extends javax.swing.JFrame {

    public RelatorioAtendimento() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VOLTAR = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextNumRelatorio = new javax.swing.JTextField();
        jTextDataOcorrencia = new javax.swing.JTextField();
        jTextHorarioOcorrencia = new javax.swing.JTextField();
        jTextLocalOcorrencia = new javax.swing.JTextField();
        jTextNomeDiscente = new javax.swing.JTextField();
        jTextTurmaDiscente = new javax.swing.JTextField();
        jTextOBSatendimento = new javax.swing.JTextField();
        jTextEncaminhamento = new javax.swing.JTextField();
        jTextConclusao = new javax.swing.JTextField();
        jLabelnumRelatorio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOLTAR.setText("VOLTAR");
        VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARActionPerformed(evt);
            }
        });
        getContentPane().add(VOLTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, 20));
        getContentPane().add(jTextNumRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 30, -1));

        jTextDataOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDataOcorrenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDataOcorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 188, 120, -1));
        getContentPane().add(jTextHorarioOcorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 188, 120, -1));
        getContentPane().add(jTextLocalOcorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 120, 20));
        getContentPane().add(jTextNomeDiscente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 260, 20));
        getContentPane().add(jTextTurmaDiscente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 110, -1));
        getContentPane().add(jTextOBSatendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 380, 40));
        getContentPane().add(jTextEncaminhamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 380, 60));
        getContentPane().add(jTextConclusao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 380, 30));

        jLabelnumRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/RELATÓRIO.png"))); // NOI18N
        getContentPane().add(jLabelnumRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, -30, -1, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDataOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDataOcorrenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDataOcorrenciaActionPerformed

    private void VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARActionPerformed
        if (evt.getSource()==VOLTAR){
           new menu().setVisible(true);
           this.setVisible(false);
       }
    }//GEN-LAST:event_VOLTARActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VOLTAR;
    private javax.swing.JLabel jLabelnumRelatorio;
    private javax.swing.JTextField jTextConclusao;
    private javax.swing.JTextField jTextDataOcorrencia;
    private javax.swing.JTextField jTextEncaminhamento;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextHorarioOcorrencia;
    private javax.swing.JTextField jTextLocalOcorrencia;
    private javax.swing.JTextField jTextNomeDiscente;
    private javax.swing.JTextField jTextNumRelatorio;
    private javax.swing.JTextField jTextOBSatendimento;
    private javax.swing.JTextField jTextTurmaDiscente;
    // End of variables declaration//GEN-END:variables
}
