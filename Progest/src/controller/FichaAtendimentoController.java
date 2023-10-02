
package controller;

import model.*;
import model.DAO.*;
import controller.*;
import View.*;
import java.sql.SQLException;
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
      
  
    public void salvarFicha(String nome, String turma, Date dataNascimento, String telefone,
            String rg, String endereco, String bairro, String nomeResponsavel, String emailResponsavel,
            String estadoCivil, String moraCom, String telefoneResponsavel, String escolaConcluida,
            int anoConclusao){

        // ao implementar a classe da view colocar como parametro "Estado civil e moraCom"
        
        
        
        FichaAtendimentoModel fichaSalvar = new FichaAtendimentoModel( nome, turma, dataNascimento,
                telefone,
            rg,  endereco, bairro, nomeResponsavel, emailResponsavel,
            estadoCivil, moraCom, telefoneResponsavel,  escolaConcluida,
            anoConclusao);
        
        FichaAtendimentoDAO fichaDAO = new FichaAtendimentoDAO();
        
        
        
        if(nome.length() > 0 && turma.length() > 0 && dataNascimento != null && telefone.length()>0 
                && rg.length() > 0 && endereco.length() > 0 && bairro.length() > 0
                && nomeResponsavel.length() > 0 && emailResponsavel.length() > 0 
                && estadoCivil.length() > 0 && moraCom.length() > 0 && telefoneResponsavel.length() > 0
                && escolaConcluida.length() > 0  && anoConclusao > 0){
        
        fichaDAO.salvarFicha(fichaSalvar, estadoCivil, moraCom);
        
        JOptionPane.showMessageDialog(null, "Relatorio Salvo com sucesso!");
        
            }// fim if 
        else {
           JOptionPane.showMessageDialog(null, "Campos não preenchidos corretamente!");
            
        }// fim else 
        
    }// fim metodo
    
    public void excluirFicha(int numeroFicha) throws SQLException{
        
          FichaAtendimentoDAO fichaDAO = new FichaAtendimentoDAO();
        FichaAtendimentoModel fichaAExcluir = new FichaAtendimentoModel(numeroFicha);
        
        boolean existe = verificarSeExisteFicha(numeroFicha);
        
        if(existe == true){
        fichaDAO.excluirFicha(fichaAExcluir);
        
        JOptionPane.showMessageDialog(null, "Ficha excluída com sucesso!");
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Ficha inexistente!");
        }
    }// fim metodo
    
}//  fim classe 

