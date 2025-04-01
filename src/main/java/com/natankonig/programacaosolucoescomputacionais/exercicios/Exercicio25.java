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
public class Exercicio25 {
    
    public static void main(String[] args) {
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números deseja inserir?"));
        
        Integer numeros[] = new Integer[quantidade];
        
        for (int i=0; i<quantidade; i++) {
            
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o "+ (i+1) +" valor: "));
            
            numeros[i] = num;
        
        }
        
        Double soma = 0.0;
        
        for (Integer num : numeros) {
            soma += num;
        }
        
        Double media = soma / quantidade;
        
        JOptionPane.showMessageDialog(null, "A média dos valores é: " + media);
        
    }
    
}
