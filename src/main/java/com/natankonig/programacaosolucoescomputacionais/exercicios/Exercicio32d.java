package com.natankonig.programacaosolucoescomputacionais.exercicios;

import javax.swing.*;

public class Exercicio32d {

    public static void main(String[] args) {
        CarroPasseio carroPasseio = new CarroPasseio();
        carroPasseio.inserir();
        carroPasseio.imprimir();
    }

    public static class CarroPasseio extends Exercicio32c.Veiculo{
        private String cor;
        private String modelo;

        public CarroPasseio() {
        }

        public CarroPasseio(int peso, int velocidadeMax, double preco, String modelo, String cor) {
            super(peso, velocidadeMax, preco);
            this.modelo = modelo;
            this.cor = cor;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void inserir() {
            super.inserir();
            this.cor = JOptionPane.showInputDialog("Digite a cor: ");
            this.modelo = JOptionPane.showInputDialog("Digite o modelo: ");
        }

        public void imprimir() {
            String retorno = super.toString();
            retorno += toString();
            JOptionPane.showMessageDialog(null, retorno);
        }

        @Override
        public String toString() {
            return " cor: " + cor +
                    ", modelo: " + modelo +
                    ';';
        }
    }
}
