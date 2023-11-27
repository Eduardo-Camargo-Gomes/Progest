package View;

import controller.RelatorioAtendimentoController;
import controller.UsuarioController;
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
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.DAO.RelatorioAtendimentoDAO;
import model.RelatorioAtendimentoModel;

public class RelatorioAtendimentoAcessar extends javax.swing.JFrame implements DocumentListener, Printable {

    //RelatorioAtendimentoModel relatorioModel = new  RelatorioAtendimentoModel();
    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat formatoBanco = new SimpleDateFormat("yyyy-MM-dd");
    Menu menu = new Menu();

    SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
    boolean concluido = false;

    // formatacao de datas e horrio
    RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
    RelatorioAtendimentoController controlador = new RelatorioAtendimentoController();
    private RelatorioAtendimentoModel relatorioModel;
    int id = 0;
    List<Integer> listaProximo = relatorioDAO.passarProximo();
    List<Integer> listaAnterior = relatorioDAO.passarAnterior();
    List<Integer> listaEscolhida;

    public RelatorioAtendimentoAcessar(RelatorioAtendimentoModel relatorioModel) throws SQLException, ParseException {
        this.relatorioModel = relatorioModel;

        // define o construtor  
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        relatorioModel = relatorioDAO.acessarRelatorio(relatorioModel.getNumRelatorio());

        Date data = formatoBanco.parse(String.valueOf(relatorioModel.getDataOcorrido()));

        String dataOcorrencia;
        dataOcorrencia = formatoData.format(data);

        if (relatorioModel.getConcluido() == true) {
            CheckConcluido.setSelected(true);
        }// fim if 
        else {
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

        barraProgresso.setStringPainted(true);
        UIManager.put("ProgressBar.selectionBackground", Color.GREEN);
        CampoSituacao.getDocument().addDocumentListener(this);
        CampoEncaminhamentos.getDocument().addDocumentListener(this);
        CampoConclusao.getDocument().addDocumentListener(this);

        if (CampoSituacao.getText().length() > 0) {
            barraProgresso.setValue(33);
        }

        if (CampoEncaminhamentos.getText().length() > 0 && CampoSituacao.getText().length() > 0) {
            barraProgresso.setValue(66);
        }

        if (CampoEncaminhamentos.getText().length() > 0 && CampoSituacao.getText().length() > 0 && CampoConclusao.getText().length() > 0) {
            barraProgresso.setValue(100);
        }

        int numeroAtual = Integer.parseInt(CampoId.getText());
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

    }// fim construtor

    public RelatorioAtendimentoAcessar() throws SQLException {

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
        jLabel20 = new javax.swing.JLabel();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        CampoEncaminhamentos = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        CampoConclusao = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        CampoSituacao = new javax.swing.JTextArea();
        CheckConcluido = new javax.swing.JCheckBox();
        barraProgresso = new javax.swing.JProgressBar();
        proximo = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        salvar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuVoltar = new javax.swing.JMenu();
        Voltar = new javax.swing.JMenuItem();
        menuImprimir = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("  Completado:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 80, -1));

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

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Ifam (2).png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 110, 160));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MinisterioDaEducacao (3).png"))); // NOI18N
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

        CheckConcluido.setText("Marcar como concluído");
        CheckConcluido.setToolTipText("Marca o documento como concluído");
        CheckConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckConcluidoActionPerformed(evt);
            }
        });
        jPanel1.add(CheckConcluido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        barraProgresso.setBackground(new java.awt.Color(0, 204, 0));
        barraProgresso.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(barraProgresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 240, 30));

        proximo.setBackground(new java.awt.Color(255, 255, 255));
        proximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/seta-para-a-direita (1).png"))); // NOI18N
        proximo.setToolTipText("Próximo");
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });
        jPanel1.add(proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 30, 30));

        anterior.setBackground(new java.awt.Color(255, 255, 255));
        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/seta-esquerda (1) (2).png"))); // NOI18N
        anterior.setToolTipText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        jPanel1.add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 30, 30));

        jScrollPane1.setViewportView(jPanel1);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        salvar.setText("Salvar");
        salvar.setToolTipText("Salvar relatório");
        salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Salvar");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        salvar.add(jMenuItem1);

        jMenuBar1.add(salvar);

        menuVoltar.setText("Voltar");
        menuVoltar.setToolTipText("Voltar para o menu");
        menuVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVoltarActionPerformed(evt);
            }
        });

        Voltar.setText("Voltar");
        Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        menuVoltar.add(Voltar);

        jMenuBar1.add(menuVoltar);

        menuImprimir.setText("Imprimir");
        menuImprimir.setToolTipText("Imprimir documento");
        menuImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuImprimirActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Imprimir");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuImprimir.add(jMenuItem5);

        jMenuBar1.add(menuImprimir);

        jMenu1.setText("Excluir");
        jMenu1.setToolTipText("Excluir documento");

        jMenuItem2.setText("Excluir ");
        jMenuItem2.setToolTipText("");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void CheckConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckConcluidoActionPerformed

    }//GEN-LAST:event_CheckConcluidoActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        try {
            passar();
            /*  int numeroAtual = Integer.parseInt(CampoId.getText());
            int indiceAtual = 0;
            int proximoRelatorio = 0;
            
            try {
            List<Integer> listaPesquisa = relatorioDAO.listaIdsRelatoriosPorNome(menu.getNomePesquisado());

            if (menu.getAcessadoPelaBarra() == true) {
            indiceAtual = listaPesquisa.indexOf(numeroAtual);
            }
            
            else {
            indiceAtual = listaProximo.indexOf(numeroAtual);
            
            }
            } catch (SQLException ex) {
            Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
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
            */
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_proximoActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        this.dispose();
        int numeroAtual = Integer.parseInt(CampoId.getText());
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

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
          RelatorioAtendimentoController relatorioController = new RelatorioAtendimentoController();

            RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();

            if (CheckConcluido.isSelected()) {
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

            boolean salvou = relatorioController.alterarRelatorio(dataOcorrencia, horarioOcorrencia,
                    CampoLocal.getText(), CampoDiscente.getText(), CampoTurma.getText(),
                    CampoPais.getText(), CampoSituacao.getText(),
                    CampoEncaminhamentos.getText(), CampoConclusao.getText(),
                    numeroRelatorio, concluido);

            if (salvou == true) {
                this.dispose();
            }// fim if  salvou

        
    }//GEN-LAST:event_salvarActionPerformed

    private void menuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVoltarActionPerformed
     
        this.dispose();
      
    }//GEN-LAST:event_menuVoltarActionPerformed

    private void menuImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuImprimirActionPerformed
        try {
            print();
        } catch (PrinterException ex) {
            Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuImprimirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          RelatorioAtendimentoController relatorioController = new RelatorioAtendimentoController();

            RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();

            if (CheckConcluido.isSelected()) {
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

            boolean salvou = relatorioController.alterarRelatorio(dataOcorrencia, horarioOcorrencia,
                    CampoLocal.getText(), CampoDiscente.getText(), CampoTurma.getText(),
                    CampoPais.getText(), CampoSituacao.getText(),
                    CampoEncaminhamentos.getText(), CampoConclusao.getText(),
                    numeroRelatorio, concluido);

            if (salvou == true) {
                this.dispose();
            }// fim if  salvou

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
  this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            print();
        } catch (PrinterException ex) {
            Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            
          int result = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir esse relatório ?", "Confirmacao", JOptionPane.YES_NO_OPTION);
           if(result == JOptionPane.YES_OPTION){
            controlador.excluirRelatorioAtendimento(Integer.valueOf(CampoId.getText()));
            this.dispose();
           }
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
    private javax.swing.JMenuItem Voltar;
    private javax.swing.JButton anterior;
    private javax.swing.JProgressBar barraProgresso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
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
    private javax.swing.JMenu menuImprimir;
    private javax.swing.JMenu menuVoltar;
    private javax.swing.JButton proximo;
    private javax.swing.JMenu salvar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insertUpdate(DocumentEvent e) {
        atualizarBarra();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        atualizarBarra();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        atualizarBarra();
    }

    public void atualizarBarra() {
        int preenchido = 0;

        if (!CampoSituacao.getText().isEmpty()) {
            preenchido = 33;
        }

        if (!CampoSituacao.getText().isEmpty() && !CampoEncaminhamentos.getText().isEmpty()) {
            preenchido = 66;
        }// fim metodo

        if (!CampoSituacao.getText().isEmpty() && !CampoEncaminhamentos.getText().isEmpty() && !CampoConclusao.getText().isEmpty()) {
            preenchido = 100;
        }

        barraProgresso.setValue(preenchido);
        barraProgresso.revalidate();
        barraProgresso.repaint();

    }// fim metodo

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
    
    public void passar() throws SQLException{
        
         this.dispose();
       
          
            listaEscolhida = relatorioDAO.passarProximo();
       
        
         int numeroAtual = Integer.parseInt(CampoId.getText());
        int indiceAtual = 0;
        int proximoRelatorio = 0;

        indiceAtual = listaEscolhida.indexOf(numeroAtual);

        if (indiceAtual != -1 && indiceAtual < listaEscolhida.size() - 1) {

            proximoRelatorio = listaEscolhida.get(indiceAtual + 1);
        }// fim if 

        try {
            passarProximo(proximoRelatorio);
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(RelatorioAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }// fim metodo

    public void passarProximo(int numero) throws SQLException, ParseException {
       

        RelatorioAtendimentoModel relatorioAcessar = new RelatorioAtendimentoModel(numero);

        new RelatorioAtendimentoAcessar(relatorioAcessar).setVisible(true);

    }// fim metodo
    
    
    
    

}// fim classe 
