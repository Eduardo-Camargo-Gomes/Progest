package model.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {

	private static final String url = "jdbc:mysql://localhost:3306/projetofinalIFAM";
	private static final String user = "root";
	
		private static final String senha = "root";
		
		private static Connection conn;
		
		public static Connection getConexao() {
			
			try {
			if(conn == null) {
				
					conn = DriverManager.getConnection(url,user,senha);
				return conn;
				
			}// fimif
			
			else {
				return conn;
			}
			} //fim try 
			
			catch (SQLException e) {
				
				e.printStackTrace();
				return null;
			}// fim catch
			
			
		}// fim metodo
	
}
