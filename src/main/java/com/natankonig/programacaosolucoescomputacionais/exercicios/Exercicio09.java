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
public class Exercicio09 {
    
    public static void main(String[] args) {
        
        int peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu peso em KG: "));
        
        Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua altura em metros: "));
        
        Double imc = peso / (altura * altura);
        
        JOptionPane.showMessageDialog(null, "O seu IMC é: " + String.format("%.2f", imc));
        
    }
    
}
