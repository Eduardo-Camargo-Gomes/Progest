package controller;
import View.AlterarRelatorio;
import View.Menu;
import View.RelatorioAtendimentoAcessar;
import model.*;
import controller.*;
import java.sql.Time;
import java.util.Date;
import javax.swing.JOptionPane;
import model.DAO.RelatorioAtendimentoDAO;
import View.RelatorioAtendimentoNovo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RelatorioAtendimentoController {
    
   
    RelatorioAtendimentoModel model = new RelatorioAtendimentoModel();
     RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
         
    public boolean verificarSeExisteRelatorio(int numeroRelatorio) throws SQLException{
        
        RelatorioAtendimentoModel relatorio = new  RelatorioAtendimentoModel(numeroRelatorio);
        RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
        
  
         boolean existeRelatorio = relatorioDAO.existeNumeroRelatorio(relatorio);
       
        if(existeRelatorio== true){
            return true;
        }// fim metodo
        
        else {
      return false; 
              }// fim else 
        
        
    }// fim metodo
    
    public boolean salvarRelatorioAtendimento(Date dataOcorrido,
            Time horarioOcorrido,
            String localOcorrido, String nomeAluno, String turmaAluno, 
            String nomeResponsavel, String situacao, String encaminhamentos, String conclusao, boolean concluido ) throws SQLException{

        
         RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
         
        
     
        RelatorioAtendimentoModel relatorioASalvar =
                new RelatorioAtendimentoModel(dataOcorrido, horarioOcorrido,
                        localOcorrido, nomeAluno, turmaAluno, nomeResponsavel, situacao,
                        encaminhamentos, conclusao, concluido);
        
        
        if(dataOcorrido != null && horarioOcorrido != null && localOcorrido.length() > 0 
                && nomeAluno.length() > 0 && turmaAluno.length() > 0 && nomeResponsavel.length() >0
                && situacao.length() > 0  ){
            
             
             relatorioDAO.salvarRelatorio(relatorioASalvar);
             
     JOptionPane.showMessageDialog(null, "Relatorio salvo com sucesso!");
         return true;
        }// fim if
        
        else {
            JOptionPane.showMessageDialog(null, "Campos incompletos!");
            return false;
        }
  
    }// fim metodo
    
    
    public void excluirRelatorioAtendimento(int numRelatorio) throws SQLException{

        RelatorioAtendimentoModel relatorioASerExcluido = 
                new RelatorioAtendimentoModel(numRelatorio);
      
        
        RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
        
        boolean existe = verificarSeExisteRelatorio(numRelatorio);
        
        if(existe == true){
        relatorioDAO.excluirRelatorio(relatorioASerExcluido);
//        listaIdsRelatorios.remove(relatorioASerExcluido);
        
       
        JOptionPane.showMessageDialog(null, "Relatório excluído com sucesso!"); 
        }// fim if
        
        else {
            JOptionPane.showMessageDialog(null, "Relatório inexistente!");
        }// fim else 
    }// fim metodo
    
 
      public boolean alterarRelatorio( Date dataOcorrido,
            Time horarioOcorrido,
            String localOcorrido, String nomeAluno, String turmaAluno, 
            String nomeResponsavel, String situacao, String encaminhamentos, String conclusao,
            int numeroRelatorio, boolean concluido){
          
         
         RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
         
        RelatorioAtendimentoModel relatorioAAlterar =
                new RelatorioAtendimentoModel(dataOcorrido, horarioOcorrido,
                        localOcorrido, nomeAluno, turmaAluno, nomeResponsavel, situacao,
                        encaminhamentos, conclusao, numeroRelatorio, concluido);
          
        if(dataOcorrido != null && horarioOcorrido != null && localOcorrido.length() > 0 
                && nomeAluno.length() > 0 && turmaAluno.length() > 0 && nomeResponsavel.length() >0
                && situacao.length() > 0 ){
         
            relatorioDAO.alterarRelatorio(relatorioAAlterar);
     
            JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
              return true;
        }// fim if
        
        else {
            JOptionPane.showMessageDialog(null, "Campos incompletos!");
            return false;
        }// fim else 
             
      }// fim metodo
      
      
      
     

}// fim classe 

 