
package model;

import java.util.Date;

public class ParecerModel {
   
    
    private String assuntoParecer;
    private String interessadoParecer;
    private String matriculaAluno;
    private String texto;
    private String local;
    private Date dataOcorrido;
    private boolean concluido;
    private int numParecer;
    private String descricao;

    public ParecerModel(String assuntoParecer, String interessadoParecer, String matriculaAluno, String texto, String local, Date dataOcorrido, boolean concluido) {
        this.assuntoParecer = assuntoParecer;
        this.interessadoParecer = interessadoParecer;
        this.matriculaAluno = matriculaAluno;
        this.texto = texto;
        this.local = local;
        this.dataOcorrido = dataOcorrido;
        this.concluido = concluido;
    }

    public ParecerModel(String assuntoParecer, String interessadoParecer, String matriculaAluno, String texto, String local, Date dataOcorrido, boolean concluido, int numParecer) {
        this.assuntoParecer = assuntoParecer;
        this.interessadoParecer = interessadoParecer;
        this.matriculaAluno = matriculaAluno;
        this.texto = texto;
        this.local = local;
        this.dataOcorrido = dataOcorrido;
        this.concluido = concluido;
        this.numParecer = numParecer;
    }

    public ParecerModel(int numParecer, String descricao) {
        this.numParecer = numParecer;
        this.descricao = descricao;
    }

    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

   

  

    public ParecerModel(int numParecer) {
        this.numParecer = numParecer;
    }
    
    
    public int getNumParecer() {
        return numParecer;
    }

    public void setNumParecer(int numParecer) {
        this.numParecer = numParecer;
    }

    public String getAssuntoParecer() {
        return assuntoParecer;
    }

    public void setAssuntoParecer(String assuntoParecer) {
        this.assuntoParecer = assuntoParecer;
    }

    public String getInteressadoParecer() {
        return interessadoParecer;
    }

    public void setInteressadoParecer(String interessadoParecer) {
        this.interessadoParecer = interessadoParecer;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getDataOcorrido() {
        return dataOcorrido;
    }

    public void setDataOcorrido(Date dataOcorrido) {
        this.dataOcorrido = dataOcorrido;
    }

    public boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public ParecerModel() {
    }
    
    

}// fim classe 
