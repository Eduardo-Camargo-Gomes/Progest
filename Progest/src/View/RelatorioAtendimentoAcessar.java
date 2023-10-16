
package View;

import controller.RelatorioAtendimentoController;
import controller.UsuarioController;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.DAO.RelatorioAtendimentoDAO;
import model.RelatorioAtendimentoModel;

public class RelatorioAtendimentoAcessar extends javax.swing.JFrame {

    
   //RelatorioAtendimentoModel relatorioModel = new  RelatorioAtendimentoModel();
 
     SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
      SimpleDateFormat formatoBanco = new SimpleDateFormat("yyyy-MM-dd");
     
    SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
        boolean concluido = false;
        
        
    
      // formatacao de datas e horrio
     
      RelatorioAtendimentoDAO relatorioDAO = new  RelatorioAtendimentoDAO();
    private RelatorioAtendimentoModel relatorioModel;

    public RelatorioAtendimentoAcessar(RelatorioAtendimentoModel relatorioModel) throws SQLException, ParseException {
         this.relatorioModel = relatorioModel;
         // define o construtor  
        initComponents();
        setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
       relatorioModel  = relatorioDAO.acessarRelatorio(relatorioModel.getNumRelatorio());
       
       Date data = formatoBanco.parse(String.valueOf(relatorioModel.getDataOcorrido()));
       
     String dataOcorrencia; 
       dataOcorrencia = formatoData.format(data);
       
       if(relatorioModel.getConcluido() == true){
           CheckConcluido.setSelected(true);
       }// fim if 
       
       else{
           CheckConcluido.setSelected(false);
       }// fim else  
       
      CampoId.setText(String.valueOf(relatorioModel.getNumRelatorio()));
      CampoData.setText(String.valueOf(dataOcorrencia));
        CampoHorario.setText(String.valueOf(relatorioModel.getHorarioOcorrido()));
        CampoLocal.setText(relatorioModel.getLocalOcorrido());
      CampoDiscente.setText(relatorioModel.getNomeAluno());
      CampoTurma.setText(relatorioModel.getTurmaAluno());
      CampoPais.setText(relatorioModel.getNomeResponsavel());
      CampoSituacao.setText(relatorioModel.getSituacao());
      CampoEncaminhamentos.setText(relatorioModel.getEncaminhamentos());
      CampoConclusao.setText(relatorioModel.getConclusao());
      
         CampoId.setEditable(false);
  
    }// fim construtor
    
