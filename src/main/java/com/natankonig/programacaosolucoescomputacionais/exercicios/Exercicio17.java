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
public class Exercicio17 {
    
    public static void main(String[] args) {

        String mensagem = "Informe a profissão do Tibúrcio:\n\n" +
                          "e - engenheiro\n" +
                          "p - programador\n" +
                          "m - médico\n" +
                          "a - advogado\n" +
                          "d - designer";
        
        String opcao = JOptionPane.showInputDialog(null, mensagem);
        
        String profissao;
        
        if (opcao == null) {
            return;
        }
        
        opcao = opcao.toLowerCase();
        switch (opcao) {
            case "e":
                profissao = "engenheiro";
                break;
            case "p":
                profissao = "programador";
                break;
            case "m":
                profissao = "médico";
                break;
            case "a":
                profissao = "advogado";
                break;
            case "d":
                profissao = "designer";
                break;
            default:
                profissao = "DESEMPREGADO";
                break;
        }

        JOptionPane.showMessageDialog(null, "Tibúrcio é " + profissao);
    }
}