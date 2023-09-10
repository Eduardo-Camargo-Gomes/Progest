package model;
public class ResponsavelModel {
    
    private String nome;
    private String email;
    private String telefone;
    private String parentesco;
    private String matricula_aluno;
    
    
	public ResponsavelModel (String nome, String telefone, String parentesco, String matricula_aluno) {
		this.nome = nome;
		this.telefone = telefone;
		this.parentesco = parentesco;
		this.matricula_aluno = matricula_aluno;		
	}// fim const
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	public String getMatricula_aluno() {
		return matricula_aluno;
	}
	public void setMatricula_aluno(String matricula_aluno) {
		this.matricula_aluno = matricula_aluno;
	}
    
    
    
    
    
}// fim classe
