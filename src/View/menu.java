package View;

import controller.RelatorioAtendimentoController;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        INICIO = new javax.swing.JButton();
        NOVO = new javax.swing.JButton();
        AGENDA = new javax.swing.JButton();
        ExcluirBotao = new javax.swing.JButton();
        Concluido = new javax.swing.JButton();
        Pendente = new javax.swing.JButton();
        Pasta = new javax.swing.JButton();
        Configuracao = new javax.swing.JButton();
        IFAM = new javax.swing.JLabel();
        imageminicio = new javax.swing.JLabel();
        imagemnovo = new javax.swing.JLabel();
        imagemagenda = new javax.swing.JLabel();
        imagemrelatorio = new javax.swing.JLabel();
        imagemconcluido = new javax.swing.JLabel();
        imagempendente = new javax.swing.JLabel();
        imagempasta = new javax.swing.JLabel();
        imagemconfiguracao = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        sair = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FichaAdentimento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(186, 203, 212));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setAlignmentX(1.0F);
        jPanel2.setAlignmentY(1.0F);
        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPanel2AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        INICIO.setBackground(new java.awt.Color(186, 203, 212));
        INICIO.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        INICIO.setText("Início");
        INICIO.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.add(INICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 70, 30));

        NOVO.setBackground(new java.awt.Color(186, 203, 212));
        NOVO.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        NOVO.setText("Novo");
        NOVO.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        NOVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOVOActionPerformed(evt);
            }
        });
        jPanel2.add(NOVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 70, 30));

        AGENDA.setBackground(new java.awt.Color(186, 203, 212));
        AGENDA.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        AGENDA.setText("Agenda");
        AGENDA.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        AGENDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGENDAActionPerformed(evt);
            }
        });
        jPanel2.add(AGENDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 90, 30));

        ExcluirBotao.setBackground(new java.awt.Color(186, 203, 212));
        ExcluirBotao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ExcluirBotao.setText("Excluir");
        ExcluirBotao.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        ExcluirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirBotaoActionPerformed(evt);
            }
        });
        jPanel2.add(ExcluirBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 100, 30));

        Concluido.setBackground(new java.awt.Color(186, 203, 212));
        Concluido.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Concluido.setText("Concluídos");
        Concluido.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Concluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConcluidoActionPerformed(evt);
            }
        });
        jPanel2.add(Concluido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 130, 30));

        Pendente.setBackground(new java.awt.Color(186, 203, 212));
        Pendente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Pendente.setText("Pendente");
        Pendente.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.add(Pendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 110, 30));

        Pasta.setBackground(new java.awt.Color(186, 203, 212));
        Pasta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Pasta.setText("Pasta");
        Pasta.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.add(Pasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 70, 30));

        Configuracao.setBackground(new java.awt.Color(186, 203, 212));
        Configuracao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Configuracao.setText("Configuração");
        Configuracao.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Configuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracaoActionPerformed(evt);
            }
        });
        jPanel2.add(Configuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 150, 30));

        IFAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.ifam.png"))); // NOI18N
        jPanel2.add(IFAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 110));

        imageminicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.deinicio.png"))); // NOI18N
        jPanel2.add(imageminicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 60));

        imagemnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.denovo.png"))); // NOI18N
        jPanel2.add(imagemnovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 50, 40));

        imagemagenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.deagenda.png"))); // NOI18N
        jPanel2.add(imagemagenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        imagemrelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/LIXEIRAPNG (1).png"))); // NOI18N
        jPanel2.add(imagemrelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 60, 50));

        imagemconcluido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.deconcluido.png"))); // NOI18N
        jPanel2.add(imagemconcluido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 50, 50));

        imagempendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.dependente.png"))); // NOI18N
        jPanel2.add(imagempendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, 40));

        imagempasta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.depasta.png"))); // NOI18N
        jPanel2.add(imagempasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 50, 50));

        imagemconfiguracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.deconfiguracao.png"))); // NOI18N
        jPanel2.add(imagemconfiguracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 50, 50));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, 800));

        sair.setBackground(new java.awt.Color(186, 203, 212));
        sair.setText("SAIR");
        sair.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jPanel2.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 80, 40, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setAlignmentX(1.0F);
        jSeparator2.setAlignmentY(1.0F);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 340, 20));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setAlignmentX(1.0F);
        jSeparator3.setAlignmentY(1.0F);
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1540, 10));

        jButton1.setBackground(new java.awt.Color(186, 203, 212));
        jButton1.setText("Ajuda");
        jButton1.setBorder(null);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 50, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.desair.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 60, -1, -1));

        FichaAdentimento.setText("FichaAdentimento");
        FichaAdentimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FichaAdentimentoActionPerformed(evt);
            }
        });
        jPanel2.add(FichaAdentimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOVOActionPerformed
        if (evt.getSource()==NOVO){
           new RelatorioAtendimento().setVisible(true);
           
           RelatorioAtendimentoController controlador = new RelatorioAtendimentoController();
           
           controlador.mostrarNumeroDeRelatorio();
          
       }// fim if
    }//GEN-LAST:event_NOVOActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        if (evt.getSource()==sair){
            new TelaInicio().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_sairActionPerformed

    private void ConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfiguracaoActionPerformed

    private void ExcluirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirBotaoActionPerformed
      if(evt.getSource() == ExcluirBotao){
          
          new ExcluirRelatorio().setVisible(true);
          
      }// fim if
            
            
    }//GEN-LAST:event_ExcluirBotaoActionPerformed

    private void AGENDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGENDAActionPerformed
       
    }//GEN-LAST:event_AGENDAActionPerformed

    private void jPanel2AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel2AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2AncestorMoved

    private void ConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConcluidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConcluidoActionPerformed

    private void FichaAdentimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichaAdentimentoActionPerformed
        if (evt.getSource()==FichaAdentimento){
            new FichaDeAtendimento().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_FichaAdentimentoActionPerformed


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
               
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGENDA;
    private javax.swing.JButton Concluido;
    private javax.swing.JButton Configuracao;
    private javax.swing.JButton ExcluirBotao;
    private javax.swing.JButton FichaAdentimento;
    private javax.swing.JLabel IFAM;
    private javax.swing.JButton INICIO;
    private javax.swing.JButton NOVO;
    private javax.swing.JButton Pasta;
    private javax.swing.JButton Pendente;
    private javax.swing.JLabel imagemagenda;
    private javax.swing.JLabel imagemconcluido;
    private javax.swing.JLabel imagemconfiguracao;
    private javax.swing.JLabel imageminicio;
    private javax.swing.JLabel imagemnovo;
    private javax.swing.JLabel imagempasta;
    private javax.swing.JLabel imagempendente;
    private javax.swing.JLabel imagemrelatorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
    }
