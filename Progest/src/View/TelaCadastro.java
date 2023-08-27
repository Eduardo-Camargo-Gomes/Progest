
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

        CampoSenha = new javax.swing.JPasswordField();
        CampoCPF = new javax.swing.JTextField();
        CampoNome = new javax.swing.JTextField();
        pedido3 = new javax.swing.JLabel();
        pedido2 = new javax.swing.JLabel();
        pedido1 = new javax.swing.JLabel();
        VOLTAR = new javax.swing.JButton();
        CADASTRAR = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoSenha.setBackground(new java.awt.Color(153, 153, 153));
        CampoSenha.setForeground(new java.awt.Color(255, 255, 255));
        CampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 450, 40));

        CampoCPF.setBackground(new java.awt.Color(153, 153, 153));
        CampoCPF.setForeground(new java.awt.Color(255, 255, 255));
        CampoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCPFActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 450, 40));

        CampoNome.setBackground(new java.awt.Color(153, 153, 153));
        CampoNome.setForeground(new java.awt.Color(255, 255, 255));
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(CampoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 450, 40));

        pedido3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pedido3.setForeground(new java.awt.Color(255, 255, 255));
        pedido3.setText("Digite CPF:");
        getContentPane().add(pedido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 160, 40));

        pedido2.setBackground(new java.awt.Color(0, 0, 0));
        pedido2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pedido2.setForeground(new java.awt.Color(255, 255, 255));
        pedido2.setText("Digite sua senha:");
        getContentPane().add(pedido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, 40));

        pedido1.setBackground(new java.awt.Color(255, 255, 255));
        pedido1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pedido1.setForeground(new java.awt.Color(255, 255, 255));
        pedido1.setText("Nome de Usuario:");
        getContentPane().add(pedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 180, 40));

        VOLTAR.setBackground(new java.awt.Color(204, 204, 204));
        VOLTAR.setText("VOLTAR");
        VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARActionPerformed(evt);
            }
        });
        getContentPane().add(VOLTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 110, 40));

        CADASTRAR.setBackground(new java.awt.Color(204, 204, 204));
        CADASTRAR.setText("CADASTRAR");
        CADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRARActionPerformed(evt);
            }
        });
        getContentPane().add(CADASTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 110, 40));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagem1 (1).jpg"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFActionPerformed

    private void CampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaActionPerformed

    private void VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARActionPerformed
       if (evt.getSource()==VOLTAR){
            new TelaInicio().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_VOLTARActionPerformed

    private void CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTRARActionPerformed
        if (evt.getSource()==CADASTRAR){
  boolean cadastrado;
            
          	 UsuarioController usuarioController = new UsuarioController();
            try {
               cadastrado = usuarioController.cadastrarUsuario(CampoNome.getText(),
                         CampoSenha.getText(), CampoCPF.getText());
               if(cadastrado == true){ 
               new TelaLogin().setVisible(true);
               this.dispose();
                
                
               }
               else {
                   limparCampos();
               }
              
               
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }

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
    private javax.swing.JLabel pedido1;
    private javax.swing.JLabel pedido2;
    private javax.swing.JLabel pedido3;
    // End of variables declaration//GEN-END:variables
}
