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
public class Exercicio27 {
    
    public static void main(String[] args) {
        
        String nomes[] = new String[]{"Joao", "Maria", "Jose"};
        
        String buscar = JOptionPane.showInputDialog(null, "Qual nome voce deseja buscar? ");
        
        int flag = 0;
        for (int i=0; i<nomes.length; i++) {
            
            if (nomes[i].equalsIgnoreCase(buscar)) {
                JOptionPane.showMessageDialog(null, "O valor, " + buscar + ", foi encontrado na posição " + (i+1));
                flag = 1;
            }
             
        }
        
        if (flag == 0) {
            JOptionPane.showMessageDialog(null, "O valor solicitado não foi encontrado!");
        }
        
    }
    
}
