package com.natankonig.programacaosolucoescomputacionais.exercicios;

import javax.swing.*;

public class Exercicio32e {

    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao();
        caminhao.inserir();
        caminhao.imprimir();
    }

    public static class Caminhao extends Exercicio32d.CarroPasseio{
        private int cargaMaxima;
        private double alturaMax;
        private int comprimento;

        public Caminhao() {
        }

        public Caminhao(int peso, int velocidadeMax, double preco, String modelo, String cor, int cargaMaxima, double alturaMax, int comprimento) {
            super(peso, velocidadeMax, preco, modelo, cor);
            this.cargaMaxima = cargaMaxima;
            this.alturaMax = alturaMax;
            this.comprimento = comprimento;
        }

        public int getCargaMaxima() {
            return cargaMaxima;
        }

        public void setCargaMaxima(int cargaMaxima) {
            this.cargaMaxima = cargaMaxima;
        }

        public double getAlturaMax() {
            return alturaMax;
        }

        public void setAlturaMax(double alturaMax) {
            this.alturaMax = alturaMax;
        }

        public int getComprimento() {
            return comprimento;
        }

        public void setComprimento(int comprimento) {
            this.comprimento = comprimento;
        }

        public void inserir() {
            super.inserir();
            this.cargaMaxima = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga maxima em KG: "));
            this.alturaMax = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura maxima em M: "));
            this.comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite a comprimento em M: "));
        }

        public void imprimir() {
            String retorno = super.toString();
            retorno += toString();
            JOptionPane.showMessageDialog(null, retorno);
        }

        @Override
        public String toString() {
            return " carga maxima: " + cargaMaxima +
                    "KG, altura maxima: " + alturaMax +
                    "M, comprimento: " + comprimento +
                    "M;";
        }
    }
}
