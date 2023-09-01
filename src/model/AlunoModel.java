package model;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.RelatorioAtendimentoModel;
import java.util.Date;
import java.time.*;

public class AlunoModel {
	 private String nome;
	   
	    private String nome_responsavel;
	    private String rg;
	    private String endereço;
	    private int serie;
	    private int turma;
	    private String turno;
	    private String matricula;
	    private String observacao;
	    private String bairro;
	    private int numOcorrencia;
	    private Date data_nasc;

	    
		public AlunoModel(String nome, String data_nasc, String nome_responsavel, String rg, String endereço, int serie, int turma,
				String turno, String matricula, String observacao, String bairro) {
			super();
			this.nome = nome;
			this.nome_responsavel = nome_responsavel;
			this.rg = rg;
			this.endereço = endereço;
			this.serie = serie;
			this.turma = turma;
			this.turno = turno;
			this.matricula = matricula;
			this.observacao = observacao;
			this.bairro = bairro;
			try {
				this.data_nasc = new SimpleDateFormat("dd/MM/yyyy").parse(data_nasc);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}



		public String getNome() {
			return nome;
		}



		public void setNome(String nome) {
			this.nome = nome;
		}



		public String getNome_responsavel() {
			return nome_responsavel;
		}



		public void setNome_responsavel(String nome_responsavel) {
			this.nome_responsavel = nome_responsavel;
		}



		public String getRg() {
			return rg;
		}



		public void setRg(String rg) {
			this.rg = rg;
		}



		public String getEndereço() {
			return endereço;
		}



		public void setEndereço(String endereço) {
			this.endereço = endereço;
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



		public String getTurno() {
			return turno;
		}// fim metipdi get



		public void setTurno(String turno) {
			this.turno = turno;
		}



		public String getMatricula() {
			return matricula;
		}



		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}



		public String getObservacao() {
			return observacao;
		}



		public void setObservacao(String observacao) {
			this.observacao = observacao;
		}



		public String getBairro() {
			return bairro;
		}



		public void setBairro(String bairro) {
			this.bairro = bairro;
		}



		public int getNumOcorrencia() {
			return numOcorrencia;
		}



		public void setNumOcorrencia(int numOcorrencia) {
			this.numOcorrencia = numOcorrencia;
		}


		public Date getData_nasc() {
			return data_nasc;
		}



		public void setData_nasc(Date data_nasc) {
			this.data_nasc = data_nasc;
		}



		public void verHistorico() {
	    	
	    }// fim metodo
	   	        
	    public void realizar_ocorrencia(){

	        
	    }// fim metodo
	
		
		
}// fim classe
