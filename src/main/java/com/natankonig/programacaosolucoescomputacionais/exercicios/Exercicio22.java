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
public class Exercicio22 {
    
    public static void main(String[] args) {
        
        int soma = 0;
        
        for (int i = 0; i <= 1000; i++) {
            soma += i;            
        }
        
        JOptionPane.showMessageDialog(null, "A média dentre os valores de 1 a 1000 é: " + (soma / 1000));
        
    }
    
}
