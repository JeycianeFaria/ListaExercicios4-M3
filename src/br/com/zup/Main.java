package br.com.zup;

public class Main {

    public static void main(String[] args) {

        //instanciando objetos
        Funcionarios funcionarios = new Funcionarios("Joao", "555555555", "123456", "Sao Paulo", 1000);
        Professores professor = new Professores("André", "77777777", "123456", "Uberlandia", 1500, "graduado", "Java");
        Administradores administrador = new Administradores("Marcos", "123456789", "15263478", "Manaus", 3500, "Diretor", "Concursado");
        Coordenadores coordenador = new Coordenadores("Sueli", "666666666", "147852", "Campinas", 2500);

        //Teste método aumento de sálario
        System.out.println(funcionarios.getSalario());
        funcionarios.aumentoSalario();
        System.out.println(funcionarios.getSalario());
        System.out.println("---------------------------------");
        System.out.println(professor.getSalario());
        professor.aumentoSalario();
        System.out.println(professor.getSalario());
        System.out.println("---------------------------------");
        System.out.println(administrador.getSalario());
        administrador.aumentoSalario();
        System.out.println(administrador.getSalario());
        System.out.println("---------------------------------");

        //Teste sobrescrita do método aumento de sálarios para coordenadores
        System.out.println(coordenador.getSalario());
        coordenador.aumentoSalario();
        System.out.println(coordenador.getSalario());
        System.out.println("---------------------------------");

        //Teste para adicionar turma
        System.out.println(professor.getQtdTurmas());
        professor.adicionaTurma(1);
        System.out.println(professor.getQtdTurmas());



    }
}
