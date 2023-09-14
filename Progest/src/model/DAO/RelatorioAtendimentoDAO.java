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
    
    
    public int mostrarNumeroRelatorio(){
        
	int ultimoId = 0;
        
	try {
            
              String sql = "select max(numero_relatorio)as ultimo_id from relatorio_atendimento";
	 
	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                
                 ResultSet resultSet = ps.executeQuery();  
                 
                 if(resultSet.next()){
                    ultimoId = resultSet.getInt("ultimo_id");
                     
                 }// fim if
                 
               

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	}// fim catch	
        
        
        return ultimoId;
    }// fim metodo
    
    
    
    
}// fim classe 