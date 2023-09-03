package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class RelatorioAtendimentoModel {
    private String nomeAluno;
    private int numRelatorio;
    private int serieAluno;
    private int turmaAluno;
    private Date dataOcorrido;
    private String matriculaAluno;
    private String situacao;
    private String encaminhamentos;
    private String conclusao; 
    private boolean concluido;

    public RelatorioAtendimentoModel(String nomeAluno, int serieAluno, int turmaAluno, Date dataOcorrido, String matriculaAluno, String situacao, String encaminhamentos, String conclusao, boolean concluido) {
        this.nomeAluno = nomeAluno;
       
        this.serieAluno = serieAluno;
        this.turmaAluno = turmaAluno;
        this.dataOcorrido = dataOcorrido;
        this.matriculaAluno = matriculaAluno;
        this.situacao = situacao;
        this.encaminhamentos = encaminhamentos;
        this.conclusao = conclusao;
        this.concluido = concluido;
        
    }// fim construtor

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getNumRelatorio() {
        return numRelatorio;
    }

    public void setNumRelatorio(int numRelatorio) {
        this.numRelatorio = numRelatorio;
    }

    public int getSerieAluno() {
        return serieAluno;
    }

    public void setSerieAluno(int serieAluno) {
        this.serieAluno = serieAluno;
    }

    public int getTurmaAluno() {
        return turmaAluno;
    }

    public void setTurmaAluno(int turmaAluno) {
        this.turmaAluno = turmaAluno;
    }

    public Date getDataOcorrido() {
        return dataOcorrido;
    }

    public void setDataOcorrido(Date dataOcorrido) {
        this.dataOcorrido = dataOcorrido;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEncaminhamentos() {
        return encaminhamentos;
    }

    public void setEncaminhamentos(String encaminhamentos) {
        this.encaminhamentos = encaminhamentos;
    }

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    public boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
    // fim getters e setters
    
    
    
    

    
    
  
  
    
    
}// fim classe
