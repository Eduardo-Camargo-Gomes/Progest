package model.DAO;
import model.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {
	
	public void cadastrarUsuario(UsuarioModel usuarioParaCadastrar) throws SQLException {
		
           
	String sql = "INSERT INTO USUARIO(nome_de_usuario, senha, cpf) VALUES (?, ?, ?)";
	
	PreparedStatement ps = null;
	Connection connection = null;
	
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
		ps.setString(1, usuarioParaCadastrar.getUser());
		ps.setString (2, usuarioParaCadastrar.getSenha());
		 ps.setString(3, usuarioParaCadastrar.getCpf());
		ps.execute();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	}// fim catch	
 
	}// fim metodo 
	
       

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

    
    public boolean verificarSeExisteUsuario(UsuarioModel usuarioAVerificar) throws SQLException{
        
    try {

        String sql = "select * from usuario where nome_de_usuario like ?";
        
        PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		
                ps.setString(1, usuarioAVerificar.getUser());
                
                ResultSet resultSet = ps.executeQuery();
                return resultSet.next();
             
    } catch(SQLException e) {
        e.printStackTrace();       
    }// fim catch
    return false;
}// fim metodo
    
    
    public boolean verificarSeExisteCpf(UsuarioModel usuarioAVerificar) throws SQLException {
        
     try {

        String sql = "select * from usuario where cpf like ?";
        
        PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		
                ps.setString(1, usuarioAVerificar.getCpf());
                
                ResultSet resultSet = ps.executeQuery();
                return resultSet.next();
             
    } catch(SQLException e) {
        e.printStackTrace();       
    }// fim catch
    return false;
       
    }// fim metodo

        public void alterarSenha (UsuarioModel usuarioQueEsqueceuSenha){    
            
             try {

        String sql = "update usuario set senha = ? where nome_de_usuario like ? and cpf = ? ";
        
        PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		
                ps.setString(1, usuarioQueEsqueceuSenha.getSenha());
                ps.setString(2, usuarioQueEsqueceuSenha.getUser());
                  ps.setString(3, usuarioQueEsqueceuSenha.getCpf());
                  
                  ps.execute();
                
                
    } catch(SQLException e) {
        e.printStackTrace();       
    }// fim catch
    
        }// fim metodo alterar senha
    
}// }fim classe

