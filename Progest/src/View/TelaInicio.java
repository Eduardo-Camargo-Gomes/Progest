
package View;

import javax.swing.JFrame;

public class TelaInicio extends javax.swing.JFrame {

    public TelaInicio() {
        initComponents();
        setTitle("PROGEST");
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaLogin1 = new View.TelaLogin();
        jPanel1 = new javax.swing.JPanel();
        Progest = new javax.swing.JLabel();
        TelaBEMVINDO = new javax.swing.JLabel();
        LOGIN = new javax.swing.JButton();
        CADASTRAR = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Progest");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Progest.setFont(new java.awt.Font("Georgia", 1, 80)); // NOI18N
        Progest.setForeground(new java.awt.Color(30, 30, 31));
        Progest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Progest.setText("Progest");
        jPanel1.add(Progest, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 90, 400, 130));

        TelaBEMVINDO.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        TelaBEMVINDO.setForeground(new java.awt.Color(94, 94, 96));
        TelaBEMVINDO.setText(" Bem vindo ");
        jPanel1.add(TelaBEMVINDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 280, -1, 80));

        LOGIN.setBackground(new java.awt.Color(0, 0, 0));
        LOGIN.setFont(new java.awt.Font("Georgia", 0, 25)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(255, 255, 255));
        LOGIN.setText("Login");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        jPanel1.add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 440, 140, 40));

        CADASTRAR.setBackground(new java.awt.Color(0, 0, 0));
        CADASTRAR.setFont(new java.awt.Font("Georgia", 0, 25)); // NOI18N
        CADASTRAR.setForeground(new java.awt.Color(255, 255, 255));
        CADASTRAR.setText("Cadastrar");
        CADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRARActionPerformed(evt);
            }
        });
        jPanel1.add(CADASTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 500, 140, 40));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/imagem.login.jpg"))); // NOI18N
        jPanel1.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1535, 795));

        pack();
        setLocationRelativeTo(null);
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
    private javax.swing.JPanel jPanel1;
    private View.TelaLogin telaLogin1;
    // End of variables declaration//GEN-END:variables

    
}

