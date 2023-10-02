
package model.DAO;

import model.*;
import model.DAO.*;
import controller.*;
import View.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


public class FichaAtendimentoDAO {
    
    public void salvarFicha(FichaAtendimentoModel fichaASalvar, String estadoCivil, String moraCom){
  
        String sql = "INSERT INTO fichaatendimento(nome_aluno, turma_aluno, data_nascimento, "
                + "telefone, rg, endereco, bairro, nome_responsavel, email_responsavel, estado_civil,"
                + "mora_com, telefone_responsavel, escola_concluida, ano_conclusao) "
                + "  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	PreparedStatement ps = null;
	Connection connection = null;
  
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
		ps.setString(1,fichaASalvar.getNome() );
		ps.setString(2, fichaASalvar.getTurma());
                ps.setDate(3, new java.sql.Date(
                        fichaASalvar.getDataNascimento().getTime()));
                ps.setString(4, fichaASalvar.getTelefone());
                ps.setString(5, fichaASalvar.getRg());
                ps.setString(6, fichaASalvar.getEndereco());
                ps.setString(7, fichaASalvar.getBairro());
                ps.setString(8, fichaASalvar.getNomeResponsavel());
                ps.setString(9, fichaASalvar.getEmailResponsavel());
                
                if(estadoCivil.equals("Casados")){
                ps.setString(10, "Casados");
                }// fim if 
                
                 else if(estadoCivil.equals("Separados")){
                ps.setString(10, "Separados");
                  }// fim if 
                  
                 else  if(estadoCivil.equals("Outros")){
                ps.setString(10, "Outros");
                    }// fim if
                 
                if(estadoCivil.equals("Separados")){
                if(moraCom.equals("Pai")){
                   ps.setString(11, "Pai");
                }// fi if
                
                else if(moraCom.equals("Mae")){
                   ps.setString(11, "Mae");
                }// fim else 
                
                 else if(moraCom.equals("Avos")){
                   ps.setString(11, "Avos");
                }// fim else
                
                 else if(moraCom.equals("Outros")){
                   ps.setString(11, "Outros");
                }// fim else 
                
                    }// fim ifao
                
                ps.setString(12, fichaASalvar.getTelefoneResponsavel());
                
                ps.setString(13, fichaASalvar.getEscolaConcluida());
                
                  ps.setInt(14, fichaASalvar.getAnoConclusao());
                
                    
                  ps.execute();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	}// fim catch	
        
    }// fim metodo
    
   public void excluirFicha(FichaAtendimentoModel fichaADeletar) {
        
          String sql = "delete from fichaatendimento where numero_ficha = ? ";
	
	PreparedStatement ps = null;
	Connection connection = null;
	
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                ps.setInt(1, fichaADeletar.getNumeroFicha());
		ps.executeUpdate();
	
	} catch (SQLException e) {
		
		e.printStackTrace();  
	}// fim catch	
        
        
    }// fim metodo
   
   public FichaAtendimentoModel mostrarNumeroFicha() throws SQLException {
        
	FichaAtendimentoModel ficha=new FichaAtendimentoModel();
   
              String sql = "select * from ficha_atendimento where numero_ficha ="
                      + " (select max(numero_ficha) from ficha_atendimento)";
	 
	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                
                 ResultSet resultSet = ps.executeQuery();  
                 
                 if(resultSet.next()){
                  ficha.setNumeroFicha(resultSet.getInt("numero_ficha"));
                 }// fim if

        return ficha;
    }// fim metodo
   
   public boolean existeNumeroFicha(FichaAtendimentoModel fichaAVerificar){
        
          try {

        String sql = "select * from fichaatendimento where numero_ficha like ?";
        
        PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		
                ps.setInt(1, fichaAVerificar.getNumeroFicha());
                
                ResultSet resultSet = ps.executeQuery();
                return resultSet.next();
             
    } catch(SQLException e) {
        e.printStackTrace();       
    }// fim catch
    return false;
}// fim metodo
    
    
    
   
}// fim metodo
