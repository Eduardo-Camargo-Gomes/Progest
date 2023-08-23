package model.DAO;
import model.*;
import java.sql.*;

public class UsuarioDAO {
	
	public void cadastrarUsuario(UsuarioModel usuario) {
		
	String sql = "INSERT INTO USUARIO(nome_de_usuario, senha, cpf) VALUES (?, ?, ?)";
	
	PreparedStatement ps = null;
	Connection connection = null;
	
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);
		
               
		ps.setString(1, usuario.getUser());
		ps.setString (2, usuario.getSenha());
		 ps.setString(3, usuario.getCpf());
		ps.execute();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	}// fim catch	
	}// fim metodo 
	
        
       /* public boolean fazerLogin(UsuarioModel usuario) throws SQLException{
            
      String sql = "select * from Usuario where nome_de_usuario = '"+usuario.getUser() +"' "
              + "and senha = '"+usuario.getSenha()+"' ";
            
            PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		ps.execute();

      ResultSet resultSet = ps.getResultSet();
      
      return resultSet.next();
      
        }// fim metodo*/

    public boolean ExisteAutenticacao(UsuarioModel usuarioParaAutenticar) throws SQLException {
         String sql = "select * from Usuario where nome_de_usuario = '"+usuarioParaAutenticar.getUser() +"' "
              + "and senha = '"+usuarioParaAutenticar.getSenha()+"' ";
            
            PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		ps.execute();
                
                  ResultSet resultSet = ps.getResultSet();
      
      return resultSet.next();
                
    }

   
}// }fim classe 

