package controller;
import model.*;
import controller.*;
import java.sql.Time;
import java.util.Date;
import javax.swing.JOptionPane;
import model.DAO.RelatorioAtendimentoDAO;
import View.RelatorioAtendimentoNovo;
import java.sql.SQLException;

public class RelatorioAtendimentoController {
    
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
            String nomeResponsavel, String situacao, String encaminhamentos, String conclusao ){

         RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
         
        RelatorioAtendimentoModel relatorioASalvar =
                new RelatorioAtendimentoModel(dataOcorrido, horarioOcorrido,
                        localOcorrido, nomeAluno, turmaAluno, nomeResponsavel, situacao,
                        encaminhamentos, conclusao);
        
        
        if(dataOcorrido != null && horarioOcorrido != null && localOcorrido.length() > 0 
                && nomeAluno.length() > 0 && turmaAluno.length() > 0 && nomeResponsavel.length() >0
                && situacao.length() > 0 && encaminhamentos.length() > 0 && conclusao.length() > 0){
            
            
             relatorioDAO.salvarRelatorio(relatorioASalvar);
             
            relatorioASalvar.setConcluido(true);
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
        JOptionPane.showMessageDialog(null, "Relatório excluído com sucesso!"); 
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Relatório inexistente!");
        }
    }// fim metodo
    
    
      public void  mostrarNumeroDeRelatorio() throws SQLException{
        
        RelatorioAtendimentoDAO modelo = new RelatorioAtendimentoDAO();
        
 
    }// fim metodo
      
    
   
}// fim classe 

 