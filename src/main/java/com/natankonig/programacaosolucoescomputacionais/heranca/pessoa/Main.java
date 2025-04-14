package com.natankonig.programacaosolucoescomputacionais.heranca.pessoa;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno(1, "Juninho", 20, "Sistemas para Internet", 5);
        aluno.mostrarDados();

        Professor professor = new Professor(1, "Jair", 50, 20000, "Mestrado em segurança");
        professor.mostrarDados();
    }
}
