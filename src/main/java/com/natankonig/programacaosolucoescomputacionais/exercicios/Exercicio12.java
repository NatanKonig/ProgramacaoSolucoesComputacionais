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
public class Exercicio12 {
    
    public static void main(String[] args) {
                
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro número: "));
        
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo número: "));
        
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "O primeiro número é maior");
        } else if (n2 > n1) {
            JOptionPane.showMessageDialog(null, "O segundo número é maior");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }
        
    }
    
}
