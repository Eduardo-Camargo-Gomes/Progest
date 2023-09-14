package model;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class RelatorioAtendimentoModel {
    private Date dataOcorrido;
     private Time horarioOcorrido;
      private String localOcorrido;
       private String nomeAluno;
        private String turmaAluno;
          private String nomeResponsavel;
           private String situacao;
    private String encaminhamentos;
    private String conclusao;
   
    private int numRelatorio;

    private boolean concluido;

    public RelatorioAtendimentoModel(Date dataOcorrido, Time horarioOcorrido, String localOcorrido, String nomeAluno, String turmaAluno, String nomeResponsavel, String situacao, String encaminhamentos, String conclusao) {
        this.dataOcorrido = dataOcorrido;
        this.horarioOcorrido = horarioOcorrido;
        this.localOcorrido = localOcorrido;
        this.nomeAluno = nomeAluno;
        this.turmaAluno = turmaAluno;
        this.nomeResponsavel = nomeResponsavel;
        this.situacao = situacao;
        this.encaminhamentos = encaminhamentos;
        this.conclusao = conclusao;
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

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getTurmaAluno() {
        return turmaAluno;
    }

    public void setTurmaAluno(String turmaAluno) {
        this.turmaAluno = turmaAluno;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
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

    public int getNumRelatorio() {
        return numRelatorio;
    }

    public void setNumRelatorio(int numRelatorio) {
        this.numRelatorio = numRelatorio;
    }

    public boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

   
    
    
    
    public RelatorioAtendimentoModel(int numRelatorio) {
        this.numRelatorio = numRelatorio;
    }// fim metoo
    
    
    
    
    
    

}// fim classe