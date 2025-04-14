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
public class Exercicio28 {
    
    public static void main(String[] args) {
        
        int matriz[][] = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        
        
        //A
        
        int soma = 0;
        for (int linha[] : matriz) {
            soma += linha[0];
        }
        JOptionPane.showMessageDialog(null, "A soma dos valores da primeira coluna é: " + soma);
        
        //B
        int soma[] = new Integer[]{0,0,0};
        for (int l=0; l<3; l++) {
            for (int c=0; c<3; c++) {
                if (c==0) {
                    soma[0] += matriz[l][c];
                }
                else if (c==1) {
                    soma[1] += matriz[l][c];
                }
                else if (c==2) {
                    soma[2] += matriz[l][c]
                }
            }
        }
        
        for (int num : soma) {
            
        }
    }
    
}
