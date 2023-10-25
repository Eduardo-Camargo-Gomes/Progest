package View;

import controller.ParecerController;
import controller.ParecerController;
import controller.RelatorioAtendimentoController;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import model.DAO.ParecerDAO;
import model.DAO.ParecerDAO;
import model.ParecerModel;
import model.ParecerModel;
/**
 *
 * @author vitor
 */
public class ParecerNovo extends javax.swing.JFrame {
    
    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    /**
     * Creates new form ParecerNovo
     */
    public ParecerNovo() throws SQLException{
        initComponents();
        setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         mostrarIdParecer();
         numeroDoParecer.setEditable(false);
         
    }//fim construtor
    
    public void mostrarIdParecer() throws SQLException{
        
        ParecerModel parecerModel = new ParecerModel();
        ParecerDAO parecerDAO = new ParecerDAO();
        
        parecerModel = parecerDAO.mostrarNumeroParecer();
        numeroDoParecer.setText(String.valueOf(parecerModel.getNumParecer()+ 1));
    }// fim metodo
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        novo = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
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
        data = new javax.swing.JTextField();
        CheckConcluido = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 57, 680, 10));

        novo.setText("SALVAR");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });
        jPanel1.add(novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        voltar.setText("VOLTAR");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel1.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));
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
        numeroDoParecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroDoParecerActionPerformed(evt);
            }
        });
        jPanel1.add(numeroDoParecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 202, 50, -1));

        jLabel9.setText("/DAIC/CMC/IFAM/2023");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 202, 130, -1));

        jLabel10.setText("ASSUNTO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 234, -1, -1));

        assuntoDoParecer.setBorder(null);
        assuntoDoParecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assuntoDoParecerActionPerformed(evt);
            }
        });
        jPanel1.add(assuntoDoParecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 234, 220, 20));

        jLabel11.setText("INTERESSADO:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 264, -1, -1));

        nomeInteressado.setBorder(null);
        nomeInteressado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeInteressadoActionPerformed(evt);
            }
        });
        jPanel1.add(nomeInteressado, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 264, 190, -1));

        jLabel12.setText("MATRICULA:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 294, -1, -1));

        codMatricula.setBorder(null);
        codMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codMatriculaActionPerformed(evt);
            }
        });
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

        local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localActionPerformed(evt);
            }
        });
        jPanel1.add(local, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 682, 100, -1));

        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        jPanel1.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 682, 60, -1));

        CheckConcluido.setText("Marcar como concluído");
        CheckConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckConcluidoActionPerformed(evt);
            }
        });
        jPanel1.add(CheckConcluido, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

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

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
  if(evt.getSource() == novo){
   boolean concluido = false;
      
             if(CheckConcluido.isSelected()){
                 concluido = true;
             }// fim if
             else {
                 concluido = false;
             }/// fim else 
             
              Date dataOcorrido = null;  
        try {
            dataOcorrido = formatoData.parse(data.getText());
        } catch (ParseException ex) {
            Logger.getLogger(ParecerNovo.class.getName()).log(Level.SEVERE, null, ex);
        }
             formatoData.format(dataOcorrido);
      ParecerController parecerController = new ParecerController();
            
     boolean sucesso = parecerController.salvarParecer(assuntoDoParecer.getText(), nomeInteressado.getText(), 
            codMatricula.getText(),localDoTexto.getText(), local.getText(), dataOcorrido , concluido);
             
     if(sucesso){
         
         this.dispose();
     }// fim if
     
  }// fim if
    }//GEN-LAST:event_novoActionPerformed

    private void CheckConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckConcluidoActionPerformed

    }//GEN-LAST:event_CheckConcluidoActionPerformed

    private void numeroDoParecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroDoParecerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroDoParecerActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
         if(evt.getSource() == voltar){
            this.dispose();
        }
    }//GEN-LAST:event_voltarActionPerformed

    private void localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void assuntoDoParecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assuntoDoParecerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assuntoDoParecerActionPerformed

    private void nomeInteressadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeInteressadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeInteressadoActionPerformed

    private void codMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codMatriculaActionPerformed

    /**
     * 
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ParecerNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParecerNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParecerNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParecerNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new ParecerNovo().setVisible(true);
                }catch(SQLException ex){
                    Logger.getLogger(ParecerNovo.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckConcluido;
    private javax.swing.JTextField assuntoDoParecer;
    private javax.swing.JTextField codMatricula;
    private javax.swing.JTextField data;
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
    private javax.swing.JButton novo;
    private javax.swing.JTextField numeroDoParecer;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
