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
public class Exercicio19 {
    
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
        
        int repeticoes = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas vezes deseja exibir essa frase: "));
        
        for (int i = 0; i < repeticoes; i++) {
            JOptionPane.showMessageDialog(null, frase);
        }
        
    }
    
}
