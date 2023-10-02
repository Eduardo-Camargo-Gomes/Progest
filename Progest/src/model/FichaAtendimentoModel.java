package model;

import model.*;
import model.DAO.*;
import controller.*;
import View.*;
import java.sql.Time;
import java.util.Date;

public class FichaAtendimentoModel {
    
    private int numeroFicha;
     private String nome;
    private String turma;
    private Date dataNascimento;
    private String telefone;
    private String rg;
    private String endereco;
    private String bairro;
    private String nomeResponsavel;
    private String emailResponsavel;
    private String estadoCivil;
    private String moraCom;
    private String telefoneResponsavel;
    private String escolaConcluida;
    private int anoConclusao;
    
    private Date dataAcesso;
     private Date dataModificacao;
      private Date dataCriacao;
      private Time horaAcesso;
      private Time horaModificacao;

    public FichaAtendimentoModel(String nome, String turma, Date dataNascimento, String telefone, String rg, String endereco, String bairro, String nomeResponsavel, String emailResponsavel, String estadoCivil, String moraCom, String telefoneResponsavel, String escolaConcluida, int anoConclusao) {
        this.nome = nome;
        this.turma = turma;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.rg = rg;
        this.endereco = endereco;
        this.bairro = bairro;
        this.nomeResponsavel = nomeResponsavel;
        this.emailResponsavel = emailResponsavel;
        this.estadoCivil = estadoCivil;
        this.moraCom = moraCom;
        this.telefoneResponsavel = telefoneResponsavel;
        this.escolaConcluida = escolaConcluida;
        this.anoConclusao = anoConclusao;
    }// fim construtor

    public FichaAtendimentoModel(int numeroFicha) {
        this.numeroFicha = numeroFicha;
    }// fim construtor 2
    
    public FichaAtendimentoModel(){
        
    }// fim construtor default 
    
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
    
    public int getNumeroFicha() {
        return numeroFicha;
    }

    public void setNumeroFicha(int numeroFicha) {
        this.numeroFicha = numeroFicha;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getMoraCom() {
        return moraCom;
    }

    public void setMoraCom(String moraCom) {
        this.moraCom = moraCom;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getEscolaConcluida() {
        return escolaConcluida;
    }

    public void setEscolaConcluida(String escolaConcluida) {
        this.escolaConcluida = escolaConcluida;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }
  
}// fim metodo
