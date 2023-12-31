
package controller;

import model.*;
import model.DAO.*;
import controller.*;
import View.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class FichaAtendimentoController {
    
   
    
  public boolean verificarSeExisteFicha(int numeroFicha) throws SQLException{
        
        FichaAtendimentoModel ficha = new  FichaAtendimentoModel(numeroFicha);
        FichaAtendimentoDAO fichaDAO = new FichaAtendimentoDAO();
        
  
         boolean existeFicha = fichaDAO.existeNumeroFicha(ficha);
       
        if(existeFicha== true){
            return true;
        }// fim metodo
        
        else {
      return false; 
              }// fim else 
        
        
    }// fim metodo
      
  
    public boolean salvarFicha(String nome, Date dataNascimento, String telefone,
            String rg, String endereco, String bairro, String nomePai, String nomeMae, String emailPai, 
            String emailMae,
            String estadoCivil, String moraCom, String telefonePai, String telefoneMae, String escolaConcluida,
            String tipoEscola,
            int anoConclusao, boolean concluido){

        // ao implementar a classe da view colocar como parametro "Estado civil e moraCom"
        
        
        
        FichaAtendimentoModel fichaSalvar = new FichaAtendimentoModel( nome, dataNascimento,
                telefone,
            rg,  endereco, bairro, nomePai, nomeMae,  emailPai, emailMae,
            estadoCivil, moraCom, telefonePai, telefoneMae,  escolaConcluida, tipoEscola, 
            anoConclusao, concluido );
        
        FichaAtendimentoDAO fichaDAO = new FichaAtendimentoDAO();
        
        
        
        if(nome.length() > 0 && dataNascimento != null && telefone.length()>0 
                && rg.length() > 0 && endereco.length() > 0 && bairro.length() > 0 
                && estadoCivil.length() > 0
                && escolaConcluida.length() > 0 && tipoEscola.length() > 0 && anoConclusao > 0){
        
        fichaDAO.salvarFicha(fichaSalvar, estadoCivil, moraCom);
        
        JOptionPane.showMessageDialog(null, "Ficha salva com sucesso!");
        return true;
            }// fim if 
        else {
           JOptionPane.showMessageDialog(null, "Campos não preenchidos corretamente!");
            return false;
        }// fim else 
        
    }// fim metodo
    
    public void excluirFicha(int numeroFicha) throws SQLException{
        
          FichaAtendimentoDAO fichaDAO = new FichaAtendimentoDAO();
        FichaAtendimentoModel fichaAExcluir = new FichaAtendimentoModel(numeroFicha);
        
        boolean existe = verificarSeExisteFicha(numeroFicha);
        
        if(existe == true){
        fichaDAO.excluirFicha(fichaAExcluir);
        
//        listaFichas.remove(fichaAExcluir);
        
        JOptionPane.showMessageDialog(null, "Ficha excluída com sucesso!");
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Ficha inexistente!");
        }
    }// fim metodo
    
    public boolean alterarFicha( String nome, Date dataNascimento, String telefone,
            String rg, String endereco, String bairro, String nomePai, String nomeMae, String emailPai, 
            String emailMae,
            String estadoCivil, String moraCom, String telefonePai, String telefoneMae, String escolaConcluida,
            String tipoEscola,
            int anoConclusao, int numeroFicha, boolean concluido){
        
        FichaAtendimentoModel fichaAAlterar = new FichaAtendimentoModel(nome, dataNascimento,
                telefone,
            rg,  endereco, bairro, nomePai, nomeMae,  emailPai, emailMae,
            estadoCivil, moraCom, telefonePai, telefoneMae,  escolaConcluida, tipoEscola, 
            anoConclusao, numeroFicha, concluido);
        
        FichaAtendimentoDAO fichaDAO = new FichaAtendimentoDAO();
        
         if(nome.length() > 0 && dataNascimento != null && telefone.length()>0 
                && rg.length() > 0 && endereco.length() > 0 && bairro.length() > 0 
                && estadoCivil.length() > 0
                && escolaConcluida.length() > 0 && tipoEscola.length() > 0 && anoConclusao > 0){
             
             fichaDAO.alterarFicha(fichaAAlterar, estadoCivil, moraCom);
             JOptionPane.showMessageDialog(null, "Alterações salvas com sucsso!");
        return true ;
         }// fim if
         
         else {
           JOptionPane.showMessageDialog(null, "Campos incompletos!");  
         
        return false;
         }// fim else 
    }// fim metodo
    
      public String alterarDescricao(String descricao, int numRelatorio){
         
          
         FichaAtendimentoDAO dao = new FichaAtendimentoDAO();
          
          dao.alterarDescricao(descricao, numRelatorio);
          
          return descricao;
      }// fim metodo
    
}//  fim classe 

