package model.DAO;
import model.*;
import view.*;
import controller.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RelatorioAtendimentoDAO {
    
     List<Integer> listaIdsRelatorios = new ArrayList<>();
      List<Integer> listaIdsRelatoriosProntos = new ArrayList<>();
   
  //  List<RelatorioAtendimentoModel> listaRelatorios = new ArrayList<>();
    
   public void salvarRelatorio(RelatorioAtendimentoModel relatorioASalvar){
        
      
        
        String sql = "INSERT INTO relatorio_atendimento(nome_aluno, turma_aluno, "
                + "nome_responsavel, data_ocorrido, horario, locall, situacao, encaminhamento, conclusao,"
                + "concluido) "
                + "  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
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
                    ps.setBoolean(10, relatorioASalvar.getConcluido());
                    
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
                listaIdsRelatorios.remove(relatorioADeletar);
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
    
    public void alterarRelatorio (RelatorioAtendimentoModel relatorioAAlterar){
        
            try {
                
        String sql = "update relatorio_atendimento set nome_aluno = ? , turma_aluno= ?, "
                + "nome_responsavel = ?, data_ocorrido= ?, horario = ? , locall= ? ,"
                + "situacao = ?, encaminhamento = ?, conclusao= ?, concluido = ? where numero_relatorio = ?";
        
        PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		
                ps.setString(1,relatorioAAlterar.getNomeAluno());     
                  ps.setString(2, relatorioAAlterar.getTurmaAluno());
                  ps.setString(3, relatorioAAlterar.getNomeResponsavel());
                  ps.setDate(4,  new java.sql.Date(
                         relatorioAAlterar.getDataOcorrido().getTime()));
                  ps.setTime(5, relatorioAAlterar.getHorarioOcorrido());
                  ps.setString(6, relatorioAAlterar.getLocalOcorrido());
                  ps.setString(7, relatorioAAlterar.getSituacao());
                  ps.setString(8, relatorioAAlterar.getEncaminhamentos());
                  ps.setString(9, relatorioAAlterar.getConclusao());
                   ps.setBoolean(10, relatorioAAlterar.getConcluido());
                  ps.setInt(11, relatorioAAlterar.getNumRelatorio());
                 
                  ps.execute();
                
                
    } catch(SQLException e) {
        e.printStackTrace();       
    }// fim catch
        
    }// fim metodo
    
    public RelatorioAtendimentoModel acessarRelatorio(int numeroRelatorio) throws SQLException{

       RelatorioAtendimentoModel relatorio= new RelatorioAtendimentoModel(numeroRelatorio);
// instancia um objeto model e passa por parametro o id para consultar
              String sql = "select * from relatorio_atendimento where numero_relatorio = ?";
	
	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                 
                 ps.setInt(1, numeroRelatorio);
                 
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
 relatorio.setConcluido(resultSet.getBoolean("concluido"));
         return relatorio;
         
         // guarda os valores no objeto "relatorio"
                 }// fim if
                 else {
                     return null;
                 }// fim else             
    }// fim metodo
    
    public List<Integer> listaIdsRelatorios() throws SQLException{
        
        RelatorioAtendimentoModel relatorio = new RelatorioAtendimentoModel();
        
         
       String  sql = "select numero_relatorio from relatorio_atendimento order by numero_relatorio desc;";
 PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql); 
             
                 ResultSet resultSet = ps.executeQuery();
        
                 while(resultSet.next()){
  relatorio.setNumRelatorio(resultSet.getInt("numero_relatorio"));
                    
listaIdsRelatorios.add(relatorio.getNumRelatorio());
                 }// fim while
        
                 return listaIdsRelatorios;
       
    }// fim metodo
    
    
    public List<Integer> listaIdsRelatoriosProntos() throws SQLException{
        
        RelatorioAtendimentoModel relatorio = new RelatorioAtendimentoModel();
   String  sql = "select numero_relatorio from relatorio_atendimento where concluido = true order by numero_relatorio desc;";
  
	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql); 
             
                 ResultSet resultSet = ps.executeQuery();
        
                 while(resultSet.next()){
  relatorio.setNumRelatorio(resultSet.getInt("numero_relatorio"));
                    
listaIdsRelatoriosProntos.add(relatorio.getNumRelatorio());
                 }// fim while
        
                 return listaIdsRelatoriosProntos;
      
      
    }// fim metodo
      
    }// fim classe
    
                 
     
 
    
