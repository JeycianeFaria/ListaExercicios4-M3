package br.com.zup;

public class Coordenadores extends Funcionarios {

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


    //Métodos
    //Aumento de sálario para coordenadores
    @Override
    public void aumentoSalario(){
        double porcentagemAumento = 0.05;
        double aumento = getSalario() * porcentagemAumento;
        double salarioAtualizado = getSalario() + aumento;
        setSalario(salarioAtualizado);
    }
}
