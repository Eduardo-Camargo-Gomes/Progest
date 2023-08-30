package View;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sair = new javax.swing.JButton();
        CONFIGURACOES = new javax.swing.JButton();
        PASTA = new javax.swing.JButton();
        RELATORIO = new javax.swing.JButton();
        AGENDA = new javax.swing.JButton();
        NOVO = new javax.swing.JButton();
        INICIO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sair.setText("SAIR");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, -1, 30));

        CONFIGURACOES.setText("CONFIGURAÇÕES");
        getContentPane().add(CONFIGURACOES, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 433, -1, 30));

        PASTA.setText("PASTA");
        getContentPane().add(PASTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 383, -1, 30));

        RELATORIO.setText("RELATORIO");
        getContentPane().add(RELATORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, 30));

        AGENDA.setText("AGENDA");
        getContentPane().add(AGENDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 283, -1, 30));

        NOVO.setText("NOVO");
        NOVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOVOActionPerformed(evt);
            }
        });
        getContentPane().add(NOVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 233, 70, 30));

        INICIO.setText("INÍCIO");
        getContentPane().add(INICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/tela.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOVOActionPerformed
        if (evt.getSource()==NOVO){
           new RelatorioAtendimento().setVisible(true);
           this.setVisible(false);
           
       }
    }//GEN-LAST:event_NOVOActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        if (evt.getSource()==sair){
            new TelaInicio().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_sairActionPerformed


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new menu().setVisible(false);
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGENDA;
    private javax.swing.JButton CONFIGURACOES;
    private javax.swing.JButton INICIO;
    private javax.swing.JButton NOVO;
    private javax.swing.JButton PASTA;
    private javax.swing.JButton RELATORIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
    }
