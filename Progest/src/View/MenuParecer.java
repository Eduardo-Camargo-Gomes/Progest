/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import model.*;
import controller.*;
import model.DAO.*;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuParecer extends javax.swing.JFrame {

    String tipoOrdenacao = null;
    //Todos relatórios, Já concluídos   
    RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
    FichaAtendimentoDAO fichaDAO = new FichaAtendimentoDAO();
    ParecerDAO parecerDAO = new ParecerDAO();
    private String labelClicado = "menuRelatorio";
    ButtonGroup grupo = new ButtonGroup();

    Map<String, Boolean> selecaoJlabel = new HashMap<>();
    private boolean labelsCriados = false;
    private boolean visivel = false;
    private boolean tresPontosClicado;

    List<JLabel> listaJlabel = new ArrayList<>();

    Color cor = new Color(255, 255, 255);

    Color cor3 = new Color(255, 255, 255);

    public MenuParecer() throws SQLException {

        initComponents();
        painelDocumentos.removeAll();
        mostrarParecer("Mais recentes primeiro");
        painelLateral.setVisible(true);

        setLocationRelativeTo(null);

        novo.setBackground(cor);

        relatorio3.setBackground(cor3);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

    }// fim construtor 

  

  

    public void mostrarParecer(String tipoOrdenacao) throws SQLException {

        painelDocumentos.removeAll();
        painelDocumentos.revalidate();
        painelDocumentos.repaint();

        List<Integer> listaIdsParecer = parecerDAO.listaIdsParecer(tipoOrdenacao);

        Map<Integer, JLabel> mapaParecer = new HashMap<>();

        int x = 20;
        int y = 25;

        int larguraPainel = painelDocumentos.getWidth();
        int larguraLabel = 138;
        int alturaLabel = 185;
        int espacoLabels = 28;

        ImageIcon imagemParecer = new ImageIcon(getClass().getResource("miniaturaParecer.png"));

        for (int i = 0; i < listaIdsParecer.size(); i++) {

            JLabel miniaturaParecer = new JLabel(imagemParecer);
            JLabel especParecer = new JLabel("Parecer N° " + listaIdsParecer.get(i));
            
             if (x + larguraLabel > larguraPainel) {
                x = 20;
                y += alturaLabel + espacoLabels;
            }

            // define a posicao dos jlabels dos relatorios
            miniaturaParecer.setBounds(x, y, 142, 183);
            miniaturaParecer.setBorder(BorderFactory.createLineBorder(Color.black));

            //define a posicao dos jlabels de legenda dos relatorios
            especParecer.setBounds(x + 28, y + 170, 100, 50);
            miniaturaParecer.putClientProperty("numeroParecer", listaIdsParecer.get(i));
            miniaturaParecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            especParecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
              x += larguraLabel + espacoLabels;

            miniaturaParecer.setVisible(true);
            especParecer.setVisible(true);
            painelDocumentos.add(especParecer);
            painelDocumentos.add(miniaturaParecer);

            miniaturaParecer.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {

                    JLabel parecerClicado = (JLabel) e.getSource();

                    Object idObj = parecerClicado.getClientProperty("numeroParecer");

                    final int id = (int) idObj;

                    ParecerDAO parecerDAO = new ParecerDAO();
                    ParecerModel parecerAcessar = new ParecerModel(id);
                    try {
                        new ParecerAcessar(parecerAcessar).setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuParecer.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(MenuParecer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }// fim mouse clicked

                @Override
                public void mouseEntered(MouseEvent e) {

                    miniaturaParecer.setBorder(BorderFactory.createLineBorder(Color.blue));
                    revalidate();
                    repaint();

                }//fim metodo

                @Override
                public void mouseExited(MouseEvent e) {

                    miniaturaParecer.setBorder(BorderFactory.createLineBorder(Color.black));
                    revalidate();
                    repaint();

                }//fim metodo
            });

        }// fim for
        painelDocumentos.setPreferredSize(new Dimension(1410, y + alturaLabel + 35));
        painelDocumentos.revalidate();
        painelDocumentos.repaint();
    }//fim metodo

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        documentoSelecionado = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        painelLateral = new javax.swing.JPanel();
        tresPontosLateral = new javax.swing.JLabel();
        logoProgestLateral = new javax.swing.JLabel();
        Documentos1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menuParecer = new javax.swing.JLabel();
        menuFicha = new javax.swing.JLabel();
        menuRelatorio = new javax.swing.JLabel();
        excluirParecer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        janelaPrincipal = new javax.swing.JPanel();
        Iniciarumnovodocumento = new javax.swing.JLabel();
        novolbl = new javax.swing.JLabel();
        relatorio3 = new javax.swing.JButton();
        novo = new javax.swing.JButton();
        parecerRadio = new javax.swing.JRadioButton();
        painelDocumentos = new javax.swing.JPanel();
        filtroJanela = new javax.swing.JComboBox<>();
        progestLogo = new javax.swing.JLabel();
        documentosRecentes = new javax.swing.JLabel();
        tresPontosPrincipal = new javax.swing.JLabel();
        logoProgestLateral1 = new javax.swing.JLabel();
        txtnomealuno = new java.awt.TextField();
        pesquisar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1535, 785));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelLateral.setBackground(new java.awt.Color(186, 203, 212));
        painelLateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        painelLateral.setMinimumSize(new java.awt.Dimension(210, 785));
        painelLateral.setPreferredSize(new java.awt.Dimension(137, 182));
        painelLateral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelLateralMouseClicked(evt);
            }
        });
        painelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tresPontosLateral.setBackground(new java.awt.Color(186, 203, 212));
        tresPontosLateral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tresPontosLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Menu.png"))); // NOI18N
        tresPontosLateral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tresPontosLateral.setOpaque(true);
        tresPontosLateral.setVerifyInputWhenFocusTarget(false);
        tresPontosLateral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresPontosLateralMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tresPontosLateralMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tresPontosLateralMouseExited(evt);
            }
        });
        painelLateral.add(tresPontosLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 17, 30, 30));

        logoProgestLateral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoProgestLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/contrato (14).png"))); // NOI18N
        painelLateral.add(logoProgestLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 10, 40, 40));

        Documentos1.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        Documentos1.setForeground(new java.awt.Color(102, 102, 102));
        Documentos1.setText("Progest");
        painelLateral.add(Documentos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 10, 131, 40));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        painelLateral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 280, 10));

        menuParecer.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        menuParecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/docsTs (1).png"))); // NOI18N
        menuParecer.setText(" Parecer");
        menuParecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuParecer.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                menuParecerAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        menuParecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuParecerMouseClicked(evt);
            }
        });
        painelLateral.add(menuParecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        menuFicha.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        menuFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/docsTs (1).png"))); // NOI18N
        menuFicha.setText(" Ficha");
        menuFicha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFicha.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                menuFichaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        menuFicha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFichaMouseClicked(evt);
            }
        });
        painelLateral.add(menuFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 30));

        menuRelatorio.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        menuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/docsTs (1).png"))); // NOI18N
        menuRelatorio.setText(" Relatório");
        menuRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRelatorioMouseClicked(evt);
            }
        });
        painelLateral.add(menuRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        excluirParecer.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        excluirParecer.setForeground(new java.awt.Color(51, 51, 51));
        excluirParecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lixeira.png"))); // NOI18N
        excluirParecer.setText("  Excluir parecer ");
        excluirParecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluirParecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirParecerMouseClicked(evt);
            }
        });
        painelLateral.add(excluirParecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 150, 30));

        jPanel1.add(painelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setText("Filtrar por...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 80, 20));

        janelaPrincipal.setBackground(new java.awt.Color(186, 203, 212));
        janelaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Iniciarumnovodocumento.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        Iniciarumnovodocumento.setForeground(new java.awt.Color(51, 51, 51));
        Iniciarumnovodocumento.setText("Iniciar um novo documento");
        janelaPrincipal.add(Iniciarumnovodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 18, -1, -1));

        novolbl.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        novolbl.setForeground(new java.awt.Color(51, 51, 51));
        novolbl.setText("NOVO");
        janelaPrincipal.add(novolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 50, 12));

        relatorio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/miniaturaParecer.png"))); // NOI18N
        relatorio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                relatorio3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                relatorio3MouseExited(evt);
            }
        });
        relatorio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorio3ActionPerformed(evt);
            }
        });
        janelaPrincipal.add(relatorio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 55, 150, 190));

        novo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mais (1).png"))); // NOI18N
        novo.setOpaque(true);
        novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                novoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                novoMouseExited(evt);
            }
        });
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });
        janelaPrincipal.add(novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 55, 150, 190));

        parecerRadio.setBackground(new java.awt.Color(186, 203, 212));
        documentoSelecionado.add(parecerRadio);
        parecerRadio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        parecerRadio.setText("Parecer");
        parecerRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parecerRadioActionPerformed(evt);
            }
        });
        janelaPrincipal.add(parecerRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 99, 16));

        jPanel1.add(janelaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 1535, 316));

        painelDocumentos.setBackground(new java.awt.Color(204, 204, 204));
        painelDocumentos.setLayout(null);
        jPanel1.add(painelDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1410, -1));

        filtroJanela.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        filtroJanela.setForeground(new java.awt.Color(51, 51, 51));
        filtroJanela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mais recentes primeiro", "Mais antigos primeiro", "Já concluídos", "Últimos acessados", "Última modificação" }));
        filtroJanela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroJanelaActionPerformed(evt);
            }
        });
        jPanel1.add(filtroJanela, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 398, -1, -1));

        progestLogo.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        progestLogo.setForeground(new java.awt.Color(102, 102, 102));
        progestLogo.setText("Progest");
        jPanel1.add(progestLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 10, 131, 40));

        documentosRecentes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        documentosRecentes.setForeground(new java.awt.Color(51, 51, 51));
        documentosRecentes.setText("Documentos recentes");
        jPanel1.add(documentosRecentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 408, 178, 20));

        tresPontosPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        tresPontosPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tresPontosPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Menu.png"))); // NOI18N
        tresPontosPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tresPontosPrincipal.setOpaque(true);
        tresPontosPrincipal.setVerifyInputWhenFocusTarget(false);
        tresPontosPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresPontosPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tresPontosPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tresPontosPrincipalMouseExited(evt);
            }
        });
        jPanel1.add(tresPontosPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 17, 30, 30));

        logoProgestLateral1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoProgestLateral1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/contrato (14).png"))); // NOI18N
        logoProgestLateral1.setToolTipText("Progest");
        logoProgestLateral1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(logoProgestLateral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 10, 40, 40));

        txtnomealuno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtnomealuno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtnomealuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomealunoActionPerformed(evt);
            }
        });
        txtnomealuno.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                txtnomealunoTextValueChanged(evt);
            }
        });
        txtnomealuno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnomealunoKeyReleased(evt);
            }
        });
        jPanel1.add(txtnomealuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 340, 30));

        pesquisar.setBackground(new java.awt.Color(204, 204, 204));
        pesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pesquisar.setText("🔎");
        pesquisar.setToolTipText("Pesquisar");
        pesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesquisar.setOpaque(true);
        pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisarMouseClicked(evt);
            }
        });
        jPanel1.add(pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 30, 30));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1535, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int x = 230;
    int y = 0;


    private void relatorio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relatorio3ActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed

        if (parecerRadio.isSelected()) {
            if (evt.getSource() == novo) {
                try {
                    new ParecerNovo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MenuParecer.class.getName()).log(Level.SEVERE, null, ex);
                }// fim catch// fim catch
            }// fim fif
        }// fim else ifG

    }//GEN-LAST:event_novoActionPerformed


    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void novoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_novoMouseClicked

    private void filtroJanelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroJanelaActionPerformed

        tipoOrdenacao = (String) filtroJanela.getSelectedItem();

        try {
            mostrarParecer(tipoOrdenacao);

        } catch (SQLException ex) {
            Logger.getLogger(MenuParecer.class.getName()).log(Level.SEVERE, null, ex);
        }

       


    }//GEN-LAST:event_filtroJanelaActionPerformed

    private void parecerRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parecerRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parecerRadioActionPerformed

    private void painelLateralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelLateralMouseClicked

    }//GEN-LAST:event_painelLateralMouseClicked

    private void tresPontosLateralMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresPontosLateralMouseExited
        tresPontosLateral.setBackground(new java.awt.Color(186, 203, 212));
    }//GEN-LAST:event_tresPontosLateralMouseExited

    private void tresPontosLateralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresPontosLateralMouseEntered
        tresPontosLateral.setBackground(new java.awt.Color(186, 203, 212));
    }//GEN-LAST:event_tresPontosLateralMouseEntered

    private void tresPontosLateralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresPontosLateralMouseClicked
        ocultarLateral();


    }//GEN-LAST:event_tresPontosLateralMouseClicked

    private void menuParecerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_menuParecerAncestorAdded

    }//GEN-LAST:event_menuParecerAncestorAdded

    private void menuFichaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_menuFichaAncestorAdded

    }//GEN-LAST:event_menuFichaAncestorAdded

    private void menuParecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuParecerMouseClicked
        if (evt.getSource() == menuParecer) {
            try {
                new MenuParecer().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.setVisible(false);

        try {

            mostrarParecer("Todos documentos");
            labelClicado = "menuParecer";
            filtroJanela.setSelectedItem("Todos documentos");
            ocultarLateral();
            revalidate();
            repaint();
        } catch (SQLException ex) {
            Logger.getLogger(MenuParecer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuParecerMouseClicked

    private void menuFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFichaMouseClicked
        if (evt.getSource() == menuFicha) {
            try {
                new MenuFicha().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.dispose();

       
    }//GEN-LAST:event_menuFichaMouseClicked

    private void menuRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRelatorioMouseClicked
        if (evt.getSource() == menuRelatorio) {
            try {
                new Menu().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.setVisible(false);

       
    }//GEN-LAST:event_menuRelatorioMouseClicked

    private void tresPontosPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresPontosPrincipalMouseClicked

        mostrarLateral();


    }//GEN-LAST:event_tresPontosPrincipalMouseClicked

    private void tresPontosPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresPontosPrincipalMouseEntered

    }//GEN-LAST:event_tresPontosPrincipalMouseEntered

    private void tresPontosPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresPontosPrincipalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tresPontosPrincipalMouseExited

    private void excluirParecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirParecerMouseClicked
        new ExcluirParecer().setVisible(true);
    }//GEN-LAST:event_excluirParecerMouseClicked

    private void relatorio3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorio3MouseEntered
        relatorio3.setBorder(BorderFactory.createLineBorder(Color.blue));
    }//GEN-LAST:event_relatorio3MouseEntered

    private void relatorio3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorio3MouseExited
        relatorio3.setBorder(null);
    }//GEN-LAST:event_relatorio3MouseExited

    private void novoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoMouseEntered
        novo.setBorder(BorderFactory.createLineBorder(Color.blue));
    }//GEN-LAST:event_novoMouseEntered

    private void novoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoMouseExited
        novo.setBorder(null);
    }//GEN-LAST:event_novoMouseExited

    private void txtnomealunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomealunoActionPerformed


    }//GEN-LAST:event_txtnomealunoActionPerformed

    private void txtnomealunoTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_txtnomealunoTextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomealunoTextValueChanged

    private void txtnomealunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomealunoKeyReleased

    }//GEN-LAST:event_txtnomealunoKeyReleased

    private void pesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarMouseClicked
        if (evt.getSource() == pesquisar) {
            try {
                String nomeAluno = txtnomealuno.getText().trim();

                if (!nomeAluno.isEmpty()) {
                    ParecerDAO parecerDAO = new ParecerDAO();
                    List<Integer> listaIdsPareceres = parecerDAO.listaIdsParecerPorInteressado(nomeAluno);

                    if (!listaIdsPareceres.isEmpty()) {
                        int numeroParecer = listaIdsPareceres.get(0);
                        ParecerModel parecerAcessar = new ParecerModel(numeroParecer);

                        new ParecerAcessar(parecerAcessar).setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum parecer encontrado para o interessado: " + nomeAluno);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, insira o nome do aluno para pesquisar.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AlterarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(MenuParecer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_pesquisarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuParecer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuParecer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuParecer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuParecer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new TelaInicio().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Documentos1;
    private javax.swing.JLabel Iniciarumnovodocumento;
    private javax.swing.ButtonGroup documentoSelecionado;
    private javax.swing.JLabel documentosRecentes;
    private javax.swing.JLabel excluirParecer;
    private javax.swing.JComboBox<String> filtroJanela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel janelaPrincipal;
    private javax.swing.JLabel logoProgestLateral;
    private javax.swing.JLabel logoProgestLateral1;
    private javax.swing.JLabel menuFicha;
    private javax.swing.JLabel menuParecer;
    private javax.swing.JLabel menuRelatorio;
    private javax.swing.JButton novo;
    private javax.swing.JLabel novolbl;
    private javax.swing.JPanel painelDocumentos;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JRadioButton parecerRadio;
    private javax.swing.JLabel pesquisar;
    private javax.swing.JLabel progestLogo;
    private javax.swing.JButton relatorio3;
    private javax.swing.JLabel tresPontosLateral;
    private javax.swing.JLabel tresPontosPrincipal;
    private java.awt.TextField txtnomealuno;
    // End of variables declaration//GEN-END:variables
 private void labelcolor(JLabel label) {
        label.setBackground(new java.awt.Color(186, 203, 212));//a cor do mouse
    }

    private void resetcolor(JLabel label) {
        label.setBackground(new java.awt.Color(186, 203, 212));// a propria cor dele
    }

    private void initComponets() {
    }

    private static class Configuracoes {

        public Configuracoes() {
        }

        private void setBackground(Color color) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    public void ocultarLateral() {

        if (visivel = true || x == 230) {
            painelLateral.setSize(230, 785);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 230; i >= 0; i--) {
                            Thread.sleep(1);
                            painelLateral.setSize(i, 785);
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x = 0;
            visivel = false;
        }

    }//fim metodo

    public void mostrarLateral() {

        if (visivel = false || y == 0) {
            painelLateral.setSize(0, 785);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= 230; i++) {
                            Thread.sleep(1);
                            painelLateral.setSize(i, 785);
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x = 230;
            visivel = true;
        }

    }// fim metodo

}// fim classe 
