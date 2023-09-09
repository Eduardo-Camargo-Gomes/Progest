package controller;
import model.*;
import controller.*;
import java.sql.Time;
import java.util.Date;
import model.DAO.RelatorioAtendimentoDAO;
import view.*;

public class RelatorioAtendimentoController {
    
    public void salvarRelatorioAtendimento(String nomeAluno,  String matriculaAluno, int serieAluno, char turmaAluno, 
String nomeResponsavel, Date dataOcorrido, Time horarioOcorrido, String localOcorrido, 
String situacao, String encaminhamentos,
            String conclusao, boolean concluido ){
        
         RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
         
         RelatorioAtendimentoModel relatorioASalvar = new RelatorioAtendimentoModel(
          nomeAluno,  matriculaAluno,  serieAluno, turmaAluno, 
 nomeResponsavel,  dataOcorrido, horarioOcorrido, localOcorrido, 
situacao, encaminhamentos,
            conclusao, concluido);
         
         relatorioDAO.salvarRelatorio(relatorioASalvar);
       
    }// fim metodo
    
    
    public void excluirRelatorioAtendimento(RelatorioAtendimentoModel relatorioASerExcluido){

        RelatorioAtendimentoDAO relatorioDAO = new RelatorioAtendimentoDAO();
        
        relatorioDAO.excluirRelatorio(relatorioASerExcluido);
       
        
    }
    
    
}// fim classe 
