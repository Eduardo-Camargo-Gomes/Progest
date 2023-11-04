/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import model.*;
import controller.*;
import model.DAO.*;
import java.awt.Color;
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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {

    String tipoOrdenacao = null;
    //Todos relatórios, Já concluídos   
    RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
    FichaAtendimentoDAO fichaDAO = new FichaAtendimentoDAO();
    ParecerDAO parecerDAO = new ParecerDAO();
    private String labelClicado = "menuRelatorio";
    int x = 230;

    Map<String, Boolean> selecaoJlabel = new HashMap<>();
    private boolean labelsCriados = false;
    private boolean visivel = false;

    List<JLabel> listaJlabel = new ArrayList<>();

    public Menu() throws SQLException {

        initComponents();
        painelDocumentos.removeAll();
        mostrarRelatorios("Todos documentos");

    }// fim construtor 

    public void mostrarRelatorios(String tipoOrdenacao) throws SQLException {

        painelDocumentos.removeAll();
        painelDocumentos.revalidate();
        painelDocumentos.repaint();

        List<Integer> listaIdsRelatorios = relatorioDAO.listaIdsRelatorios(tipoOrdenacao);

        Map<Integer, JLabel> mapaRelatorios = new HashMap<>();
        int x = 25;

        ImageIcon imagemRelatorio = new ImageIcon(getClass().getResource("Cap.relatorio1.jpg"));

        for (int i = 0; i < listaIdsRelatorios.size(); i++) {

            JLabel miniaturaRelatorios = new JLabel(imagemRelatorio);
            JLabel especRelatorio = new JLabel("Relatório N° " + listaIdsRelatorios.get(i));

            // define a posicao dos jlabels dos relatorios
            miniaturaRelatorios.setBounds(x, 25, 138, 185);
            miniaturaRelatorios.setBorder(BorderFactory.createLineBorder(Color.black));

            //define a posicao dos jlabels de legenda dos relatorios
            especRelatorio.setBounds(x + 23, 197, 100, 50);
            miniaturaRelatorios.putClientProperty("numeroRelatorio", listaIdsRelatorios.get(i));
            miniaturaRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            especRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            x += 165;

            miniaturaRelatorios.setVisible(true);
            especRelatorio.setVisible(true);
            painelDocumentos.add(especRelatorio);
            painelDocumentos.add(miniaturaRelatorios);

            miniaturaRelatorios.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {

                    JLabel relatorioClicado = (JLabel) e.getSource();

                    Object idObj = relatorioClicado.getClientProperty("numeroRelatorio");

                    final int id = (int) idObj;

                    RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
                    RelatorioAtendimentoModel relatorioAcessar = new RelatorioAtendimentoModel(id);
                    try {
                        new RelatorioAtendimentoAcessar(relatorioAcessar).setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }// fim clicked

                @Override
                public void mouseEntered(MouseEvent e) {

                    miniaturaRelatorios.setBorder(BorderFactory.createLineBorder(Color.blue));
                    revalidate();
                    repaint();

                }//fim metodo

                @Override
                public void mouseExited(MouseEvent e) {

                    miniaturaRelatorios.setBorder(BorderFactory.createLineBorder(Color.black));
                    revalidate();
                    repaint();

                }//fim metodo

            });

        }// fim for
        painelDocumentos.revalidate();
        painelDocumentos.repaint();
    }//fim metodo

    public void mostrarFichas(String tipoOrdenacao) throws SQLException {
        painelDocumentos.removeAll();
        painelDocumentos.revalidate();
        painelDocumentos.repaint();

        List<Integer> listaIdsFichas = fichaDAO.listaIdsFichas(tipoOrdenacao);

        Map<Integer, JLabel> mapaFichas = new HashMap<>();
        int x = 25;

        ImageIcon imagemFicha = new ImageIcon(getClass().getResource("ficha de atendimento.jpg"));

        for (int i = 0; i < listaIdsFichas.size(); i++) {

            JLabel miniaturaFichas = new JLabel(imagemFicha);
            JLabel especFicha = new JLabel("Ficha N° " + listaIdsFichas.get(i));

            // define a posicao dos jlabels dos relatorios
            miniaturaFichas.setBounds(x, 25, 109, 180);
            miniaturaFichas.setBorder(BorderFactory.createLineBorder(Color.black));

            //define a posicao dos jlabels de legenda dos relatorios
            especFicha.setBounds(x + 23, 197, 100, 50);
            miniaturaFichas.putClientProperty("numeroFicha", listaIdsFichas.get(i));
            miniaturaFichas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            especFicha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            x += 165;

            miniaturaFichas.setVisible(true);
            especFicha.setVisible(true);
            painelDocumentos.add(especFicha);
            painelDocumentos.add(miniaturaFichas);

            miniaturaFichas.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {

                    JLabel fichaClicado = (JLabel) e.getSource();

                    Object idObj = fichaClicado.getClientProperty("numeroFicha");

                    final int id = (int) idObj;

                    FichaAtendimentoDAO fichaDAO = new FichaAtendimentoDAO();
                    FichaAtendimentoModel fichaAcessar = new FichaAtendimentoModel(id);
                    try {
                        new FichaDeAtendimentoAcessar(fichaAcessar).setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }// fim mous clicked

                @Override
                public void mouseEntered(MouseEvent e) {

                    miniaturaFichas.setBorder(BorderFactory.createLineBorder(Color.blue));
                    revalidate();
                    repaint();

                }//fim metodo

                @Override
                public void mouseExited(MouseEvent e) {

                    miniaturaFichas.setBorder(BorderFactory.createLineBorder(Color.black));
                    revalidate();
                    repaint();

                }//fim metodo
            });

        }// fim for
        painelDocumentos.revalidate();
        painelDocumentos.repaint();
    }//fim metodo

    public void mostrarParecer(String tipoOrdenacao) throws SQLException {

        painelDocumentos.removeAll();
        painelDocumentos.revalidate();
        painelDocumentos.repaint();

        List<Integer> listaIdsParecer = parecerDAO.listaIdsParecer(tipoOrdenacao);

        Map<Integer, JLabel> mapaParecer = new HashMap<>();
        int x = 25;

        ImageIcon imagemParecer = new ImageIcon(getClass().getResource("miniaturaParecer.png"));

        for (int i = 0; i < listaIdsParecer.size(); i++) {

            JLabel miniaturaParecer = new JLabel(imagemParecer);
            JLabel especParecer = new JLabel("Parecer N° " + listaIdsParecer.get(i));

            // define a posicao dos jlabels dos relatorios
            miniaturaParecer.setBounds(x, 25, 142, 183);
            miniaturaParecer.setBorder(BorderFactory.createLineBorder(Color.black));

            //define a posicao dos jlabels de legenda dos relatorios
            especParecer.setBounds(x + 23, 197, 100, 50);
            miniaturaParecer.putClientProperty("numeroParecer", listaIdsParecer.get(i));
            miniaturaParecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            especParecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            x += 165;

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
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
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
        painelDocumentos.revalidate();
        painelDocumentos.repaint();
    }//fim metodo

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        documentoSelecionado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelLateral = new javax.swing.JPanel();
        tresPontosLateral = new javax.swing.JLabel();
        logoProgestLateral = new javax.swing.JLabel();
        Documentos1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        configlbl = new javax.swing.JLabel();
        ajudalbl = new javax.swing.JLabel();
        menuParecer = new javax.swing.JLabel();
        menuFicha = new javax.swing.JLabel();
        menuRelatorio = new javax.swing.JLabel();
        excluirParecer = new javax.swing.JLabel();
        excluirFicha = new javax.swing.JLabel();
        excluirRelatorio = new javax.swing.JLabel();
        janelaPrincipal = new javax.swing.JPanel();
        Iniciarumnovodocumento = new javax.swing.JLabel();
        novolbl = new javax.swing.JLabel();
        relatorio1 = new javax.swing.JButton();
        relatorio3 = new javax.swing.JButton();
        novo = new javax.swing.JButton();
        relatorio2 = new javax.swing.JButton();
        fichaRadio = new javax.swing.JRadioButton();
        parecerRadio = new javax.swing.JRadioButton();
        relatorioRadio = new javax.swing.JRadioButton();
        painelDocumentos = new javax.swing.JPanel();
        filtroJanela = new javax.swing.JComboBox<>();
        logoProgest = new javax.swing.JLabel();
        progestLogo = new javax.swing.JLabel();
        documentosRecentes = new javax.swing.JLabel();
        tresPontosPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1535, 785));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setText("Filtrar por...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 80, 20));

        painelLateral.setBackground(new java.awt.Color(210, 225, 233));
        painelLateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        painelLateral.setMinimumSize(new java.awt.Dimension(210, 785));
        painelLateral.setPreferredSize(new java.awt.Dimension(137, 182));
        painelLateral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelLateralMouseClicked(evt);
            }
        });
        painelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tresPontosLateral.setBackground(new java.awt.Color(210, 225, 233));
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
        logoProgestLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/contrato (8).png"))); // NOI18N
        painelLateral.add(logoProgestLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 10, 40, 40));

        Documentos1.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        Documentos1.setForeground(new java.awt.Color(102, 102, 102));
        Documentos1.setText("Progest");
        painelLateral.add(Documentos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 10, 131, 40));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        painelLateral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 280, 10));

        configlbl.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        configlbl.setForeground(new java.awt.Color(51, 51, 51));
        configlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        configlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/configuracao (5).png"))); // NOI18N
        configlbl.setText("  Configurações");
        configlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelLateral.add(configlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        ajudalbl.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ajudalbl.setForeground(new java.awt.Color(51, 51, 51));
        ajudalbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ajudalbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ajuda (1).png"))); // NOI18N
        ajudalbl.setText(" Ajuda e comentários");
        ajudalbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ajudalbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajudalblMouseClicked(evt);
            }
        });
        painelLateral.add(ajudalbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 185, -1));

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
        painelLateral.add(menuParecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 30));

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
        painelLateral.add(menuFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 30));

        menuRelatorio.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        menuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/docsTs (1).png"))); // NOI18N
        menuRelatorio.setText(" Relatório");
        menuRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRelatorioMouseClicked(evt);
            }
        });
        painelLateral.add(menuRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 160, 30));

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

        excluirFicha.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        excluirFicha.setForeground(new java.awt.Color(51, 51, 51));
        excluirFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lixeira.png"))); // NOI18N
        excluirFicha.setText("  Excluir ficha ");
        excluirFicha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluirFicha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirFichaMouseClicked(evt);
            }
        });
        painelLateral.add(excluirFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        excluirRelatorio.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        excluirRelatorio.setForeground(new java.awt.Color(51, 51, 51));
        excluirRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lixeira.png"))); // NOI18N
        excluirRelatorio.setText("  Excluir relatório ");
        excluirRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluirRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirRelatorioMouseClicked(evt);
            }
        });
        painelLateral.add(excluirRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jPanel1.add(painelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 785));

        janelaPrincipal.setBackground(new java.awt.Color(210, 225, 233));
        janelaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Iniciarumnovodocumento.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        Iniciarumnovodocumento.setForeground(new java.awt.Color(51, 51, 51));
        Iniciarumnovodocumento.setText("Iniciar um novo documento");
        janelaPrincipal.add(Iniciarumnovodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 18, -1, -1));

        novolbl.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        novolbl.setForeground(new java.awt.Color(51, 51, 51));
        novolbl.setText("NOVO");
        janelaPrincipal.add(novolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 50, 12));

        relatorio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cap.relatorio1 (1).jpg"))); // NOI18N
        relatorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorio1ActionPerformed(evt);
            }
        });
        janelaPrincipal.add(relatorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 150, 185));

        relatorio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/miniaturaParecer.png"))); // NOI18N
        relatorio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorio3ActionPerformed(evt);
            }
        });
        janelaPrincipal.add(relatorio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 55, 160, 190));

        novo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mais (1).png"))); // NOI18N
        novo.setOpaque(true);
        novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novoMouseClicked(evt);
            }
        });
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });
        janelaPrincipal.add(novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 150, 185));

        relatorio2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        relatorio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ficha de atendimento.jpg"))); // NOI18N
        relatorio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorio2ActionPerformed(evt);
            }
        });
        janelaPrincipal.add(relatorio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 150, 185));

        fichaRadio.setBackground(new java.awt.Color(210, 225, 233));
        documentoSelecionado.add(fichaRadio);
        fichaRadio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fichaRadio.setText("Ficha atendimento");
        fichaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichaRadioActionPerformed(evt);
            }
        });
        janelaPrincipal.add(fichaRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 150, 16));

        parecerRadio.setBackground(new java.awt.Color(210, 225, 233));
        documentoSelecionado.add(parecerRadio);
        parecerRadio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        parecerRadio.setText("Parecer");
        parecerRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parecerRadioActionPerformed(evt);
            }
        });
        janelaPrincipal.add(parecerRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 99, 16));

        relatorioRadio.setBackground(new java.awt.Color(210, 225, 233));
        documentoSelecionado.add(relatorioRadio);
        relatorioRadio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        relatorioRadio.setText("Relatório ");
        relatorioRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioRadioActionPerformed(evt);
            }
        });
        janelaPrincipal.add(relatorioRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 99, 16));

        jPanel1.add(janelaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 1535, 316));

        painelDocumentos.setLayout(null);
        jPanel1.add(painelDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 1350, 340));

        filtroJanela.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        filtroJanela.setForeground(new java.awt.Color(51, 51, 51));
        filtroJanela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos documentos", "Já concluídos", "Últimos acessados", "Última modificação", " " }));
        filtroJanela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroJanelaActionPerformed(evt);
            }
        });
        jPanel1.add(filtroJanela, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 398, -1, -1));

        logoProgest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoProgest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/contrato (8).png"))); // NOI18N
        jPanel1.add(logoProgest, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 40, 40));

        progestLogo.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        progestLogo.setForeground(new java.awt.Color(102, 102, 102));
        progestLogo.setText("Progest");
        jPanel1.add(progestLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 10, 131, 40));

        documentosRecentes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        documentosRecentes.setForeground(new java.awt.Color(51, 51, 51));
        documentosRecentes.setText("Documentos recentes");
        jPanel1.add(documentosRecentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 408, 178, 20));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void relatorio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relatorio3ActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed

        if (relatorioRadio.isSelected()) {
            if (evt.getSource() == novo) {
                try {
                    new RelatorioAtendimentoNovo().setVisible(true);

                } catch (SQLException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }// fim if de dentro
        }// fim if
        else if (fichaRadio.isSelected()) {
            if (evt.getSource() == novo) {

                try {
                    new FichaDeAtendimentoNova().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }// fim if

        }// fim else if 
        else if (parecerRadio.isSelected()) {
            if (evt.getSource() == novo) {
                try {
                    new ParecerNovo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }// fim catch
            }// fim fif
        }// fim else ifG

    }//GEN-LAST:event_novoActionPerformed

    private void relatorio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relatorio2ActionPerformed


    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void novoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_novoMouseClicked

    private void fichaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichaRadioActionPerformed

    }//GEN-LAST:event_fichaRadioActionPerformed

    private void relatorioRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioRadioActionPerformed

    }//GEN-LAST:event_relatorioRadioActionPerformed

    private void filtroJanelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroJanelaActionPerformed

        tipoOrdenacao = (String) filtroJanela.getSelectedItem();

        try {
            mostrarRelatorios(tipoOrdenacao);
            revalidate();
            repaint();

        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (labelClicado.equals("menuParecer")) {
            try {
                mostrarParecer(tipoOrdenacao);
                revalidate();
                repaint();

            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (labelClicado.equals("menuFicha")) {
            try {
                mostrarFichas(tipoOrdenacao);
                revalidate();
                repaint();

            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_filtroJanelaActionPerformed

    private void relatorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relatorio1ActionPerformed

    private void parecerRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parecerRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parecerRadioActionPerformed

    private void painelLateralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelLateralMouseClicked

    }//GEN-LAST:event_painelLateralMouseClicked

    private void ajudalblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajudalblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ajudalblMouseClicked

    private void tresPontosLateralMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresPontosLateralMouseExited
        tresPontosLateral.setBackground(new java.awt.Color(210, 225, 233));
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

    private void excluirFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirFichaMouseClicked
        new ExcluirFicha().setVisible(true);
    }//GEN-LAST:event_excluirFichaMouseClicked

    private void excluirRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirRelatorioMouseClicked
        new ExcluirRelatorio().setVisible(true);
    }//GEN-LAST:event_excluirRelatorioMouseClicked

    private void menuParecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuParecerMouseClicked
        try {

            mostrarParecer("Todos documentos");
            labelClicado = "menuParecer";
            filtroJanela.setSelectedItem("Todos documentos");
            revalidate();
            repaint();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuParecerMouseClicked

    private void menuFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFichaMouseClicked
        try {
            mostrarFichas("Todos documentos");
            labelClicado = "menuFicha";
            filtroJanela.setSelectedItem("Todos documentos");
            revalidate();
            repaint();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuFichaMouseClicked

    private void menuRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRelatorioMouseClicked
        try {
            mostrarRelatorios("Todos documentos");
            labelClicado = "menuRelatorio";
            filtroJanela.setSelectedItem("Todos documentos");
            revalidate();
            repaint();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuRelatorioMouseClicked

    private void tresPontosPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresPontosPrincipalMouseClicked

        if (visivel == false) {

            mostrarLateral();

        }
    }//GEN-LAST:event_tresPontosPrincipalMouseClicked

    private void tresPontosPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresPontosPrincipalMouseEntered
      
    }//GEN-LAST:event_tresPontosPrincipalMouseEntered

    private void tresPontosPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresPontosPrincipalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tresPontosPrincipalMouseExited

    private void excluirParecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirParecerMouseClicked
            new ExcluirParecer().setVisible(true);
    }//GEN-LAST:event_excluirParecerMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel ajudalbl;
    private javax.swing.JLabel configlbl;
    private javax.swing.ButtonGroup documentoSelecionado;
    private javax.swing.JLabel documentosRecentes;
    private javax.swing.JLabel excluirFicha;
    private javax.swing.JLabel excluirParecer;
    private javax.swing.JLabel excluirRelatorio;
    private javax.swing.JRadioButton fichaRadio;
    private javax.swing.JComboBox<String> filtroJanela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel janelaPrincipal;
    private javax.swing.JLabel logoProgest;
    private javax.swing.JLabel logoProgestLateral;
    private javax.swing.JLabel menuFicha;
    private javax.swing.JLabel menuParecer;
    private javax.swing.JLabel menuRelatorio;
    private javax.swing.JButton novo;
    private javax.swing.JLabel novolbl;
    private javax.swing.JPanel painelDocumentos;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JRadioButton parecerRadio;
    private javax.swing.JLabel progestLogo;
    private javax.swing.JButton relatorio1;
    private javax.swing.JButton relatorio2;
    private javax.swing.JButton relatorio3;
    private javax.swing.JRadioButton relatorioRadio;
    private javax.swing.JLabel tresPontosLateral;
    private javax.swing.JLabel tresPontosPrincipal;
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

    public void adicionarRelatorio(int numeroRelatorio) throws SQLException {

        ImageIcon imagemRelatorio = new ImageIcon(getClass().getResource("Cap.relatorio1.jpg"));

        JLabel miniaturaRelatorios = new JLabel(imagemRelatorio);

        miniaturaRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        miniaturaRelatorios.setVisible(true);

        painelDocumentos.add(miniaturaRelatorios);

        revalidate();
        repaint();

    }// fim metodo

    public void ocultarLateral() {

        if (visivel = true) {
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

        if (visivel = false || x == 0) {
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

            visivel = true;
        }

    }// fim metodo

}// fim classe 
