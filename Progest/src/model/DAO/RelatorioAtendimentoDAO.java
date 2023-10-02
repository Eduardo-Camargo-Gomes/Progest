package model.DAO;
import model.*;
import view.*;
import controller.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RelatorioAtendimentoDAO {
    
   public void salvarRelatorio(RelatorioAtendimentoModel relatorioASalvar){
        
      
        
        String sql = "INSERT INTO relatorio_atendimento(nome_aluno, turma_aluno, "
                + "nome_responsavel, data_ocorrido, horario, locall, situacao, encaminhamento, conclusao) "
                + "  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	PreparedStatement ps = null;
	Connection connection = null;
	
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
		ps.setString(1,relatorioASalvar.getNomeAluno() );
		
                 ps.setString (2, relatorioASalvar.getTurmaAluno());
                 ps.setString(3, relatorioASalvar.getNomeResponsavel());
                 ps.setDate(4, new java.sql.Date(
                         relatorioASalvar.getDataOcorrido().getTime()));  
                 ps.setTime(5, relatorioASalvar.getHorarioOcorrido());
                 ps.setString(6, relatorioASalvar.getLocalOcorrido());
                  ps.setString(7, relatorioASalvar.getSituacao());
                   ps.setString(8, relatorioASalvar.getEncaminhamentos());
                    ps.setString(9, relatorioASalvar.getConclusao());
                    
                  ps.execute();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	}// fim catch	
        
    }// fim metodo
    
  
    
    
    public void excluirRelatorio(RelatorioAtendimentoModel relatorioADeletar) {
        
          String sql = "delete from relatorio_atendimento where numero_relatorio = ? ";
	
	PreparedStatement ps = null;
	Connection connection = null;
	
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                ps.setInt(1, relatorioADeletar.getNumRelatorio());
		ps.executeUpdate();
	
	} catch (SQLException e) {
		
		e.printStackTrace();  
	}// fim catch	
        
        
    }// fim metodo
    
    
    public RelatorioAtendimentoModel mostrarNumeroRelatorio() throws SQLException {
        
	RelatorioAtendimentoModel relatorio =   new RelatorioAtendimentoModel();
   
              String sql = "select * from relatorio_atendimento where numero_relatorio ="
                      + " (select max(numero_relatorio) from relatorio_atendimento)";
	 
	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                
                 ResultSet resultSet = ps.executeQuery();  
                 
                 if(resultSet.next()){
                   relatorio.setNumRelatorio(resultSet.getInt("numero_relatorio"));
                 }// fim if

        return relatorio;
    }// fim metodo
    
    
    
    public RelatorioAtendimentoModel mostrarUltimoRelatorio() throws SQLException{

        
        RelatorioAtendimentoModel relatorio = new RelatorioAtendimentoModel();
        
              String sql = " select * from relatorio_atendimento where numero_relatorio ="
                      + " (select max(numero_relatorio) from relatorio_atendimento)";
	 
	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                
                 ResultSet resultSet = ps.executeQuery();
                 
                 if(resultSet.next()){
 relatorio.setNumRelatorio(resultSet.getInt("numero_relatorio"));
 relatorio.setDataOcorrido(resultSet.getDate("data_ocorrido"));
 relatorio.setHorarioOcorrido(resultSet.getTime("horario"));
 relatorio.setLocalOcorrido(resultSet.getString("locall"));
 relatorio.setNomeAluno(resultSet.getString("nome_aluno"));
 relatorio.setTurmaAluno(resultSet.getString("turma_aluno"));
 relatorio.setNomeResponsavel (resultSet.getString("nome_responsavel"));
 relatorio.setSituacao (resultSet.getString("situacao"));
 relatorio.setEncaminhamentos (resultSet.getString("encaminhamento"));
 relatorio.setConclusao (resultSet.getString("conclusao"));
         return relatorio;
                 }// fim if
                 else {
                     return null;
                 }// fim else 
    
    }// fim metodo
    
    public RelatorioAtendimentoModel mostrarUltimosRelatorios(String tipoOrdenacao) throws SQLException{
        
        tipoOrdenacao = "horaAcesso";
        
        RelatorioAtendimentoModel relatorios =   new RelatorioAtendimentoModel();
   
              String sql = "select * from relatorio_atendimento order by ?";
	 
	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                
                if(tipoOrdenacao.equals("dataCriacao")){   
                ps.setString(1, "dataCriacao");
                }// fim if
                
                else if (tipoOrdenacao.equals("dataAcesso")){
                     ps.setString(1, "dataAcesso");
                }// fim else if
                
                else if (tipoOrdenacao.equals("dataModificacao")){
                     ps.setString(1, "dataModificacao");
                }// fim else if
                
                else if (tipoOrdenacao.equals("horaAcesso")){
                     ps.setString(1, "horaAcesso");
                }// fim else if
                
                else if (tipoOrdenacao.equals("horaModificacao")){
                     ps.setString(1, "horaModificacao");
                }// fim else if
                
                 ResultSet resultSet = ps.executeQuery();  
 
                 if(resultSet.next()){
                     return relatorios; 
                 } // fim if
                 
                 else {
                    return null; 
                     
                 }// fim else 
    
    }// fim metodo
    
    
    public boolean existeNumeroRelatorio(RelatorioAtendimentoModel relatorioAVerificar){
        
          try {

        String sql = "select * from relatorio_atendimento where numero_relatorio like ?";
        
        PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		
                ps.setInt(1, relatorioAVerificar.getNumRelatorio());
                
                ResultSet resultSet = ps.executeQuery();
                return resultSet.next();
             
    } catch(SQLException e) {
        e.printStackTrace();       
    }// fim catch
    return false;
}// fim metodo
        
    }// fim classe
    
                 
     
 
    
