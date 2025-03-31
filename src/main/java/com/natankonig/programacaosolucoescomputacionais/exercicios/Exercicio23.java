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
public class Exercicio23 {
    
    public static void main(String[] args) {
        
        int soma = 0;
        
        int inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número de inicio: "));
        
        int fim = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número de fim: "));
        
        
        for (int i = inicio; i <= fim; i++) {
            soma += i;            
            System.out.println(soma);
        }
        
        JOptionPane.showMessageDialog(null, "A média dentre os valores de " + inicio + " a " + fim +" é: " + (soma / (fim - inicio)));
        
    }
    
}
