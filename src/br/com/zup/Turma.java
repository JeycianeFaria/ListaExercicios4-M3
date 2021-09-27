package br.com.zup;

public class Turma {

    //atributos
    private int qtdDeAlunos;


    //construtor
    public  Turma(){

    }

    public Turma(int qtdDeAlunos) {
        this.qtdDeAlunos = qtdDeAlunos;
    }


    //getters e setters

    public int getQtdDeAlunos() {
        return qtdDeAlunos;
    }

    public void setQtdDeAlunos(int qtdDeAlunos) {
        this.qtdDeAlunos = qtdDeAlunos;
    }

}
