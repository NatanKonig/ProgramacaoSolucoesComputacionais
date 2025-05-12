/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.natankonig.programacaosolucoescomputacionais.exercicios.exercicio41;

/**
 *
 * @author natan
 */
public class Conta {
    
    private String nome;
    private double saldo;
    
    public Conta() {
        this.nome = "";
        this.saldo = 0.0;
    }

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDeposito(double valor) {
        this.saldo += valor;
    }
    
    
}
