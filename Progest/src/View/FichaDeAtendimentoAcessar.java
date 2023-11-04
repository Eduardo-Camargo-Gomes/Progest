/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.FichaAtendimentoController;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import model.DAO.FichaAtendimentoDAO;
import model.DAO.RelatorioAtendimentoDAO;
import model.FichaAtendimentoModel;
import model.RelatorioAtendimentoModel;

/**
 * 
 * 
 *
 * @author vitor
 */
public class FichaDeAtendimentoAcessar extends javax.swing.JFrame {
    
    private FichaAtendimentoModel fichaModel;
    private FichaAtendimentoDAO fichaDao = new FichaAtendimentoDAO();
    private String estadoCivil;
    private String moraCom;
    private String tipoEscola;
    private boolean concluido = false;
    
    
    
    
     public void mostrarIdFicha() throws SQLException{
        
         FichaAtendimentoDAO fichaDAO = new FichaAtendimentoDAO();
        FichaAtendimentoModel fichaModel = new FichaAtendimentoModel();

         fichaModel = fichaDAO.mostrarNumeroFicha();
         
        
          
          campoId.setText(String.valueOf(fichaModel.getNumeroFicha() + 1));
     }// fim metodo

    public String getTipoEscola() {
        return tipoEscola;
    }

    public void setTipoEscola(String tipoEscola) {
        this.tipoEscola = tipoEscola;
    }
    
    

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getMoraCom() {
        return moraCom;
    }

    public void setMoraCom(String moraCom) {
        this.moraCom = moraCom;
    }
    
    

    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
     SimpleDateFormat formatoBanco = new SimpleDateFormat("yyyy-MM-dd");
   
     
    public FichaDeAtendimentoAcessar() throws SQLException {
        initComponents();
       campoId.setEditable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         
        
    }// fim metodo
    
