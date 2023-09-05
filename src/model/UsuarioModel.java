package model;
import java.sql.SQLException;
import model.DAO.*;
public class UsuarioModel {

	private double id;
	private String user;
	private String senha;
        private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
	
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public UsuarioModel( String user, String senha, String cpf) {
		super();
                this.cpf = cpf;
		this.user = user;
		this.senha = senha;
	}
        
        public UsuarioModel( String user, String senha) {
		super();
               
		this.user = user;
		this.senha = senha;
	}
     
}// fim classe 
