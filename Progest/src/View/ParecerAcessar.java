package View;

import controller.FichaAtendimentoController;
import controller.ParecerController;
import controller.ParecerController;
import controller.RelatorioAtendimentoController;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.DAO.ParecerDAO;
import model.DAO.ParecerDAO;
import model.ParecerModel;
import model.ParecerModel;

/**
 *
 * @author vitor
 */
public class ParecerAcessar extends javax.swing.JFrame implements Printable {

    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat formatoBanco = new SimpleDateFormat("yyyy-MM-dd");
    ParecerDAO parecerDAO = new ParecerDAO();
    List<Integer> listaProximo = parecerDAO.passarProximo();
    List<Integer> listaAnterior =parecerDAO.passarAnterior();

    boolean concluido = false;

    public ParecerAcessar() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public ParecerAcessar(ParecerModel parecerAcessar) throws SQLException, ParseException {

        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ParecerDAO parecerDAO = new ParecerDAO();

        parecerAcessar = parecerDAO.acessarParecer(parecerAcessar.getNumParecer());

        Date data = formatoBanco.parse(String.valueOf(parecerAcessar.getDataOcorrido()));

        String dataOcorrencia;
        dataOcorrencia = formatoData.format(data);

        if (parecerAcessar.getConcluido() == true) {
            CheckConcluido.setSelected(true);
        }// fim if 
        else {
            CheckConcluido.setSelected(false);
        }// fim else  

        numeroDoParecer.setText(String.valueOf(parecerAcessar.getNumParecer()));
        assuntoDoParecer.setText(parecerAcessar.getAssuntoParecer());
        nomeInteressado.setText(parecerAcessar.getInteressadoParecer());
        codMatricula.setText(parecerAcessar.getMatriculaAluno());
        localDoTexto.setText(parecerAcessar.getTexto());
        local.setText(parecerAcessar.getLocal());
        campoData.setText(String.valueOf(dataOcorrencia));

        numeroDoParecer.setEditable(false);
        
         int numeroAtual = Integer.parseInt(numeroDoParecer.getText());
        int indiceAtualProximo = listaProximo.indexOf(numeroAtual);
        int indiceAtualAnterior = listaAnterior.indexOf(numeroAtual);
        if (indiceAtualProximo + 1 > listaProximo.size() - 1) {
            proximo.setEnabled(false);
            proximo.setBackground(Color.GRAY);
        }// fim else 

        if (indiceAtualAnterior + 1 > listaAnterior.size() - 1) {
            anterior.setEnabled(false);
            anterior.setBackground(Color.GRAY);
        }// fim else 

    }//fim construtor  de preenchimento

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        numeroDoParecer = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        assuntoDoParecer = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nomeInteressado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        codMatricula = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        localDoTexto = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        local = new javax.swing.JTextField();
        campoData = new javax.swing.JTextField();
        CheckConcluido = new javax.swing.JCheckBox();
        anterior = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 57, 680, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MinisterioDaEducacao (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 121, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Ifam (2).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 59, 104, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 194, 620, 10));

        jLabel3.setText("SECRETARIA DE EDUCAÇÃO PROFISSIONAL E TECNOLOGIA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel4.setText("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIAS E TECNOLOGIA DO AMAZONAS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel5.setText("CAMPUS MANAUS CENTRO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabel6.setText("DIRETORIA DE ENSINO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel7.setText("DAIC");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel35.setText("MINISTÉRIO DA EDUCAÇÃO");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabel8.setText("PARECER N°");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 202, 72, -1));

        numeroDoParecer.setBorder(null);
        jPanel1.add(numeroDoParecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 202, 50, -1));

        jLabel9.setText("/DAIC/CMC/IFAM/2023");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 202, 130, -1));

        jLabel10.setText("ASSUNTO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 234, -1, -1));

        assuntoDoParecer.setBorder(null);
        jPanel1.add(assuntoDoParecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 234, 220, 20));

        jLabel11.setText("INTERESSADO:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 264, -1, -1));

        nomeInteressado.setBorder(null);
        jPanel1.add(nomeInteressado, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 264, 190, -1));

        jLabel12.setText("MATRICULADO:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 294, -1, -1));

        codMatricula.setBorder(null);
        jPanel1.add(codMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 294, 190, -1));

        localDoTexto.setColumns(20);
        localDoTexto.setRows(5);
        jScrollPane2.setViewportView(localDoTexto);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 329, 618, 320));

        jLabel13.setText("É o parecer.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 660, -1, -1));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 710, 140, 26));

        jLabel15.setText("Ilma Ferreira Rodrigues");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 760, 130, -1));

        jLabel16.setText("Pedagoga - DAIC/IFAM");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 780, -1, -1));

        jLabel17.setText("SIAPE n° 01746885");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 800, 100, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 223, 50, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 220, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 200, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 190, 10));
        jPanel1.add(local, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 682, 80, -1));
        jPanel1.add(campoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 682, 80, -1));

        CheckConcluido.setText("Marcar como concluído");
        CheckConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckConcluidoActionPerformed(evt);
            }
        });
        jPanel1.add(CheckConcluido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        anterior.setBackground(new java.awt.Color(255, 255, 255));
        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/seta-esquerda (1) (2).png"))); // NOI18N
        anterior.setToolTipText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        jPanel1.add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 30, 30));

        proximo.setBackground(new java.awt.Color(255, 255, 255));
        proximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/seta-para-a-direita (1).png"))); // NOI18N
        proximo.setToolTipText("Próximo");
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });
        jPanel1.add(proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 30, 30));

        jScrollPane1.setViewportView(jPanel1);

        jMenu1.setText("Salvar");
        jMenu1.setToolTipText("Salvar documento");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setText("Salvar");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Voltar");
        jMenu2.setToolTipText("Voltar para o menu");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem2.setText("Voltar");
        jMenuItem2.setToolTipText("");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Imprimir");
        jMenu3.setToolTipText("Imprimir documento");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem3.setText("Imprimir");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Excluir");
        jMenu4.setToolTipText("Excluir documento");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem4.setText("Excluir");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckConcluidoActionPerformed

    }//GEN-LAST:event_CheckConcluidoActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        this.dispose();
        int numeroAtual = Integer.parseInt(numeroDoParecer.getText());
        int indiceAtual = listaAnterior.indexOf(numeroAtual);
        int proximoRelatorio = 0;

        if (indiceAtual != -1 && indiceAtual < listaAnterior.size() - 1) {

            proximoRelatorio = listaAnterior.get(indiceAtual + 1);
        }// fim if

        try {
            passarProximo(proximoRelatorio);
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        this.dispose();
        int numeroAtual = Integer.parseInt(numeroDoParecer.getText());
        int indiceAtual = listaProximo.indexOf(numeroAtual);
        int proximoRelatorio = 0;

        if (indiceAtual != -1 && indiceAtual < listaProximo.size() - 1) {

            proximoRelatorio = listaProximo.get(indiceAtual + 1);
        }// fim if

        try {
            passarProximo(proximoRelatorio);
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_proximoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       ParecerModel parecerModel = new ParecerModel();
            ParecerDAO parecerDAO = new ParecerDAO();
            ParecerController controlador = new ParecerController();

            boolean concluido = false;

            if (CheckConcluido.isSelected()) {
                concluido = true;
            }// fim if

            Date dataOcorrencia = new Date();
            try {
                dataOcorrencia = formatoData.parse(campoData.getText());
            } catch (ParseException ex) {
                Logger.getLogger(ParecerAcessar.class.getName()).log(Level.SEVERE, null, ex);
            }
            formatoData.format(dataOcorrencia);

            int numParecer = Integer.parseInt(numeroDoParecer.getText());

            boolean salvou = controlador.alterarParecer(assuntoDoParecer.getText(), nomeInteressado.getText(),
                    codMatricula.getText(), localDoTexto.getText(), local.getText(), dataOcorrencia, concluido, numParecer);
            if (salvou) {
                this.dispose();

            }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            print();
        } catch (PrinterException ex) {
            Logger.getLogger(ParecerAcessar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
     ParecerController controlador = new ParecerController();
        int result = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir esse parecer ?", "Confirmacao", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            try {
                controlador.excluirParecer(Integer.valueOf(numeroDoParecer.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(FichaDeAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if (pageIndex > 0) {
            return Printable.NO_SUCH_PAGE;
        }// fim override

        Graphics2D g2d = (Graphics2D) graphics;

        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        double panelWidth = jPanel1.getWidth();
        double panelHeigth = jPanel1.getHeight();

        double pageWidth = pageFormat.getImageableWidth();
        double pageHeigth = pageFormat.getImageableHeight();

        double scaleFactor = Math.min(pageWidth / panelWidth, pageHeigth / panelHeigth);

        g2d.scale(scaleFactor, scaleFactor);

        jPanel1.paint(g2d);

        return PAGE_EXISTS;

    }

    public void print() throws PrinterException {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);

        if (job.printDialog()) {
            job.print();

        }
    }// fim metodo imprimir 
    
    public void passarProximo(int numero) throws SQLException, ParseException{
        ParecerModel parecer = new ParecerModel(numero);
        
        new ParecerAcessar(parecer).setVisible(true);
    }// fim metodo

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParecerAcessar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParecerAcessar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParecerAcessar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParecerAcessar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ParecerAcessar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ParecerAcessar.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckConcluido;
    private javax.swing.JButton anterior;
    private javax.swing.JTextField assuntoDoParecer;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField codMatricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField local;
    private javax.swing.JTextArea localDoTexto;
    private javax.swing.JTextField nomeInteressado;
    private javax.swing.JTextField numeroDoParecer;
    private javax.swing.JButton proximo;
    // End of variables declaration//GEN-END:variables
}
