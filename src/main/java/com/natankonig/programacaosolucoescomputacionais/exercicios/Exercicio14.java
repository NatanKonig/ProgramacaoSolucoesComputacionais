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
public class Exercicio14 {
    
    public static void main(String[] args) {
        
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu ano de nascimento:"));
        
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano atual:"));
        
        if (anoNascimento > anoAtual) {
            JOptionPane.showMessageDialog(null, "Você inseriu algum ano incorretamente");
        } else {
            JOptionPane.showMessageDialog(null, "Voce tem " + (anoAtual - anoNascimento) + " anos");
        }
        
    }
    
}