   public RelatorioAtendimentoAcessar() throws SQLException{
        
         initComponents();
        setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       //  preencherDados();
         CampoId.setEditable(false);
    }// fim cost


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        CampoId = new javax.swing.JTextField();
        CampoData = new javax.swing.JTextField();
        CampoHorario = new javax.swing.JTextField();
        CampoLocal = new javax.swing.JTextField();
        CampoDiscente = new javax.swing.JTextField();
        CampoTurma = new javax.swing.JTextField();
        CampoObservacoes = new javax.swing.JTextField();
        CampoPais = new javax.swing.JTextField();
        VOLTAR = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        CampoEncaminhamentos = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        CampoConclusao = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        CampoSituacao = new javax.swing.JTextArea();
        botaoSalvarAlteracao = new javax.swing.JButton();
        CheckConcluido = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("MINISTÉRIO DE EDUCAÇÃO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("SECRETARIA DE EDUCAÇÃO MÉDIA E TECNOLÓGICA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Instituição Federal de educação, Ciências e Tecnologia do Amazonas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("DIRETORIA DE ENSINO – DIREN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("DEPARTAMENTO DE COMUNICAÇÃO DE INFORMAÇÃO E TECNOLOGIA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 500, 800));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("  Relatório de atendimento N°:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 170, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("DAIC/CMC/IFAM/2023");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 130, 40));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("  1. Dados de identificação:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("  1.1 Data:                                1.2 Horario:                               1.3 Local:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 500, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("  1.4 Discente:                                                                             1.5 Turma:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 500, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("  1.6 Nome dos responsaveis pelo Discente:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 260, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("  2. ACOMPANHAMENTO PEDAGÓGICO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 500, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("  2.1 Ações desenvolvidas para o atendimento da situação e/ou solicitação:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 500, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("  4. CONCLUSÃO");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 880, 500, 50));

        jLabel16.setText("  3. ENCAMINHAMENTOS");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 730, 500, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Captura.derelatorio2.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Ifam (2).png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 110, 160));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MinisterioDaEducacao (3).png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 90));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 500, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 500, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 500, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 500, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 500, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 500, 10));

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 500, 440));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 880, 500, 10));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 500, 80));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 480, 10));

        CampoId.setBorder(null);
        jPanel1.add(CampoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 274, 40, -1));

        CampoData.setBorder(null);
        CampoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDataActionPerformed(evt);
            }
        });
        jPanel1.add(CampoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 80, 40));

        CampoHorario.setBorder(null);
        jPanel1.add(CampoHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 80, 40));

        CampoLocal.setBorder(null);
        jPanel1.add(CampoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 426, 130, 30));

        CampoDiscente.setBorder(null);
        jPanel1.add(CampoDiscente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 230, 20));

        CampoTurma.setBorder(null);
        jPanel1.add(CampoTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 80, 20));

        CampoObservacoes.setBorder(null);
        jPanel1.add(CampoObservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 500, 80));

        CampoPais.setBorder(null);
        jPanel1.add(CampoPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 240, 30));

        VOLTAR.setBackground(new java.awt.Color(204, 204, 204));
        VOLTAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        VOLTAR.setText("VOLTAR");
        VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARActionPerformed(evt);
            }
        });
        jPanel1.add(VOLTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 20));
        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CampoEncaminhamentos.setColumns(20);
        CampoEncaminhamentos.setRows(5);
        jScrollPane6.setViewportView(CampoEncaminhamentos);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 770, 500, 110));

        CampoConclusao.setColumns(20);
        CampoConclusao.setRows(5);
        jScrollPane7.setViewportView(CampoConclusao);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 930, 500, 130));

        CampoSituacao.setColumns(20);
        CampoSituacao.setRows(5);
        jScrollPane8.setViewportView(CampoSituacao);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 500, 110));

        botaoSalvarAlteracao.setText("SALVAR ");
        botaoSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarAlteracaoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoSalvarAlteracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        CheckConcluido.setText("Marcar como concluído");
        CheckConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckConcluidoActionPerformed(evt);
            }
        });
        jPanel1.add(CheckConcluido, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setSize(new java.awt.Dimension(809, 1127));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDataActionPerformed

    private void VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARActionPerformed
        if (evt.getSource()==VOLTAR){
           this.dispose();
        }
    }//GEN-LAST:event_VOLTARActionPerformed

    private void botaoSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarAlteracaoActionPerformed
        if(evt.getSource() == botaoSalvarAlteracao){
   
          RelatorioAtendimentoController relatorioController = new RelatorioAtendimentoController();
          
          RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
          
             
             if(CheckConcluido.isSelected()){
                 concluido = true;
             }// fim if
       
         Date dataOcorrencia = new Date();
            try {
                dataOcorrencia = formatoData.parse(CampoData.getText());
            } catch (ParseException ex) {
                Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
            }
             formatoData.format(dataOcorrencia);
   
          Date data = new Date();
        
            try {
                data = formatoHora.parse(CampoHorario.getText());
            } catch (ParseException ex) {
                Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
            }
     
          Time horarioOcorrencia = new Time(data.getTime());
           
          int numeroRelatorio = Integer.parseInt(CampoId.getText());
          
       boolean salvou = relatorioController.alterarRelatorio(dataOcorrencia,  horarioOcorrencia,
                          CampoLocal.getText(), CampoDiscente.getText(), CampoTurma.getText(),
                          CampoPais.getText(), CampoSituacao.getText(),
                CampoEncaminhamentos.getText(), CampoConclusao.getText(),
                numeroRelatorio, concluido);
         
       if(salvou == true){
          this.dispose();
       }// fim if  salvou
       
        }
    }//GEN-LAST:event_botaoSalvarAlteracaoActionPerformed

    private void CheckConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckConcluidoActionPerformed
        
    }//GEN-LAST:event_CheckConcluidoActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
        /*CampoId.setText(numeroRelatorio);
      CampoData.setText(String.valueOf(relatorioModel.getDataOcorrido()));
        CampoHorario.setText(String.valueOf(relatorioModel.getHorarioOcorrido()));
        CampoLocal.setText(relatorioModel.getLocalOcorrido());
      CampoDiscente.setText(relatorioModel.getNomeAluno());
      CampoTurma.setText(relatorioModel.getTurmaAluno());
      CampoPais.setText(relatorioModel.getNomeResponsavel());
      CampoSituacao.setText(relatorioModel.getSituacao());
      CampoEncaminhamentos.setText(relatorioModel.getEncaminhamentos());
      CampoConclusao.setText(relatorioModel.getConclusao());*/

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RelatorioAtendimentoAcessar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CampoConclusao;
    private javax.swing.JTextField CampoData;
    private javax.swing.JTextField CampoDiscente;
    private javax.swing.JTextArea CampoEncaminhamentos;
    private javax.swing.JTextField CampoHorario;
    private javax.swing.JTextField CampoId;
    private javax.swing.JTextField CampoLocal;
    private javax.swing.JTextField CampoObservacoes;
    private javax.swing.JTextField CampoPais;
    private javax.swing.JTextArea CampoSituacao;
    private javax.swing.JTextField CampoTurma;
    private javax.swing.JCheckBox CheckConcluido;
    private javax.swing.JButton VOLTAR;
    private javax.swing.JButton botaoSalvarAlteracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
