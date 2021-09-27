package br.com.zup;

public class Main {

    public static void main(String[] args) {

        //instanciando objetos
        Funcionarios funcionarios = new Funcionarios("Joao", "555555555", "123456", "Sao Paulo", 1000);
        Professores professor = new Professores("André", "77777777", "123456", "Uberlandia", 1500, "graduado", "Java");
        Professores professor1 = new Professores("Joao", "77777777", "123456", "Uberlandia", 1500, "graduado", "Java");
        Professores professor2 = new Professores("Antonio", "77777777", "123456", "Uberlandia", 1500, "graduado", "Java");
        Professores professor3 = new Professores("Vini", "77777777", "123456", "Uberlandia", 1500, "graduado", "Java");
        Professores professor4 = new Professores("Pedro", "77777777", "123456", "Uberlandia", 1500, "graduado", "Java");
        Professores professor5 = new Professores("Manoel", "77777777", "123456", "Uberlandia", 1500, "graduado", "Java");
        Administradores administrador = new Administradores("Marcos", "123456789", "15263478", "Manaus", 3500, "Diretor", "Concursado");
        Coordenadores coordenador = new Coordenadores("Sueli", "666666666", "147852", "Campinas", 2500);
        Turma turma1 = new Turma(20);


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
        professor.adicionaTurma(turma1);
        System.out.println(professor.getQtdTurmas());
        System.out.println("---------------------------------");


        //Teste do adicionar Professores para coordenadores
        System.out.println(coordenador.listaProfessores);
        coordenador.adicionaProfessor(professor);
        coordenador.professoresSupervisionados();
        System.out.println(coordenador.getQtdprofSupervisionados());
        System.out.println("---------------------------------");
        coordenador.adicionaProfessor(professor1);
        coordenador.professoresSupervisionados();
        System.out.println(coordenador.getQtdprofSupervisionados());
        System.out.println("---------------------------------");
        coordenador.adicionaProfessor(professor2);
        coordenador.professoresSupervisionados();
        System.out.println(coordenador.getQtdprofSupervisionados());
        System.out.println("---------------------------------");
        coordenador.adicionaProfessor(professor3);
        coordenador.professoresSupervisionados();
        System.out.println(coordenador.getQtdprofSupervisionados());
        System.out.println("---------------------------------");
        coordenador.adicionaProfessor(professor4);
        coordenador.professoresSupervisionados();
        System.out.println(coordenador.getQtdprofSupervisionados());
        System.out.println("---------------------------------");
        coordenador.adicionaProfessor(professor5);
        coordenador.professoresSupervisionados();
        System.out.println(coordenador.getQtdprofSupervisionados());
        System.out.println("---------------------------------");


        //

    }
}
