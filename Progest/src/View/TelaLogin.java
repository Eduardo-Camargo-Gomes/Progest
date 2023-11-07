package View;

import model.*;
import controller.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.*;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends javax.swing.JFrame {
    
       public void limparCampo(){
       SENHA.setText("");
   }// fim metodo
   
   
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        USUARIO = new javax.swing.JTextField();
        SENHA = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LOGIN = new javax.swing.JButton();
        EsqueciSenha = new javax.swing.JLabel();
        naoPossiuUmaConta = new javax.swing.JLabel();
        Cadastreseaqui = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/imagem.login.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 810));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        USUARIO.setBackground(new java.awt.Color(186, 203, 212));
        USUARIO.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        USUARIO.setForeground(new java.awt.Color(30, 30, 31));
        USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USUARIOActionPerformed(evt);
            }
        });
        jPanel1.add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, 300, 40));

        SENHA.setBackground(new java.awt.Color(186, 203, 212));
        SENHA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SENHA.setForeground(new java.awt.Color(30, 30, 31));
        jPanel1.add(SENHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 430, 300, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 31));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 70, 380, 120));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Georgia", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 30, 31));
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 380, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Georgia", 0, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 30, 31));
        jLabel4.setText("Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, 200, -1));

        LOGIN.setBackground(new java.awt.Color(0, 0, 0));
        LOGIN.setFont(new java.awt.Font("Georgia", 0, 25)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(255, 255, 255));
        LOGIN.setText("Entrar");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        jPanel1.add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 560, 140, 40));

        EsqueciSenha.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        EsqueciSenha.setText("ESQUECI MINHA SENHA");
        EsqueciSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EsqueciSenhaMouseClicked(evt);
            }
        });
        jPanel1.add(EsqueciSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 510, -1, -1));

        naoPossiuUmaConta.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        naoPossiuUmaConta.setForeground(new java.awt.Color(30, 30, 31));
        naoPossiuUmaConta.setText("Ainda não possui uma conta?");
        jPanel1.add(naoPossiuUmaConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 630, 227, 20));

        Cadastreseaqui.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Cadastreseaqui.setForeground(new java.awt.Color(0, 0, 204));
        Cadastreseaqui.setText("Cadastre-se aqui");
        Cadastreseaqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastreseaquiMouseClicked(evt);
            }
        });
        jPanel1.add(Cadastreseaqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 630, 135, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1535, 795));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void USUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USUARIOActionPerformed
       
    }//GEN-LAST:event_USUARIOActionPerformed

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
 if (evt.getSource()==LOGIN){
          
            
        
         UsuarioController usuarioController = new UsuarioController();   
            try {
              boolean logado =  usuarioController.Autenticar(USUARIO.getText(), SENHA.getText());
                
              if(logado == true){
                  
                     new Menu().setVisible(true);
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
              
    }//GEN-LAST:event_LOGINActionPerformed

    private void EsqueciSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsqueciSenhaMouseClicked
        if(evt.getSource()==EsqueciSenha){
            new EsqueciSenha().setVisible(true);
        }
    }//GEN-LAST:event_EsqueciSenhaMouseClicked

    private void CadastreseaquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastreseaquiMouseClicked
        if (evt.getSource()==Cadastreseaqui){
            new TelaCadastro().setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_CadastreseaquiMouseClicked

    
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
        //</editor-fold>

        
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastreseaqui;
    private javax.swing.JLabel EsqueciSenha;
    private javax.swing.JButton LOGIN;
    private javax.swing.JPasswordField SENHA;
    private javax.swing.JTextField USUARIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel naoPossiuUmaConta;
    // End of variables declaration//GEN-END:variables
}
