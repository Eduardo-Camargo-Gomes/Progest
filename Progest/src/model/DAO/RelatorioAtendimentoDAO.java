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
        
       ResponsavelModel responsavel;
        
        String sql = "INSERT INTO relatorio_atendimento(nome_aluno, matricula_aluno, serie_aluno, turma_aluno"
                + "nome_responsavel, data_ocorrido, horario, locall, situacao, encaminhamento, conclusao, concluido) "
                + "  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	PreparedStatement ps = null;
	Connection connection = null;
	
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
		ps.setString(1,relatorioASalvar.getNomeAluno() );
		ps.setString (2, relatorioASalvar.getMatriculaAluno());
		 ps.setInt(3, relatorioASalvar.getSerieAluno());
                 ps.setInt(4, relatorioASalvar.getTurmaAluno());
                 ps.setString(5, relatorioASalvar.getNomeResponsavel());
                 ps.setDate(6, new java.sql.Date(
                         relatorioASalvar.getDataOcorrido().getTime()));
                 
                 ps.setTime(7, relatorioASalvar.getHorarioOcorrido());
                 ps.setString(8, relatorioASalvar.getLocalOcorrido());
                  ps.setString(9, relatorioASalvar.getSituacao());
                   ps.setString(10, relatorioASalvar.getEncaminhamentos());
                    ps.setString(11, relatorioASalvar.getConclusao());
                     ps.setBoolean(12, relatorioASalvar.getConcluido());
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
		
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	}// fim catch	
        
        
    }// fim metodo
    
    
    public void mostrarNumeroRelatorio(){
        
	
	try {
            
              String sql = "select max(numero_relatorio) from relatorio_atendimento ";
	
	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                
                 ResultSet resultSet = ps.executeQuery();  

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	}// fim catch	
        
        
        
        
    }// fim metodo
    
}// fim classe 