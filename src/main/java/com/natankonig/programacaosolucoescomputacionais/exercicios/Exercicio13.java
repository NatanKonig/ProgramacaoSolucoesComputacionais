/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.natankonig.programacaosolucoescomputacionais.exercicios;

import javax.swing.JOptionPane;



/**
 *
 * @author natan
 */
public class Exercicio13 {
    
    public static void main(String[] args) {
        
        String inputSalario = JOptionPane.showInputDialog("Digite o salário bruto do funcionário:");
        String inputPrestacao = JOptionPane.showInputDialog("Digite o valor da prestação desejada:");

        double salarioBruto = Double.parseDouble(inputSalario);
        double valorPrestacao = Double.parseDouble(inputPrestacao);

        double prestacaoMaxima = salarioBruto * 0.3;

        if (valorPrestacao <= prestacaoMaxima) {
            JOptionPane.showMessageDialog(null, 
                "Empréstimo APROVADO!\n" +
                "Salário bruto: R$ " + String.format("%.2f", salarioBruto) + "\n" +
                "Valor da prestação: R$ " + String.format("%.2f", valorPrestacao) + "\n" +
                "Valor máximo permitido: R$ " + String.format("%.2f", prestacaoMaxima));
        } else {
            JOptionPane.showMessageDialog(null, 
                "Empréstimo NEGADO!\n" +
                "Salário bruto: R$ " + String.format("%.2f", salarioBruto) + "\n" +
                "Valor da prestação: R$ " + String.format("%.2f", valorPrestacao) + "\n" +
                "Valor máximo permitido: R$ " + String.format("%.2f", prestacaoMaxima) + "\n" +
                "A prestação não pode ultrapassar 30% do salário bruto.");
        }
        
    }
    
}
