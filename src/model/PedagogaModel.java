


package model;

public class PedagogaModel {
	private String nome;
	
	private String matricula;
	
	
	public PedagogaModel(String nome, String matricula) {
		super();
		this.nome = nome; // nome da pedagoga 
		
		this.matricula = matricula; // matricula da pedagoga
	}// fim classe 


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	


}// fim classe
