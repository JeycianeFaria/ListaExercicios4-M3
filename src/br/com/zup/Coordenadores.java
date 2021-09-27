package br.com.zup;

public class Coordenadores extends Funcionários {

    //atributos
    private int qtdprofSupervisionados;


    //construtor
    public Coordenadores() {
    }

    public Coordenadores(String nome, String cpf, String numRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
    }


    //getters e setters
    public int getQtdprofSupervisionados() {
        return qtdprofSupervisionados;
    }

    public void setQtdprofSupervisionados(int qtdprofSupervisionados) {
        this.qtdprofSupervisionados = qtdprofSupervisionados;
    }


}
