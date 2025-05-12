package com.natankonig.programacaosolucoescomputacionais.interfaces.ExemploFrmCalculadora.model;

public class Calculadora {

    private double valor1;
    private double valor2;

    public Calculadora() {}

    public Calculadora(double valor2, double valor1) {
        this.valor2 = valor2;
        this.valor1 = valor1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double somar() {
        return valor1 + valor2;
    }

    public double subtrair() {
        return valor1 - valor2;
    }

    public double multiplicar() {
        return valor1 * valor2;
    }

    public double dividir() {
        return valor1 / valor2;
    }
}
