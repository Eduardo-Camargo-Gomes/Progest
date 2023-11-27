
package controller;
import model.*;
import model.DAO.*;
import controller.*;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import javax.swing.JOptionPane;


public class ParecerController {
    
    public boolean salvarParecer(String assuntoParecer, String interessadoParecer, String matriculaAluno,
            String texto,
            String local, Date dataOcorrido, boolean concluido ){
    
        ParecerModel parecerSalvar = new ParecerModel(assuntoParecer, interessadoParecer, matriculaAluno, 
        texto, local, dataOcorrido, concluido);
        
        ParecerDAO parecerDAO = new ParecerDAO();
       
     if(assuntoParecer.length() > 0 && interessadoParecer.length() >0 && matriculaAluno.length() > 0&& texto.length()>0 
             && local.length() > 0 && dataOcorrido != null ){
         
         parecerDAO.salvarParecer(parecerSalvar);
         JOptionPane.showMessageDialog(null, "Parecer salvo com sucesso!");
         return true;
     }// fim if
     
     else {
         
         JOptionPane.showMessageDialog(null, "Campos incompletos!");
         return false;
     }// fim else 
        
        
}// fim metodo
    
     public boolean verificarSeExisteParecer(int numeroParecer) throws SQLException{
        
        ParecerModel parecer = new ParecerModel(numeroParecer);
        ParecerDAO  parecerDAO = new ParecerDAO();
        
  
         boolean existeParecer = parecerDAO.existeNumeroParecer(parecer);
       
        if(existeParecer== true){
            return true;
        }// fim metodo
        
        else {
      return false; 
              }// fim else 
    
     }// fim metodo
     
     public void excluirParecer(int numParecer) throws SQLException{

        ParecerModel parecerASerExcluido = 
                new ParecerModel(numParecer);
      
        
        ParecerDAO parecerDAO = new ParecerDAO();
        
        boolean existe = verificarSeExisteParecer(numParecer);
        
        if(existe == true){
        parecerDAO.excluirParecer(parecerASerExcluido);
//        listaIdsRelatorios.remove(relatorioASerExcluido);
        
       
        JOptionPane.showMessageDialog(null, "Parecer excluído com sucesso!"); 
        }// fim if
        
        else {
            JOptionPane.showMessageDialog(null, "Parecer inexistente!");
        }// fim else 
    }// fim metodo
     
     
     
      public boolean alterarParecer  ( String assuntoParecer, String interessadoParecer, String matriculaAluno,
            String texto,
            String local, Date dataOcorrido, boolean concluido, int numParecer){
          
       ParecerDAO parecerDAO = new ParecerDAO();
         
        ParecerModel parecerAAlterar = new ParecerModel
        ( assuntoParecer, interessadoParecer, matriculaAluno, texto,
             local, dataOcorrido, concluido, numParecer);
          
       if(assuntoParecer.length() > 0 && interessadoParecer.length() >0 && matriculaAluno.length() > 0&& texto.length()>0 
             && local.length() > 0 && dataOcorrido != null ){
         
            parecerDAO.alterarParecer(parecerAAlterar);
     
            JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
              return true;
        }// fim if
        
        else {
            JOptionPane.showMessageDialog(null, "Campos incompletos!");
            return false;
        }// fim else 
             
      }// fim metodo
      
       public String alterarDescricao(String descricao, int numParecer){
         
          
         ParecerDAO dao = new ParecerDAO();
          
          dao.alterarDescricao(descricao, numParecer);
          
          return descricao;
      }// fim metodo
    
    
}// fim classe 
