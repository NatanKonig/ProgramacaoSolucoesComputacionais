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
public class Exercicio11 {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número: "));
        
        if ((n % 2) == 0) {
            JOptionPane.showMessageDialog(null, "O número é multiplo de 2");
        } else {
            JOptionPane.showMessageDialog(null, "O numero NÃO é multiplo de 2");
        }
        
    }
    
}
