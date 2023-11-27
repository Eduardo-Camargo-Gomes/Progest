package model;

;
import java.util.List;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
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
               private String descricao;
                 private int numRelatorio;
                 
                     private boolean concluido;
                     
                 private Date dataAcesso;
                 private Date dataModificacao;
                 private Date dataCriacao;
                 private Time horaAcesso;
                 private Time horaModificacao;
                 
          private List<RelatorioAtendimentoModel> listaRelatorios = new ArrayList<>();

    public RelatorioAtendimentoModel(Date dataOcorrido, Time horarioOcorrido, String localOcorrido, String nomeAluno, String turmaAluno, String nomeResponsavel, String situacao, String encaminhamentos, String conclusao, int numRelatorio, boolean concluido, String descricao) {
        this.dataOcorrido = dataOcorrido;
        this.horarioOcorrido = horarioOcorrido;
        this.localOcorrido = localOcorrido;
        this.nomeAluno = nomeAluno;
        this.turmaAluno = turmaAluno;
        this.nomeResponsavel = nomeResponsavel;
        this.situacao = situacao;
        this.encaminhamentos = encaminhamentos;
        this.conclusao = conclusao;
        this.numRelatorio = numRelatorio;
        this.concluido = concluido;
        this.descricao = descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setListaRelatorios(List<RelatorioAtendimentoModel> listaRelatorios) {
        this.listaRelatorios = listaRelatorios;
    }

    public Date getDataAcesso() {
        return dataAcesso;
    }

    public void setDataAcesso(Date dataAcesso) {
        this.dataAcesso = dataAcesso;
    }

    public Date getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Date dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Time getHoraAcesso() {
        return horaAcesso;
    }

    public void setHoraAcesso(Time horaAcesso) {
        this.horaAcesso = horaAcesso;
    }

    public Time getHoraModificacao() {
        return horaModificacao;
    }

    public void setHoraModificacao(Time horaModificacao) {
        this.horaModificacao = horaModificacao;
    }
                 
               
    public RelatorioAtendimentoModel(Date dataOcorrido, Time horarioOcorrido, String localOcorrido, String nomeAluno, String turmaAluno, String nomeResponsavel, String situacao, String encaminhamentos, String conclusao, boolean concluido) {
        this.dataOcorrido = dataOcorrido;
        this.horarioOcorrido = horarioOcorrido;
        this.localOcorrido = localOcorrido;
        this.nomeAluno = nomeAluno;
        this.turmaAluno = turmaAluno;
        this.nomeResponsavel = nomeResponsavel;
        this.situacao = situacao;
        this.encaminhamentos = encaminhamentos;
        this.conclusao = conclusao;
        this.concluido = concluido;
       
    }

    public RelatorioAtendimentoModel() {
    }

    public RelatorioAtendimentoModel(String descricao, int numRelatorio) {
        this.descricao = descricao;
        this.numRelatorio = numRelatorio;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public RelatorioAtendimentoModel(Date dataOcorrido, Time horarioOcorrido, String localOcorrido, String nomeAluno, String turmaAluno, String nomeResponsavel, String situacao, String encaminhamentos, String conclusao, int numRelatorio, boolean concluido) {
        this.dataOcorrido = dataOcorrido;
        this.horarioOcorrido = horarioOcorrido;
        this.localOcorrido = localOcorrido;
        this.nomeAluno = nomeAluno;
        this.turmaAluno = turmaAluno;
        this.nomeResponsavel = nomeResponsavel;
        this.situacao = situacao;
        this.encaminhamentos = encaminhamentos;
        this.conclusao = conclusao;
        this.numRelatorio = numRelatorio;
        this.concluido = concluido;
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

   
    public void adicionarRelatorio(RelatorioAtendimentoModel relatorioASalvar){
        listaRelatorios.add(relatorioASalvar);
    }
    
    public void removerRelatorio(RelatorioAtendimentoModel relatorioAExcluir){
        
        listaRelatorios.remove(relatorioAExcluir);
    }// fim metodo
    
    public RelatorioAtendimentoModel(int numRelatorio) {
        this.numRelatorio = numRelatorio;
    }// fim metoo
    
   public List<RelatorioAtendimentoModel> getListaRelatorios() {
        return listaRelatorios;
    }// fim getLista*/

}// fim classe