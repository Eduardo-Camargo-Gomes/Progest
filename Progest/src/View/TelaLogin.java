package View;

import model.*;
import controller.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import view.*;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends javax.swing.JFrame {
   
    public JPasswordField getSENHA() {
        return SENHA;
    }

    public void setSENHA(JPasswordField SENHA) {
        this.SENHA = SENHA;
    }

    public JTextField getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(JTextField USUARIO) {
        this.USUARIO = USUARIO;
    }

    
 
    public TelaLogin() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        esqueciSenha = new javax.swing.JButton();
        USUARIO = new javax.swing.JTextField();
        SENHA = new javax.swing.JPasswordField();
        naoPossiuUmaConta = new javax.swing.JLabel();
        cadastreseAqui = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LOGIN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagem.login.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 810));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        esqueciSenha.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        esqueciSenha.setText("ESQUECI MINHA SENHA");
        esqueciSenha.setBorder(null);
        esqueciSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esqueciSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(esqueciSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 500, 160, 20));

        USUARIO.setBackground(new java.awt.Color(210, 225, 233));
        USUARIO.setForeground(new java.awt.Color(30, 30, 31));
        USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USUARIOActionPerformed(evt);
            }
        });
        jPanel1.add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, 250, 40));

        SENHA.setBackground(new java.awt.Color(210, 225, 233));
        SENHA.setForeground(new java.awt.Color(30, 30, 31));
        jPanel1.add(SENHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 430, 250, 40));

        naoPossiuUmaConta.setBackground(new java.awt.Color(0, 0, 0));
        naoPossiuUmaConta.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        naoPossiuUmaConta.setText("Ainda não possui uma conta?");
        jPanel1.add(naoPossiuUmaConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 630, 190, 20));

        cadastreseAqui.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cadastreseAqui.setForeground(new java.awt.Color(0, 0, 204));
        cadastreseAqui.setText("Cadastre-se aqui");
        cadastreseAqui.setBorder(null);
        cadastreseAqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastreseAquiActionPerformed(evt);
            }
        });
        jPanel1.add(cadastreseAqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 630, 120, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 31));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, 380, 120));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 30, 31));
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 380, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 30, 31));
        jLabel4.setText("Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, 200, -1));

        LOGIN.setBackground(new java.awt.Color(0, 0, 0));
        LOGIN.setFont(new java.awt.Font("Georgia", 0, 30)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(255, 255, 255));
        LOGIN.setText("Entrar");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        jPanel1.add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 560, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1570, 810));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void USUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USUARIOActionPerformed
       
    }//GEN-LAST:event_USUARIOActionPerformed

    private void cadastreseAquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastreseAquiActionPerformed
         if (evt.getSource()==cadastreseAqui){
            new TelaCadastro().setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_cadastreseAquiActionPerformed

    private void esqueciSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqueciSenhaActionPerformed
        if(evt.getSource()==esqueciSenha){
            new EsqueciSenha().setVisible(true);
        }
    }//GEN-LAST:event_esqueciSenhaActionPerformed

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed

        if(evt.getSource()==LOGIN){
            new menu().setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_LOGINActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN;
    private javax.swing.JPasswordField SENHA;
    private javax.swing.JTextField USUARIO;
    private javax.swing.JButton cadastreseAqui;
    private javax.swing.JButton esqueciSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel naoPossiuUmaConta;
    // End of variables declaration//GEN-END:variables
}
