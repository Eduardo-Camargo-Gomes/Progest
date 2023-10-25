/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ParecerModel;
import model.RelatorioAtendimentoModel;


public class ParecerDAO {
    
    List<Integer> listaIdsParecer = new ArrayList<>();
    
     public void salvarParecer(ParecerModel parecerASalvar){
        
    String sql = "INSERT INTO parecer (assunto_parecer, interessado_parecer, "
                + "matricula_aluno, texto, locall, data_ocorrido, concluido) VALUES (?, ?, ?, ?, ?, ?, ?)";
                
	
	PreparedStatement ps = null;
	Connection connection = null;
	
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
		ps.setString(1,parecerASalvar.getAssuntoParecer() );
		
                 ps.setString (2, parecerASalvar.getInteressadoParecer());
                 ps.setString(3, parecerASalvar.getMatriculaAluno());
                 ps.setString(4, parecerASalvar.getTexto())
;                  ps.setString(5, parecerASalvar.getLocal());
                 ps.setDate(6, new java.sql.Date(
                         parecerASalvar.getDataOcorrido().getTime()));  
    ps.setBoolean(7, parecerASalvar.getConcluido());
                    
                  ps.execute();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	}// fim catch	
        
    }// fim metodo
    
    public void excluirParecer(ParecerModel parecerADeletar) {
        
          String sql = "delete from parecer where numero_parecer = ? ";
	
	PreparedStatement ps = null;
	Connection connection = null;
	
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                ps.setInt(1, parecerADeletar.getNumParecer());
                listaIdsParecer.remove(parecerADeletar);
		ps.executeUpdate();
                 
	
	} catch (SQLException e) {
		
		e.printStackTrace();  
	}// fim catch	
     
    }// fim metodo
    
     public ParecerModel mostrarNumeroParecer() throws SQLException {
        
	ParecerModel parecer = new ParecerModel();
   
              String sql = "select * from parecer where numero_parecer ="
                      + " (select max(numero_parecer) from parecer)";
	 	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                
                 ResultSet resultSet = ps.executeQuery();  
                 
                 if(resultSet.next()){
                  parecer.setNumParecer(resultSet.getInt("numero_parecer"));
                 }// fim if

        return parecer;
    }// fim metodo
     
     
       public boolean existeNumeroParecer(ParecerModel parecerAVerificar){
        
          try {

        String sql = "select * from parecer where numero_parecer like ?";
        
        PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		
                ps.setInt(1, parecerAVerificar.getNumParecer());
                
                ResultSet resultSet = ps.executeQuery();
                return resultSet.next();
             
    } catch(SQLException e) {
        e.printStackTrace();       
    }// fim catch
    return false;
}// fim metodo
       
        public void alterarParecer (ParecerModel parecerAAlterar){
        
            try {
                
        String sql = "update parecer set assunto_parecer = ? , interessado_parecer = ?, "
                + "matricula_aluno = ?, locall= ?, data_ocorrido = ? , texto = ?,"
                + "texto = ? where numero_parecer = ?";
                       
        PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		
                ps.setString(1,parecerAAlterar.getAssuntoParecer());     
                  ps.setString(2, parecerAAlterar.getInteressadoParecer());
                  ps.setString(3, parecerAAlterar.getMatriculaAluno());
                  ps.setString(4, parecerAAlterar.getLocal());
                  ps.setDate(5,  new java.sql.Date(
                         parecerAAlterar.getDataOcorrido().getTime()));              
                  ps.setString(6, parecerAAlterar.getTexto());
                   ps.setBoolean(7, parecerAAlterar.getConcluido());
               
                  ps.setInt(8, parecerAAlterar.getNumParecer());
                 
                  ps.execute();
                
                
    } catch(SQLException e) {
        e.printStackTrace();       
    }// fim catch
        
    }// fim metodo
    
    
}// fim classe 
