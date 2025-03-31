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
public class Exercicio18 {
    
    public static void main(String[] args) {
        
        String nomeCliente = JOptionPane.showInputDialog(null, "Digite o nome do cliente:");
        
        if (nomeCliente == null) {
            return;
        }

        double preco = 0.0;
        try {
            String precoStr = JOptionPane.showInputDialog(null, "Digite o preço do produto:");
            if (precoStr == null) {
                return;
            }
            preco = Double.parseDouble(precoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Preço inválido! O programa será encerrado.", 
                                         "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String categoriaStr = JOptionPane.showInputDialog(null, 
                             "Digite a categoria do produto (A, B, C, D ou E):");
        
        if (categoriaStr == null) {
            return;
        }
        
        categoriaStr = categoriaStr.toUpperCase();
        char categoria = categoriaStr.length() > 0 ? categoriaStr.charAt(0) : ' ';

        double percentualDesconto = 0.0;
        
        switch (categoria) {
            case 'A':
                percentualDesconto = 0.10; // 10%
                break;
            case 'B':
                percentualDesconto = 0.15; // 15%
                break;
            case 'C':
                percentualDesconto = 0.20; // 20%
                break;
            case 'D':
                percentualDesconto = 0.25; // 25%
                break;
            case 'E':
                percentualDesconto = 0.50; // 50%
                break;
            default:
                JOptionPane.showMessageDialog(null, "Categoria inválida! O programa será encerrado.", 
                                             "Erro", JOptionPane.ERROR_MESSAGE);
                return;
        }

        double valorDesconto = preco * percentualDesconto;
        double precoFinal = preco - valorDesconto;

        String mensagem = "Cliente: " + nomeCliente + 
                          "\nPreço original: R$ " + String.format("%.2f", preco) + 
                          "\nCategoria: " + categoria + 
                          "\nDesconto: " + (int)(percentualDesconto * 100) + "%" +
                          "\nValor do desconto: R$ " + String.format("%.2f", valorDesconto) + 
                          "\nPreço final: R$ " + String.format("%.2f", precoFinal);
        
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
