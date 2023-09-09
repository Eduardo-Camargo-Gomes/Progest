package model;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class RelatorioAtendimentoModel {
    private int numRelatorio;
    private String nomeAluno;
     private String matriculaAluno;
    private int serieAluno;
    private char turmaAluno;
    private String nomeResponsavel;
    private Date dataOcorrido;
    private Time horarioOcorrido;
    private String localOcorrido;
    private String situacao;
    private String encaminhamentos;
    private String conclusao; 
    private boolean concluido;

    public RelatorioAtendimentoModel(String nomeAluno, String matriculaAluno, int serieAluno, char turmaAluno, String nomeResponsavel, Date dataOcorrido, Time horarioOcorrido, String localOcorrido, String situacao, String encaminhamentos, String conclusao, boolean concluido) {
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
        this.serieAluno = serieAluno;
        this.turmaAluno = turmaAluno;
        this.nomeResponsavel = nomeResponsavel;
        this.dataOcorrido = dataOcorrido;
        this.horarioOcorrido = horarioOcorrido;
        this.localOcorrido = localOcorrido;
        this.situacao = situacao;
        this.encaminhamentos = encaminhamentos;
        this.conclusao = conclusao;
        this.concluido = concluido;
    }// fim const

    public int getNumRelatorio() {
        return numRelatorio;
    }

    public void setNumRelatorio(int numRelatorio) {
        this.numRelatorio = numRelatorio;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public int getSerieAluno() {
        return serieAluno;
    }

    public void setSerieAluno(int serieAluno) {
        this.serieAluno = serieAluno;
    }

    public char getTurmaAluno() {
        return turmaAluno;
    }

    public void setTurmaAluno(char turmaAluno) {
        this.turmaAluno = turmaAluno;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Date getDataOcorrido() {
        return dataOcorrido;
    }

    public void setDataOcorrido(Date dataOcorrido) {
        this.dataOcorrido = dataOcorrido;
    }

    public Time getHorarioOcorrido() {
        return horarioOcorrido;
    }

    public void setHorarioOcorrido(Time horarioOcorrido) {
        this.horarioOcorrido = horarioOcorrido;
    }

    public String getLocalOcorrido() {
        return localOcorrido;
    }

    public void setLocalOcorrido(String localOcorrido) {
        this.localOcorrido = localOcorrido;
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
    
    

    
    
    
}// fim classe 