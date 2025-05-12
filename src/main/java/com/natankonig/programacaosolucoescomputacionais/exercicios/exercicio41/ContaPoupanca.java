/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.natankonig.programacaosolucoescomputacionais.exercicios.exercicio41;

/**
 *
 * @author natan
 */
public class ContaPoupanca extends Conta{
    
    private double juros;

    public ContaPoupanca() {
        this.juros = 0.0;
    }

    public ContaPoupanca(String nome, double saldo, double juros) {
        super(nome, saldo);
        this.juros = juros;
    }
    
    public double getSaldo() {
        return super.getSaldo() + (super.getSaldo()*juros);
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
