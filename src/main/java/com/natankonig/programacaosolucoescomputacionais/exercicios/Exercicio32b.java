package com.natankonig.programacaosolucoescomputacionais.exercicios;

import sun.rmi.registry.RegistryImpl_Stub;

import javax.swing.*;

public class Exercicio32b {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        restaurante.inserir();
        restaurante.imprimir();
    }

    public static class Restaurante extends Exercicio32a.Empresa {
        private String tipoComida;
        private double precoMedio;

        public Restaurante() {
        }

        public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String telefone, String tipoComida, double precoMedio) {
            super(nome, endereco, cidade, estado, cep, telefone);
            this.tipoComida = tipoComida;
            this.precoMedio = precoMedio;
        }

        public String getTipoComida() {
            return tipoComida;
        }

        public void setTipoComida(String tipoComida) {
            this.tipoComida = tipoComida;
        }

        public double getPrecoMedio() {
            return precoMedio;
        }

        public void setPrecoMedio(double precoMedio) {
            this.precoMedio = precoMedio;
        }

        public void inserir() {
            super.inserir();
            this.tipoComida = JOptionPane.showInputDialog("Digite o tipo de comida: ");
            this.precoMedio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor médio dos pratos: R$"));
        }

        public void imprimir() {
            String retorno = super.toString();
            retorno += toString();
            JOptionPane.showMessageDialog(null, retorno);
        }

        @Override
        public String toString() {
            return "\n\nDados Restaurante\n" +
                    "tipo de comida: " + tipoComida +
                    ", precoMedio: R$" + precoMedio +
                    ';';
        }
    }
}
