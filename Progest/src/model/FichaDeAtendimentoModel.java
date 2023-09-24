package model;

public class FichaDeAtendimentoModel {
    private String camponome;
    private String RG;
    private String dataNascimento;
    private String escolaEmQueConcluiuEnsinoMedio;
    private String endereco;
    private String bairro;
    private String celularMae;
    private String celularPai;
    private String celularAvos;
    private String celularOutros;
    private String emailMae;
    private String emailPai;
    private String estadoCivil;
    private String responsavelFinanceiro;
    private String tipoEscola;
    private String anoDeConclusao;
    private String escolaEmQueConcluiuEnsinoFundamental;
    private String nomeResponsavel;
    private String celularResponsavel;
    private String emailResponsavel;
    private String observacoes;
    private String alunoCelular;
    private String campoNome;
    private String nomeMae;
    private String nomePai;

public FichaDeAtendimentoModel(
    String RG, String alunoCelular, String anoDeConclusao, String bairro, String campoNome, String celularAvos, String celularMae, String celularOutros,
    String celularPai, String dataNascimento, String emailMae, String emailPai, String endereco, String escolaEmQueConcluiuEnsinoFundamental, String nomeMae, String nomePai) {
    this.RG = RG;
    this.alunoCelular = alunoCelular;
    this.anoDeConclusao = anoDeConclusao;
    this.bairro = bairro;
    this.campoNome = campoNome;
    this.celularAvos = celularAvos;
    this.celularMae = celularMae;
    this.celularOutros = celularOutros;
    this.celularPai = celularPai;
    this.dataNascimento = dataNascimento;
    this.emailMae = emailMae;
    this.emailPai = emailPai;
    this.endereco = endereco;
    this.escolaEmQueConcluiuEnsinoFundamental = escolaEmQueConcluiuEnsinoFundamental;
    this.nomeMae = nomeMae;
    this.nomePai = nomePai;

}

    public String getCamponome() {
        return camponome;
    }

    public void setCamponome(String camponome) {
        this.camponome = camponome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEscolaEmQueConcluiuEnsinoMedio() {
        return escolaEmQueConcluiuEnsinoMedio;
    }

    public void setEscolaEmQueConcluiuEnsinoMedio(String escolaEmQueConcluiuEnsinoMedio) {
        this.escolaEmQueConcluiuEnsinoMedio = escolaEmQueConcluiuEnsinoMedio;
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

    public String getCelularMae() {
        return celularMae;
    }

    public void setCelularMae(String celularMae) {
        this.celularMae = celularMae;
    }

    public String getCelularPai() {
        return celularPai;
    }

    public void setCelularPai(String celularPai) {
        this.celularPai = celularPai;
    }

    public String getCelularAvos() {
        return celularAvos;
    }

    public void setCelularAvos(String celularAvos) {
        this.celularAvos = celularAvos;
    }

    public String getCelularOutros() {
        return celularOutros;
    }

    public void setCelularOutros(String celularOutros) {
        this.celularOutros = celularOutros;
    }

    public String getEmailMae() {
        return emailMae;
    }

    public void setEmailMae(String emailMae) {
        this.emailMae = emailMae;
    }

    public String getEmailPai() {
        return emailPai;
    }

    public void setEmailPai(String emailPai) {
        this.emailPai = emailPai;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getResponsavelFinanceiro() {
        return responsavelFinanceiro;
    }

    public void setResponsavelFinanceiro(String responsavelFinanceiro) {
        this.responsavelFinanceiro = responsavelFinanceiro;
    }

    public String getTipoEscola() {
        return tipoEscola;
    }

    public void setTipoEscola(String tipoEscola) {
        this.tipoEscola = tipoEscola;
    }

    public String getAnoDeConclusao() {
        return anoDeConclusao;
    }

    public void setAnoDeConclusao(String anoDeConclusao) {
        this.anoDeConclusao = anoDeConclusao;
    }

    public String getEscolaEmQueConcluiuEnsinoFundamental() {
        return escolaEmQueConcluiuEnsinoFundamental;
    }

    public void setEscolaEmQueConcluiuEnsinoFundamental(String escolaEmQueConcluiuEnsinoFundamental) {
        this.escolaEmQueConcluiuEnsinoFundamental = escolaEmQueConcluiuEnsinoFundamental;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getCelularResponsavel() {
        return celularResponsavel;
    }

    public void setCelularResponsavel(String celularResponsavel) {
        this.celularResponsavel = celularResponsavel;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getAlunoCelular() {
        return alunoCelular;
    }

    public void setAlunoCelular(String alunoCelular) {
        this.alunoCelular = alunoCelular;
    }

    public String getCampoNome() {
        return campoNome;
    }

    public void setCampoNome(String campoNome) {
        this.campoNome = campoNome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
}