package com.natankonig.programacaosolucoescomputacionais.heranca.pessoa;

public class Professor extends Pessoa {

    private double salario;
    private String titulo;

    public Professor () {
    }

    public Professor(int id, String nome, int idade, double salario, String titulo) {
        super(id, nome, idade);
        this.salario = salario;
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double calcularImposto() {
        return salario * 0.05;
    }

    @Override
    public String toString() {
        String retorno = super.toString();
        return retorno +
                " salario: R$" + salario +
                ", titulo: " + titulo +
                ", imposto: R$" + calcularImposto() +
                ';';
    }
}
