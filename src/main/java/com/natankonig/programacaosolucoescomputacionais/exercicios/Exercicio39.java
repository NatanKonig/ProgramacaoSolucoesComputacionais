package com.natankonig.programacaosolucoescomputacionais.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author natan
 */
public class Exercicio39 {
    
    public static void main(String[] args) {
        
        int n1 = 0;
        int n2 = 0;
        int n = 0;
        
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
            n = n1 / n2;
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Voce deve digitar apenas números inteiros!");
            System.exit(1);
        }
        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "ERRO! Não é possivel dividir por ZERO!");
            System.exit(1);
        }
        
        JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + n);
    }
    
}
