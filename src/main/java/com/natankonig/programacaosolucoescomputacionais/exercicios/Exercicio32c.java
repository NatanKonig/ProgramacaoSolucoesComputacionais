package com.natankonig.programacaosolucoescomputacionais.exercicios;

import javax.swing.*;

public class Exercicio32c {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.inserir();
        veiculo.imprimir();
    }

    public static class Veiculo {
        private int peso;
        private int velocidadeMax;
        private double preco;

        public Veiculo() {
        }

        public Veiculo(int peso, int velocidadeMax, double preco) {
            this.peso = peso;
            this.velocidadeMax = velocidadeMax;
            this.preco = preco;
        }

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        public int getVelocidadeMax() {
            return velocidadeMax;
        }

        public void setVelocidadeMax(int velocidadeMax) {
            this.velocidadeMax = velocidadeMax;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public void inserir() {
            this.peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso do veiculo: "));
            this.velocidadeMax = Integer.parseInt(JOptionPane.showInputDialog("Digite o velocidade maxima: "));
            this.preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do veiculo: R$"));
        }

        public void imprimir() {
            JOptionPane.showMessageDialog(null, toString());
        }

        @Override
        public String toString() {
            return "Dados do veiculo\n" +
                    "peso: " + peso +
                    "KG, velocidade maxima: " + velocidadeMax +
                    "KM/H, preco: R$ " + preco +
                    ';';
        }
    }
}
