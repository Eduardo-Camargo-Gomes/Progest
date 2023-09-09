package View;

public class Calendario extends javax.swing.JFrame {

    public Calendario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        IFAM = new javax.swing.JLabel();
        imagemmenu = new javax.swing.JLabel();
        imageminicio = new javax.swing.JLabel();
        imagemnovo = new javax.swing.JLabel();
        imagemagenda = new javax.swing.JLabel();
        imagemrelatorio = new javax.swing.JLabel();
        imagemconcluido = new javax.swing.JLabel();
        imagempendente = new javax.swing.JLabel();
        imagempasta = new javax.swing.JLabel();
        imagemconfiguracao = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        Configuracao = new javax.swing.JButton();
        Pasta = new javax.swing.JButton();
        Pendente = new javax.swing.JButton();
        AGENDA = new javax.swing.JButton();
        Relatorio = new javax.swing.JButton();
        NOVO = new javax.swing.JButton();
        MENU = new javax.swing.JButton();
        INICIO = new javax.swing.JButton();
        Concluido = new javax.swing.JButton();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(186, 203, 212));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, 800));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setAlignmentX(1.0F);
        jSeparator2.setAlignmentY(1.0F);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 340, 20));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setAlignmentX(1.0F);
        jSeparator3.setAlignmentY(1.0F);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1540, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.desair.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 0, -1, -1));

        IFAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.ifam.png"))); // NOI18N
        jPanel1.add(IFAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 110));

        imagemmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.demenu.png"))); // NOI18N
        jPanel1.add(imagemmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, 50));

        imageminicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.deinicio.png"))); // NOI18N
        jPanel1.add(imageminicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 50, 60));

        imagemnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.denovo.png"))); // NOI18N
        jPanel1.add(imagemnovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 40));

        imagemagenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.deagenda.png"))); // NOI18N
        jPanel1.add(imagemagenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, 50));

        imagemrelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.derelatorio.png"))); // NOI18N
        jPanel1.add(imagemrelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 50, 50));

        imagemconcluido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.deconcluido.png"))); // NOI18N
        jPanel1.add(imagemconcluido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 50, 50));

        imagempendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.dependente.png"))); // NOI18N
        jPanel1.add(imagempendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 50, -1));

        imagempasta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.depasta.png"))); // NOI18N
        jPanel1.add(imagempasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 50, 50));

        imagemconfiguracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.deconfiguracao.png"))); // NOI18N
        jPanel1.add(imagemconfiguracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 50, 50));

        jButton1.setBackground(new java.awt.Color(186, 203, 212));
        jButton1.setText("Ajuda");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 50, 20));

        sair.setBackground(new java.awt.Color(186, 203, 212));
        sair.setText("SAIR");
        sair.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jPanel1.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 10, 40, 20));

        Configuracao.setBackground(new java.awt.Color(186, 203, 212));
        Configuracao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Configuracao.setText("Configuração");
        Configuracao.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Configuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracaoActionPerformed(evt);
            }
        });
        jPanel1.add(Configuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 150, 30));

        Pasta.setBackground(new java.awt.Color(186, 203, 212));
        Pasta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Pasta.setText("Pasta");
        Pasta.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(Pasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 70, 30));

        Pendente.setBackground(new java.awt.Color(186, 203, 212));
        Pendente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Pendente.setText("Pendente");
        Pendente.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(Pendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 110, 30));

        AGENDA.setBackground(new java.awt.Color(186, 203, 212));
        AGENDA.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        AGENDA.setText("Agenda");
        AGENDA.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        AGENDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGENDAActionPerformed(evt);
            }
        });
        jPanel1.add(AGENDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 90, 30));

        Relatorio.setBackground(new java.awt.Color(186, 203, 212));
        Relatorio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Relatorio.setText("Relatório");
        Relatorio.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioActionPerformed(evt);
            }
        });
        jPanel1.add(Relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 110, 30));

        NOVO.setBackground(new java.awt.Color(186, 203, 212));
        NOVO.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        NOVO.setText("Novo");
        NOVO.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        NOVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOVOActionPerformed(evt);
            }
        });
        jPanel1.add(NOVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 70, 30));

        MENU.setBackground(new java.awt.Color(186, 203, 212));
        MENU.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        MENU.setText("Menu");
        MENU.setBorder(null);
        jPanel1.add(MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 70, 30));

        INICIO.setBackground(new java.awt.Color(186, 203, 212));
        INICIO.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        INICIO.setText("Inicío");
        INICIO.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(INICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 70, 30));

        Concluido.setBackground(new java.awt.Color(186, 203, 212));
        Concluido.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Concluido.setText("Concluído");
        Concluido.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(Concluido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 120, 30));
        jPanel1.add(jCalendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 250, 360, 340));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 350, 50));
        jPanel1.add(jDayChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 390, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOVOActionPerformed
        if (evt.getSource()==NOVO){
            new RelatorioAtendimento().setVisible(true);
            this.setVisible(false);

        }
    }//GEN-LAST:event_NOVOActionPerformed

    private void AGENDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGENDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AGENDAActionPerformed

    private void RelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RelatorioActionPerformed

    private void ConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfiguracaoActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        if (evt.getSource()==sair){
            new TelaInicio().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_sairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGENDA;
    private javax.swing.JButton Concluido;
    private javax.swing.JButton Configuracao;
    private javax.swing.JLabel IFAM;
    private javax.swing.JButton INICIO;
    private javax.swing.JButton MENU;
    private javax.swing.JButton NOVO;
    private javax.swing.JButton Pasta;
    private javax.swing.JButton Pendente;
    private javax.swing.JButton Relatorio;
    private javax.swing.JLabel imagemagenda;
    private javax.swing.JLabel imagemconcluido;
    private javax.swing.JLabel imagemconfiguracao;
    private javax.swing.JLabel imageminicio;
    private javax.swing.JLabel imagemmenu;
    private javax.swing.JLabel imagemnovo;
    private javax.swing.JLabel imagempasta;
    private javax.swing.JLabel imagempendente;
    private javax.swing.JLabel imagemrelatorio;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
