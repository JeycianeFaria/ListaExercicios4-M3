package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Professores extends Funcionarios {

    //atributos
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdTotalAlunos;
    private int qtdTurmas;
    public Turma turma;
    public List<Turma> listaTurmas = new ArrayList<>();


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

    public int getQtdTurmas() {
        qtdTurmas = listaTurmas.size();
        return qtdTurmas;
    }


    //Métodos
    //Adiciona Turma a lista
    public void adicionaTurma(Turma turma){
        //colocar if para limitar qtds
        listaTurmas.add(turma);
    }

    //qtdTotalAlunos
    public int qtdTotalAlunos(){
        qtdTotalAlunos = 0;
        for (Turma referencia:listaTurmas){
            qtdTotalAlunos = qtdTotalAlunos + referencia.getQtdDeAlunos();
        }
        return  qtdTotalAlunos;
    }

    //Lista de Exibição


}
