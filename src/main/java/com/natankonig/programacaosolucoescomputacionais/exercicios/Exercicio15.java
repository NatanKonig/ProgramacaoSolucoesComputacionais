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
public class Exercicio15 {
    
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));
        
        if (idade >= 15 && idade <= 25) {
            JOptionPane.showMessageDialog(null, nome + " voce foi aceito");
        } else {
            JOptionPane.showMessageDialog(null, nome + " voce NÃO foi aceito");
        }
        
    }
    
}
