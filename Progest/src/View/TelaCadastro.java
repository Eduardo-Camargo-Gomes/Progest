
package View;
import model.*;
import controller.*;
import View.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class TelaCadastro extends javax.swing.JFrame {

    public void limparCampos() {
		CampoCPF.setText("");
		CampoNome.setText("");
                CampoSenha.setText("");
	}

    
    
    public JTextField getCampoCPF() {
        return CampoCPF;
    }

    public void setCampoCPF(JTextField CampoCPF) {
        this.CampoCPF = CampoCPF;
    }

    public JTextField getCampoNome() {
        return CampoNome;
    }

    public void setCampoNome(JTextField CampoNome) {
        this.CampoNome = CampoNome;
    }

    public JPasswordField getCampoSenha() {
        return CampoSenha;
    }

    public void setCampoSenha(JPasswordField CampoSenha) {
        this.CampoSenha = CampoSenha;
    }

    
    
    
    public TelaCadastro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CADASTRAR = new javax.swing.JButton();
        VOLTAR = new javax.swing.JButton();
        pedido1 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        pedido2 = new javax.swing.JLabel();
        CampoSenha = new javax.swing.JPasswordField();
        pedido3 = new javax.swing.JLabel();
        CampoCPF = new javax.swing.JTextField();
        fundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CADASTRAR.setBackground(new java.awt.Color(0, 0, 0));
        CADASTRAR.setFont(new java.awt.Font("Georgia", 0, 30)); // NOI18N
        CADASTRAR.setForeground(new java.awt.Color(255, 255, 255));
        CADASTRAR.setText("Cadastrar");
        CADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRARActionPerformed(evt);
            }
        });
        jPanel1.add(CADASTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 610, -1, -1));

        VOLTAR.setBackground(new java.awt.Color(0, 0, 0));
        VOLTAR.setFont(new java.awt.Font("Georgia", 0, 30)); // NOI18N
        VOLTAR.setForeground(new java.awt.Color(255, 255, 255));
        VOLTAR.setText("Voltar");
        VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARActionPerformed(evt);
            }
        });
        jPanel1.add(VOLTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 610, 160, -1));

        pedido1.setBackground(new java.awt.Color(255, 255, 255));
        pedido1.setFont(new java.awt.Font("Georgia", 0, 30)); // NOI18N
        pedido1.setText("Nome de Usuario");
        jPanel1.add(pedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, 350, 40));

        CampoNome.setBackground(new java.awt.Color(210, 225, 233));
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });
        jPanel1.add(CampoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 260, 350, 40));

        pedido2.setBackground(new java.awt.Color(255, 255, 255));
        pedido2.setFont(new java.awt.Font("Georgia", 0, 30)); // NOI18N
        pedido2.setText("Digite sua senha");
        jPanel1.add(pedido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, 290, 40));

        CampoSenha.setBackground(new java.awt.Color(210, 225, 233));
        CampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(CampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 370, 350, 40));

        pedido3.setBackground(new java.awt.Color(255, 255, 255));
        pedido3.setFont(new java.awt.Font("Georgia", 0, 30)); // NOI18N
        pedido3.setText("Digite CPF");
        jPanel1.add(pedido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 270, 40));

        CampoCPF.setBackground(new java.awt.Color(210, 225, 233));
        CampoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCPFActionPerformed(evt);
            }
        });
        jPanel1.add(CampoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 480, 350, 40));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagem.login.jpg"))); // NOI18N
        jPanel1.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 810));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 31));
        jLabel1.setText("CADASTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 610, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFActionPerformed

    private void CampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaActionPerformed

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARActionPerformed
        if (evt.getSource()==VOLTAR){
            new TelaInicio().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_VOLTARActionPerformed

    private void CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTRARActionPerformed
       if (evt.getSource()==CADASTRAR){

            boolean sucesso = false ;
            UsuarioController usuarioController = new UsuarioController();
            try {
                sucesso = usuarioController.cadastrarUsuario(CampoNome.getText(), CampoSenha.getText(),
                        CampoCPF.getText());
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            limparCampos();

        }// fim ifao
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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CADASTRAR;
    private javax.swing.JTextField CampoCPF;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JButton VOLTAR;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pedido1;
    private javax.swing.JLabel pedido2;
    private javax.swing.JLabel pedido3;
    // End of variables declaration//GEN-END:variables
}
