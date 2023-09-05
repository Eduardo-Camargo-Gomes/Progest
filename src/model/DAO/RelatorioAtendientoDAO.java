package model.DAO;
import model.*;
import view.*;
import controller.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RelatorioAtendientoDAO {
  
    public void salvarRelatorio(RelatorioAtendimentoModel relatorioASalvar){
        
        String sql = "INSERT INTO relatorio_atendimento( VALUES (?, ?, ?)";
	
	PreparedStatement ps = null;
	Connection connection = null;
	
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
		ps.setString(1,relatorioASalvar.getNomeAluno() );
		ps.setString (2, relatorioASalvar.getMatriculaAluno() );
		 ps.setInt(3, relatorioASalvar.getSerieAluno() );
		ps.execute();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	}// fim catch	
        
    }// fim metodo
    
}// fim classe 