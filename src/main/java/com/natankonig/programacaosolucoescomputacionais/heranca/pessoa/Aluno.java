package com.natankonig.programacaosolucoescomputacionais.heranca.pessoa;

public class Aluno extends Pessoa {

    private String curso;
    private int fase;

    public Aluno() {
    }

    public Aluno(int id, String nome, int idade, String curso, int fase) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
    }

    public boolean verificarFormando() {
        return this.fase == 10;
    }

    @Override
    public String toString() {
        String retorno = super.toString();
        return retorno  +
                " curso: " + curso +
                ", fase: " + fase +
                ", formando: " + verificarFormando() +
                ';';
    }
}
