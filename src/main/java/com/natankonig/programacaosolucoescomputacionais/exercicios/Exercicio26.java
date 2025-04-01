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
public class Exercicio26 {
    
    public static void main(String[] args) {
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números deseja inserir?"));
        
        Integer numeros[] = new Integer[quantidade];
        
        for (int i=0; i<quantidade; i++) {
            
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o "+ (i+1) +" valor: "));
            
            numeros[i] = num;
        
        }
        
        for (int i=0; i<numeros.length-1; i++) {
        
            for (int j=0; j<numeros.length-1-i; j++) {
                
                if (numeros[j] > numeros[j+1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
                
            }
        }
        
        String ordenados = "Números ordenados: ";
        
        for (Integer num : numeros) {
            ordenados += num + ", ";
        }
        
        JOptionPane.showMessageDialog(null, ordenados);
        
    }
    
}
