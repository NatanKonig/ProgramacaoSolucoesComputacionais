/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.natankonig.programacaosolucoescomputacionais.exercicios.exercicio41;

import javax.swing.JOptionPane;

/**
 *
 * @author natan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Conta conta = null;
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o que voce deseja fazer:\n\n1 - Criar uma conta Corrente\n2 - Criar uma conta Poupança"));

        if (opcao == 1) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome da conta Corrente: ");
            double taxaServico = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a taxa de serviço da conta (ex: 0.05): "));
            
            conta = new ContaCorrente(nome, 0.0, taxaServico);
        }
        else if (opcao == 2) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome da conta Poupança: ");
            double taxaJuros = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a % de juros da conta (ex: 0.05): "));
            
            conta = new ContaPoupanca(nome, 0.0, taxaJuros);
        }
        else {
            JOptionPane.showMessageDialog(null, "A opção inserida não foi encontrada! escolha entre 1 ou 2!!!!");
        }
        
        while (opcao != 0) {
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o que voce deseja fazer:\n\n0 - Sair\n1 -  Consultar saldo\n2 - Depositar dinheiro"));
        
        if (opcao == 1) {
            JOptionPane.showMessageDialog(null, "O saldo da sua conta " + conta.getNome() + " é: R$" + conta.getSaldo());
        }
        else if (opcao == 2) {
            double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser depositado (ex 50.0): R$"));
            conta.setDeposito(saldo);
        }
        
        }
    }
    
}
