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
public class Exercicio08 {
    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero: "));
        
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero: "));
        
        JOptionPane.showMessageDialog(null, "A soma dos valores é: " + (n1 + n2));
        
    }
}
