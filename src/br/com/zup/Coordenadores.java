package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {

    //atributos
    private int qtdprofSupervisionados;
    public List<Professores> professoresSupervisionados = new ArrayList<>();


    //construtor
    public Coordenadores() {
    }

    public Coordenadores(String nome, String cpf, String numRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
    }


    //getters e setters
    public int getQtdprofSupervisionados() {
        qtdprofSupervisionados = professoresSupervisionados.size();
        return qtdprofSupervisionados;
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

    //adiciona professores a Lista
    public void adicionaProfessor(Professores professor){

        if (professoresSupervisionados.size() < 5){
            professoresSupervisionados.add(professor);
        }else{
            System.out.println("Coordenador com número máximo de professores supervisionados atingido!!");
        }

    }

    //exibir Lista de Professores Supervisionados
    public void listaProfessoresSupervisionados(){
        for (Professores referencia : professoresSupervisionados){
            System.out.println("Professor: " + referencia.getNome());
        }
    }

}
