
package View;

public class TelaInicio extends javax.swing.JFrame {
    

    public TelaInicio() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Progest = new javax.swing.JLabel();
        LOGIN = new javax.swing.JButton();
        CADASTRAR = new javax.swing.JButton();
        TelaBEMVINDO = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Progest.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Progest.setForeground(new java.awt.Color(255, 255, 255));
        Progest.setText("Progest");
        getContentPane().add(Progest, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        LOGIN.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        LOGIN.setText("Login");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        getContentPane().add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 240, 80));

        CADASTRAR.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        CADASTRAR.setText("Cadastrar");
        CADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRARActionPerformed(evt);
            }
        });
        getContentPane().add(CADASTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 240, 80));

        TelaBEMVINDO.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        TelaBEMVINDO.setForeground(new java.awt.Color(255, 255, 255));
        TelaBEMVINDO.setText(" Bem vindo ");
        getContentPane().add(TelaBEMVINDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 270, 80));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/TelaInicial.PNG"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


//AÇÃO DO BOTAO LOGIN
    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed

        if(evt.getSource()==LOGIN){
            new TelaLogin().setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_LOGINActionPerformed
//AÇÃO DO BOTAO CADASTRAR
    private void CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTRARActionPerformed
        if (evt.getSource()==CADASTRAR){
            new TelaCadastro().setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_CADASTRARActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CADASTRAR;
    private javax.swing.JButton LOGIN;
    private javax.swing.JLabel Progest;
    private javax.swing.JLabel TelaBEMVINDO;
    private javax.swing.JLabel fundo;
    // End of variables declaration//GEN-END:variables

    
}

