package View;

import model.*;
import controller.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.*;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends javax.swing.JFrame {

   public void limparCampo(){
       SENHA.setText("");
   }
    
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
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        esqueciSenha = new javax.swing.JButton();
        SENHA = new javax.swing.JPasswordField();
        USUARIO = new javax.swing.JTextField();
        VOLTAR = new javax.swing.JButton();
        ENTRAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        esqueciSenha.setText("ESQUECI MINHA SENHA");
        getContentPane().add(esqueciSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 170, -1));
        getContentPane().add(SENHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 332, 250, 40));

        USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USUARIOActionPerformed(evt);
            }
        });
        getContentPane().add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 250, 40));

        VOLTAR.setText("VOLTAR");
        VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARActionPerformed(evt);
            }
        });
        getContentPane().add(VOLTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 120, 40));

        ENTRAR.setText("ENTRAR");
        ENTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTRARActionPerformed(evt);
            }
        });
        getContentPane().add(ENTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/VERSAO2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void USUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USUARIOActionPerformed
       
    }//GEN-LAST:event_USUARIOActionPerformed

    private void ENTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTRARActionPerformed
        if (evt.getSource()==ENTRAR){
          
            
        
         UsuarioController usuarioController = new UsuarioController();   
            try {
              boolean logado =  usuarioController.Autenticar(USUARIO.getText(), SENHA.getText());
                
              if(logado == true){
                     new menu().setVisible(true);
               this.dispose();
              }
              else {
              JOptionPane.showMessageDialog(null, "Usuario ou senha inválidos!");
                limparCampo();
              }// fim else 
       } catch (SQLException ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        
}
    }//GEN-LAST:event_ENTRARActionPerformed

    private void VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARActionPerformed
        if (evt.getSource()==VOLTAR){
            new TelaInicio().setVisible(true);
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
    private javax.swing.JButton ENTRAR;
    private javax.swing.JPasswordField SENHA;
    private javax.swing.JTextField USUARIO;
    private javax.swing.JButton VOLTAR;
    private javax.swing.JButton esqueciSenha;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
