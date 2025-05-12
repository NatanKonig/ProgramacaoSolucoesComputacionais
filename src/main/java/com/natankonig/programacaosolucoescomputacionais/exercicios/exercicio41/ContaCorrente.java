/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.natankonig.programacaosolucoescomputacionais.exercicios.exercicio41;

/**
 *
 * @author natan
 */
public class ContaCorrente extends Conta {
    
    private double taxaServico;

    public ContaCorrente() {
        this.taxaServico = 0.0;
    }

    public ContaCorrente(String nome, double saldo, double taxaServico) {
        super(nome, saldo);
        this.taxaServico = taxaServico;
    }
    
    public double getSaldo() {
        return super.getSaldo() - this.taxaServico; 
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    } 
}