    public FichaDeAtendimentoAcessar(FichaAtendimentoModel fichaModel) throws SQLException, ParseException {
        this.fichaModel = fichaModel;
          initComponents();
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
 
        fichaModel = fichaDao.acessarFicha(fichaModel.getNumeroFicha());
       
       Date data = formatoBanco.parse(String.valueOf(fichaModel.getDataNascimento()));
       
       String datadeNascimento = formatoData.format(data);
       
        
        campoId.setText(String.valueOf(fichaModel.getNumeroFicha()));
        campoNome.setText(fichaModel.getNome());
        dataNascimento.setText(String.valueOf(datadeNascimento));
        alunoCelular.setText(fichaModel.getTelefone());
        RG.setText(fichaModel.getRg());
        endereco.setText(fichaModel.getEndereco());
        bairro.setText(fichaModel.getBairro());
        nomePai.setText(fichaModel.getNomePai());
         nomeMae.setText(fichaModel.getNomeMae());
        emailPai.setText(fichaModel.getEmailPai());
         emailMae.setText(fichaModel.getEmailMae());
         
         
         
         if(fichaModel.getEstadoCivil().equals("Casados") || fichaModel.getMoraCom().equals("Ambos os pais")){
             casados.setSelected(true);
         }// fim if
         
         else if(fichaModel.getEstadoCivil().equals("Separados")){
             separados.setSelected(true);
         }// fim else 
         
         else if(fichaModel.getEstadoCivil().equals("Outros") || fichaModel.getMoraCom().equals("Outros")){
             outrosEstadoCivil.setSelected(true);
         }// fim else 
         
        
         
         if(fichaModel.getEstadoCivil().equals("Separados") || fichaModel.getEstadoCivil().equals("Outros")){
            if(fichaModel.getMoraCom().equals("Pai")){
                pai.setSelected(true);
            }// fim if de dentro
            else if (fichaModel.getMoraCom().equals("Mae")){
                mae.setSelected(true);
            }
            
            else if (fichaModel.getMoraCom().equals("Outros")){
              outrosMoraCom.setSelected(true);
            }// fim else if 
            
            else if(fichaModel.getMoraCom().equals("Avos")){
                avos.setSelected(true);
            }
            
         }// fim if
         
         celularPai.setText(fichaModel.getTelefonePai());
            celularMae.setText(fichaModel.getTelefoneMae());
                escolaConclusao.setText(fichaModel.getEscolaConcluida());
                
                if(fichaModel.getTipoEscola().equals("Pública")){
                    publica.setSelected(true);
                }// fim if
                
                else if (fichaModel.getTipoEscola().equals("Particular")){
                    particular.setSelected(true);
                }// fim metodo
                
                  if(fichaModel.getConcluido() == true){
           checkConcluido.setSelected(true);
       }// fim if 
       
       else{
           checkConcluido.setSelected(false);
       }// fim else  
       
                
               String anoQueConcluiu = String.valueOf(fichaModel.getAnoConclusao());
       
               anoDeConclusao.setText(anoQueConcluiu);
             campoId.setEditable(false);
      
       
        
    }// fim metodo
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotaoEstadoCivil = new javax.swing.ButtonGroup();
        grupoBotaoMoraCom = new javax.swing.ButtonGroup();
        grupoBotaoTipoEscola = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        SALVAR = new javax.swing.JButton();
        VOLTAR = new javax.swing.JButton();
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
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        alunoCelular = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        dataNascimento = new javax.swing.JTextField();
        RG = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        nomePai = new javax.swing.JTextField();
        nomeMae = new javax.swing.JTextField();
        emailMae = new javax.swing.JTextField();
        emailPai = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        celularOutros = new javax.swing.JTextField();
        celularPai = new javax.swing.JTextField();
        celularMae = new javax.swing.JTextField();
        celularAvos = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        escolaConclusao = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        anoDeConclusao = new javax.swing.JTextField();
        publica = new javax.swing.JRadioButton();
        particular = new javax.swing.JRadioButton();
        outrosEstadoCivil = new javax.swing.JRadioButton();
        casados = new javax.swing.JRadioButton();
        separados = new javax.swing.JRadioButton();
        pai = new javax.swing.JRadioButton();
        mae = new javax.swing.JRadioButton();
        avos = new javax.swing.JRadioButton();
        outrosMoraCom = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        checkConcluido = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 760, 10));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, 240));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 567, 770, -1));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 330, -1, 240));

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 330, -1, 240));

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 330, -1, 240));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 90, 30));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 90, 30));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 90, 30));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, 30));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 90, 30));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 90, 30));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 90, 30));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 90, 30));
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 90, 30));
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 90, 30));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 90, 30));
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 90, 30));
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 90, 30));
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 90, 30));
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 100, 30));
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 100, 30));
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 100, 30));
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 100, 30));
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 100, 30));
        jPanel1.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 100, 30));
        jPanel1.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 100, 30));

        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 100, 30));
        jPanel1.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 100, 30));
        jPanel1.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 100, 30));
        jPanel1.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 100, 30));
        jPanel1.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 100, 30));
        jPanel1.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 100, 30));
        jPanel1.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 100, 30));
        jPanel1.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 180, 30));
        jPanel1.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 180, 30));
        jPanel1.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 180, 30));
        jPanel1.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 180, 30));
        jPanel1.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 180, 30));
        jPanel1.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 180, 30));
        jPanel1.add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 180, 30));

        SALVAR.setText("SALVAR");
        SALVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALVARActionPerformed(evt);
            }
        });
        jPanel1.add(SALVAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        VOLTAR.setText("VOLTAR");
        VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARActionPerformed(evt);
            }
        });
        jPanel1.add(VOLTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel1.setText("SECRETARIA DE EDUCAÇÃO PROFISSIONAL E TECNOLOGIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel2.setText("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIAS E TECNOLOGIA DO AMAZONAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel3.setText("CAMPUS MANAUS CENTRO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel4.setText("DIRETORIA DE ENSINO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        jLabel5.setText("DAIC");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setText("FICHA INFORMATIVA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 290, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setText("CURSO TÉCNICO DE NÍVEL MÉDIO INTEGRADO EM INFORMÁTICA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("I. DADOS ACADÊMICOS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/MinisterioDaEducacao (3).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Ifam (2).png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 100, 150));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 560, 240));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel12.setText("FOTO 3X4");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 180, 240));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setText("     ANO          SÉRIE         TURMA         TURNO           OBSERVAÇÃO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 560, 30));

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel14.setText("II. DADOS ESCOLARES");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1230, -1, -1));

        jLabel15.setText("NOME :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, 30));

        jLabel16.setText("NASCIMENTO :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, 30));

        jLabel17.setText("RG :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, -1, 30));

        jLabel18.setText("ENDEREÇO :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, -1, 30));

        jLabel19.setText("BAIRRO :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 770, -1, 30));

        jLabel20.setText("NOME DO PAI :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 810, -1, 30));

        jLabel21.setText("NOME DA MÃE :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 850, -1, 30));

        jLabel22.setText("EMAIL DO PAI :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 890, -1, 30));

        jLabel23.setText("EMAIL DA MÃE :");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 930, -1, 30));

        jLabel24.setText("ESTADO CIVIL DOS PAIS :");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 970, -1, 30));

        alunoCelular.setBorder(null);
        jPanel1.add(alunoCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 250, 30));

        campoNome.setBorder(null);
        jPanel1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 700, 30));

        dataNascimento.setBorder(null);
        dataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(dataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 650, 260, 30));

        RG.setBorder(null);
        jPanel1.add(RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 330, 30));

        endereco.setBorder(null);
        jPanel1.add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 730, 680, 30));

        bairro.setBorder(null);
        jPanel1.add(bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 770, 690, 30));

        nomePai.setBorder(null);
        jPanel1.add(nomePai, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 810, 660, 30));

        nomeMae.setBorder(null);
        jPanel1.add(nomeMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 850, 650, 30));

        emailMae.setBorder(null);
        jPanel1.add(emailMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 890, 660, 30));

        emailPai.setBorder(null);
        jPanel1.add(emailPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 930, 660, 30));

        jLabel26.setText("EM CASO DE PAIS SEPARADOS, VOCÊ MORA COM :");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1010, -1, -1));

        jLabel27.setText("FONE/CELULAR :");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1040, -1, -1));

        jLabel28.setText("OUTROS :");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1190, -1, 30));

        jLabel29.setText("PAI :");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1060, -1, 30));

        jLabel30.setText("MÃE :");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1100, -1, 30));

        jLabel31.setText("AVÓS :");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1150, -1, 30));

        celularOutros.setBorder(null);
        jPanel1.add(celularOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1190, 310, 30));

        celularPai.setBorder(null);
        jPanel1.add(celularPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1060, 340, 30));

        celularMae.setBorder(null);
        jPanel1.add(celularMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1100, 330, 30));

        celularAvos.setBorder(null);
        jPanel1.add(celularAvos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1150, 320, 30));

        jLabel32.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel32.setText("II. DADOS PESSOAIS");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        jLabel33.setText("ESCOLA EM QUE VOCÊ CONCLUIU O ENSINO FUNDAMENTAL :");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1260, 340, -1));

        escolaConclusao.setBorder(null);
        jPanel1.add(escolaConclusao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1280, 750, 30));

        jLabel34.setText("ANO DE CONCLUSÃO :");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 1320, -1, 30));

        anoDeConclusao.setBorder(null);
        anoDeConclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoDeConclusaoActionPerformed(evt);
            }
        });
        jPanel1.add(anoDeConclusao, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1320, 230, 30));

        grupoBotaoTipoEscola.add(publica);
        publica.setText("PÚBLICA");
        publica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicaActionPerformed(evt);
            }
        });
        jPanel1.add(publica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1330, -1, -1));

        grupoBotaoTipoEscola.add(particular);
        particular.setText("PARTICULAR");
        jPanel1.add(particular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1330, -1, -1));

        grupoBotaoEstadoCivil.add(outrosEstadoCivil);
        outrosEstadoCivil.setText("OUTROS");
        outrosEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outrosEstadoCivilActionPerformed(evt);
            }
        });
        jPanel1.add(outrosEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 980, -1, -1));

        grupoBotaoEstadoCivil.add(casados);
        casados.setText("CASADOS");
        casados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casadosActionPerformed(evt);
            }
        });
        jPanel1.add(casados, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 980, -1, -1));

        grupoBotaoEstadoCivil.add(separados);
        separados.setText("SEPARADOS");
        jPanel1.add(separados, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 980, -1, -1));

        grupoBotaoMoraCom.add(pai);
        pai.setText("PAI");
        jPanel1.add(pai, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1010, -1, -1));

        grupoBotaoMoraCom.add(mae);
        mae.setText("MÃE");
        mae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maeActionPerformed(evt);
            }
        });
        jPanel1.add(mae, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1010, -1, -1));

        grupoBotaoMoraCom.add(avos);
        avos.setText("AVÓS");
        avos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avosActionPerformed(evt);
            }
        });
        jPanel1.add(avos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1010, -1, -1));

        grupoBotaoMoraCom.add(outrosMoraCom);
        outrosMoraCom.setText("OUTROS");
        outrosMoraCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outrosMoraComActionPerformed(evt);
            }
        });
        jPanel1.add(outrosMoraCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 1010, -1, -1));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel35.setText("MINISTÉRIO DE EDUCAÇÃO");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 643, 700, -1));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 680, 270, -1));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 680, 260, -1));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 720, 330, -1));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 760, 680, -1));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 800, 690, -1));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 841, 660, -1));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 884, 650, -1));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 920, 660, -1));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 964, 660, -1));
        jPanel1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1090, 340, -1));
        jPanel1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1137, 330, -1));
        jPanel1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1180, 320, 10));
        jPanel1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1220, 310, 10));
        jPanel1.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1314, 750, -1));
        jPanel1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1350, 230, -1));

        jLabel36.setText("CELULAR DO ALUNO :");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, 130, 30));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Ficha N°:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        campoId.setEditable(false);
        campoId.setBackground(new java.awt.Color(255, 255, 255));
        campoId.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 50, 30));

        checkConcluido.setText("Marcar como concluído");
        checkConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkConcluidoActionPerformed(evt);
            }
        });
        jPanel1.add(checkConcluido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1376, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void publicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publicaActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void anoDeConclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoDeConclusaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoDeConclusaoActionPerformed

    private void dataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascimentoActionPerformed

    private void VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARActionPerformed
        if (evt.getSource()==VOLTAR){
           this.dispose();
        }
    }//GEN-LAST:event_VOLTARActionPerformed

    private void maeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maeActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void SALVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALVARActionPerformed
     if(evt.getSource() == SALVAR){
         
         try{
      
         int anoQueConcluiu = Integer.parseInt(anoDeConclusao.getText());
         
         if(publica.isSelected()){
             setTipoEscola("Publica");
         }
         else if (particular.isSelected()){
            setTipoEscola("Particular");
         }// fim else if
             
         if(casados.isSelected()){
            setEstadoCivil("Casados");
            setMoraCom("Ambos os pais");
         }// fim if 
         
         else if(separados.isSelected()){
           setEstadoCivil("Separados");
             
         }// fim else 
         
         else if(outrosEstadoCivil.isSelected()){
            setEstadoCivil("Outros");
            setMoraCom("Outros");
             
         }//fim else if
         
         
         if(getEstadoCivil().equals("Separados") || getEstadoCivil().equals("Outros")){
               
             
             if(pai.isSelected()){
                 setMoraCom("Pai");
             }
             else if (mae.isSelected()){
                 setMoraCom("Mae");
             }
             else if (avos.isSelected()){
                 setMoraCom("Avos");
                 
             }
             else if (outrosMoraCom.isSelected()){
                 setMoraCom("Outros");
             }// im else 
            
         }// fim if de fora
         
           if(checkConcluido.isSelected()){
              concluido = true;
         }// fim if 
   
         else {
             concluido = false ;
         }// fim else 


             Date dataNasc = null;
               
             dataNasc = formatoData.parse(dataNascimento.getText());
         
              formatoData.format(dataNasc);
        
         
           int numeroFicha = Integer.parseInt(campoId.getText());
          
          FichaAtendimentoDAO fichaDAO = new  FichaAtendimentoDAO();
          FichaAtendimentoController controlador = new FichaAtendimentoController();
          FichaAtendimentoModel fichaASalvar = new FichaAtendimentoModel();
         
          
          boolean sucesso = controlador.alterarFicha(campoNome.getText(), dataNasc,
                  alunoCelular.getText(), RG.getText(),
                  endereco.getText(), bairro.getText(), nomePai.getText(),nomeMae.getText(),
                  emailPai.getText(), emailMae.getText() , getEstadoCivil(), getMoraCom(),
                  celularPai.getText(), celularMae.getText(),
                  escolaConclusao.getText(), getTipoEscola(), anoQueConcluiu ,
                  numeroFicha, concluido);
          
          if(sucesso == true){
              this.dispose();
          }// fim if
          
          
          } catch (ParseException ex) {
             Logger.getLogger(FichaDeAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
         }
          
      }// fim
    }//GEN-LAST:event_SALVARActionPerformed

    private void casadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casadosActionPerformed

    private void outrosEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outrosEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outrosEstadoCivilActionPerformed

    private void outrosMoraComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outrosMoraComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outrosMoraComActionPerformed

    private void avosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avosActionPerformed

    private void checkConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkConcluidoActionPerformed

    }//GEN-LAST:event_checkConcluidoActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(FichaDeAtendimentoAcessar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichaDeAtendimentoAcessar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichaDeAtendimentoAcessar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichaDeAtendimentoAcessar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FichaDeAtendimentoAcessar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FichaDeAtendimentoAcessar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RG;
    private javax.swing.JButton SALVAR;
    private javax.swing.JButton VOLTAR;
    private javax.swing.JTextField alunoCelular;
    private javax.swing.JTextField anoDeConclusao;
    private javax.swing.JRadioButton avos;
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JRadioButton casados;
    private javax.swing.JTextField celularAvos;
    private javax.swing.JTextField celularMae;
    private javax.swing.JTextField celularOutros;
    private javax.swing.JTextField celularPai;
    private javax.swing.JCheckBox checkConcluido;
    private javax.swing.JTextField dataNascimento;
    private javax.swing.JTextField emailMae;
    private javax.swing.JTextField emailPai;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField escolaConclusao;
    private javax.swing.ButtonGroup grupoBotaoEstadoCivil;
    private javax.swing.ButtonGroup grupoBotaoMoraCom;
    private javax.swing.ButtonGroup grupoBotaoTipoEscola;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton mae;
    private javax.swing.JTextField nomeMae;
    private javax.swing.JTextField nomePai;
    private javax.swing.JRadioButton outrosEstadoCivil;
    private javax.swing.JRadioButton outrosMoraCom;
    private javax.swing.JRadioButton pai;
    private javax.swing.JRadioButton particular;
    private javax.swing.JRadioButton publica;
    private javax.swing.JRadioButton separados;
    // End of variables declaration//GEN-END:variables
}
