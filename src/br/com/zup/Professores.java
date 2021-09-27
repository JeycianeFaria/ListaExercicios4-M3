package br.com.zup;

public class Professores extends Funcionários{

    //atributos
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;


    //construtor
    public Professores() {
    }

    public Professores(String nome, String cpf, String numRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplinaMinistrada) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
    }


    //getters e setters
    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

}
