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
public class Exercicio10 {
    
    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro número: "));
        
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo número: "));
        
        int soma = n1 + n2;
        
        if (soma > 10 ) {
            JOptionPane.showMessageDialog(null, "A Soma dos valores é: " + soma);
        }   
    }
    
}
