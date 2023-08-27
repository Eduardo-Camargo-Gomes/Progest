package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class RelatorioAtendimentoModel {
    private String nome;
    private int numRelatorio;
    private int serie;
    private int turma;
    private Date data;
    private String matricula;
    private String situacao;
    private boolean concluido;
    
   
  
    public RelatorioAtendimentoModel(String nome, int numRelatorio, int serie, int turma, String  data, String matricula,
			String situacao) {
		super();
		this.nome = nome;
		this.numRelatorio = numRelatorio;
		this.serie = serie;
		this.turma = turma;
		
		this.matricula = matricula;
		this.situacao = situacao;
		this.concluido = concluido;
		try {
			this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }
    //fim construtor



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getNumRelatorio() {
		return numRelatorio;
	}



	public void setNumRelatorio(int numRelatorio) {
		this.numRelatorio = numRelatorio;
	}



	public int getSerie() {
		return serie;
	}



	public void setSerie(int serie) {
		this.serie = serie;
	}



	public int getTurma() {
		return turma;
	}



	public void setTurma(int turma) {
		this.turma = turma;
	}



	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public String getSituacao() {
		return situacao;
	}



	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}



	public boolean getConcluido() {
		return concluido;
	}



	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}



	public void DadosRelatorio(){
    	
        System.out.println("numero do relatorio: "+getNumRelatorio() );
        System.out.println("Data e hora do ocorrido : " +getData());
        System.out.println("Nome do discente: "+getNome());
       if(getSituacao()!= "Concluido"){
           setConcluido(false);
       }// fim if
       else {
           setConcluido(true);
       }// 
        System.out.println("Concluido: " +getConcluido());
        
    }// fim metodo
        
    
    
    
    
    
}// fim classe
