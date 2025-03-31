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
public class Exercicio16 {
    
    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro número: "));
        
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo número: "));
        
        String opcao = JOptionPane.showInputDialog(null, "Digite a operação que deseja fazer com os dois números: \nA - Adição \nS - Subtração \nM - Multiplicação \nD - Divisão").toUpperCase();
        
        if (opcao.equals("A")) {
            JOptionPane.showMessageDialog(null, "Soma: " + (n1 + n2));
        } else if (opcao.equals("S")) {
            JOptionPane.showMessageDialog(null, "Subtração: " + (n1 - n2));
        } else if (opcao.equals("M")) {
            JOptionPane.showMessageDialog(null, "Multiplicação: " + (n1 * n2));
        } else if (opcao.equals("D")) {
            if (n2 == 0) {
                JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Divisão: " + ((double)n1 / n2));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Opção indisponível", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
