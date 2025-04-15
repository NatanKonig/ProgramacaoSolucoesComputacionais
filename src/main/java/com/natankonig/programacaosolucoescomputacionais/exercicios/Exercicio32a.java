package com.natankonig.programacaosolucoescomputacionais.exercicios;

import javax.swing.*;

public class Exercicio32a {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.inserir();
        empresa.imprimir();
    }

    public static class Empresa {
        private String nome;
        private String endereco;
        private String cidade;
        private String estado;
        private String cep;
        private String telefone;

        public Empresa () {

        }

        public Empresa(String nome, String endereco, String cidade, String estado, String cep, String telefone) {
            this.nome = nome;
            this.endereco = endereco;
            this.cidade = cidade;
            this.estado = estado;
            this.cep = cep;
            this.telefone = telefone;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public void inserir() {
            this.nome = JOptionPane.showInputDialog("Digite o nome do empresa: ");
            this.endereco = JOptionPane.showInputDialog("Digite o endereço: ");
            this.cidade = JOptionPane.showInputDialog("Digite a cidade: ");
            this.estado = JOptionPane.showInputDialog("Digite o estado: ");
            this.cep = JOptionPane.showInputDialog("Digite o CEP: ");
            this.telefone = JOptionPane.showInputDialog("Digite o telefone: ");
        }

        public void imprimir() {
            JOptionPane.showMessageDialog(null, toString());
        }

        @Override
        public String toString() {
            return "Dados da Empresa\n" +
                    "nome: " + nome +
                    ", endereco: " + endereco +
                    ", cidade: " + cidade +
                    ", estado: " + estado +
                    ", cep: " + cep +
                    ", telefone: " + telefone +
                    ';';
        }
    }
}

