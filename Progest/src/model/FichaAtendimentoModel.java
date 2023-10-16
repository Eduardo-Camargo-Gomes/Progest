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
   
    private Date dataNascimento;
    private String telefone;
    private String rg;
    private String endereco;
    private String bairro;
    private String nomePai;
     private String nomeMae;
    private String emailPai;
      private String emailMae;
    private String estadoCivil;
    private String moraCom;
    private String telefonePai;
      private String telefoneMae;
    private String escolaConcluida;
    private String tipoEscola;
    private int anoConclusao;
    
    private Date dataAcesso;
     private Date dataModificacao;
      private Date dataCriacao;
      private Time horaAcesso;
      private Time horaModificacao;
     private boolean concluido;

    public boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
     
     
     
     

    

    public FichaAtendimentoModel(String nome, Date dataNascimento, String telefone, String rg, String endereco, String bairro, String nomePai, String nomeMae, String emailPai, String emailMae, String estadoCivil, String moraCom, String telefonePai, String telefoneMae, String escolaConcluida, String tipoEscola, int anoConclusao, boolean concluido ) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.rg = rg;
        this.endereco = endereco;
        this.bairro = bairro;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.emailPai = emailPai;
        this.emailMae = emailMae;
        this.estadoCivil = estadoCivil;
        this.moraCom = moraCom;
        this.telefonePai = telefonePai;
        this.telefoneMae = telefoneMae;
        this.escolaConcluida = escolaConcluida;
        this.tipoEscola = tipoEscola;
        this.anoConclusao = anoConclusao;
        this.concluido = concluido;
    }// fim construtor
    
    

    public FichaAtendimentoModel(String nome, Date dataNascimento, String telefone, String rg, String endereco, String bairro, String nomePai, String nomeMae, String emailPai, String emailMae, String estadoCivil, String telefonePai, String telefoneMae, String escolaConcluida, int anoConclusao, boolean concluido) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.rg = rg;
        this.endereco = endereco;
        this.bairro = bairro;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.emailPai = emailPai;
        this.emailMae = emailMae;
        this.estadoCivil = estadoCivil;
        this.telefonePai = telefonePai;
        this.telefoneMae = telefoneMae;
        this.escolaConcluida = escolaConcluida;
        this.anoConclusao = anoConclusao;
        this.concluido = concluido;
    }// fim construtor sem mora com

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getTipoEscola() {
        return tipoEscola;
    }

    public void setTipoEscola(String tipoEscola) {
        this.tipoEscola = tipoEscola;
    }
    
    

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getEmailPai() {
        return emailPai;
    }

    public void setEmailPai(String emailPai) {
        this.emailPai = emailPai;
    }

    public String getEmailMae() {
        return emailMae;
    }

    public void setEmailMae(String emailMae) {
        this.emailMae = emailMae;
    }

    public String getTelefonePai() {
        return telefonePai;
    }

    public void setTelefonePai(String telefonePai) {
        this.telefonePai = telefonePai;
    }

    public String getTelefoneMae() {
        return telefoneMae;
    }

    public void setTelefoneMae(String telefoneMae) {
        this.telefoneMae = telefoneMae;
    }
    
    
      
      
      

   /* public FichaAtendimentoModel(String nome, Date dataNascimento, String telefone, String rg, String endereco, String bairro, String nomeResponsavel, String emailResponsavel, String estadoCivil, String moraCom, String telefoneResponsavel, String escolaConcluida, int anoConclusao) {
        this.nome = nome;
        
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
    }// fim construtor*/
    
     
    

    public FichaAtendimentoModel( String nome, Date dataNascimento, String telefone, String rg, String endereco, String bairro, String nomePai, String nomeMae, String emailPai, String emailMae, String estadoCivil, String moraCom, String telefonePai, String telefoneMae, String escolaConcluida, String tipoEscola, int anoConclusao, int numeroFicha, boolean concluido) {
       
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.rg = rg;
        this.endereco = endereco;
        this.bairro = bairro;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.emailPai = emailPai;
        this.emailMae = emailMae;
        this.estadoCivil = estadoCivil;
        this.moraCom = moraCom;
        this.telefonePai = telefonePai;
        this.telefoneMae = telefoneMae;
        this.escolaConcluida = escolaConcluida;
        this.tipoEscola = tipoEscola;
        this.anoConclusao = anoConclusao;
         this.numeroFicha = numeroFicha;
         this.concluido = concluido;
    }

    public FichaAtendimentoModel(int numeroFicha) {
        this.numeroFicha = numeroFicha;
    } // fim construtor 2
    
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
