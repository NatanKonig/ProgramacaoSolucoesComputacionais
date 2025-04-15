package com.natankonig.programacaosolucoescomputacionais.exercicios;

import com.natankonig.programacaosolucoescomputacionais.heranca.pessoa.Pessoa;

import javax.swing.*;
import java.util.ArrayList;

public class Exercicio33a {

    public static void main(String[] args) {
        Empresa xyz = new Empresa();

        PessoaFisica p1 = new PessoaFisica("Joao", "R. Laranja", "11 999119-1313", "000.000.002-72", "19723234", 12000.0);
        PessoaFisica p2 = new PessoaFisica("Pedro", "R. Amarela", "21 999119-1233", "312.532.100-22", "49744234", 6000.0);

        PessoaJuridica j1 = new PessoaJuridica("Brinquedos e Diversao", "R. Verde", "51 33821-3231", "3914.39141/0000-100", "492842", 120000);
        PessoaJuridica j2 = new PessoaJuridica("Marcenaria LTDA", "R. Marrom", "61 31111-9299", "4818.1314/0000-200", "45234", 150000);

        xyz.inserir(p1);
        xyz.inserir(p2);
        xyz.inserir(j1);
        xyz.inserir(j2);

        xyz.imprimir();

    }

    public static class Empresa {
        private ArrayList<PessoaFisica> clientesPF;
        private ArrayList<PessoaJuridica> clientesPJ;

        public Empresa() {
            clientesPF = new ArrayList<PessoaFisica>();
            clientesPJ = new ArrayList<PessoaJuridica>();
        }

        public Empresa(ArrayList<PessoaFisica> clientesPF, ArrayList<PessoaJuridica> clientesPJ) {
            this.clientesPF = clientesPF;
            this.clientesPJ = clientesPJ;
        }

        public void inserir(PessoaFisica pf) {
            clientesPF.add(pf);
        }

        public void inserir(PessoaJuridica pj) {
            clientesPJ.add(pj);
        }

        public PessoaFisica maiorFaturamentoPF() {
            PessoaFisica pf = null;
            if (clientesPF.size() > 0) {
                pf = clientesPF.get(0);
                for (PessoaFisica c : clientesPF) {
                    if (c.getSalario() > pf.getSalario()) {
                        pf = c;
                    }
                }
            }
            return pf;
        }

        public PessoaJuridica maiorFaturamentoPJ() {
            PessoaJuridica pj = null;
            if (clientesPJ.size() > 0) {
                pj = clientesPJ.get(0);
                for (PessoaJuridica c : clientesPJ) {
                    if (c.getFaturamento() > pj.getFaturamento()) {
                        pj = c;
                    }
                }
            }
            return pj;
        }

        public void imprimir() {
            JOptionPane.showMessageDialog(null, "Pessoa Fisica com maior faturamento: " + maiorFaturamentoPF().getNome()
                                                                        + ", R$ " + maiorFaturamentoPF().getSalario() +
                                                                        "\n\nPessoa Juridica com maior faturamento: " + maiorFaturamentoPJ().getNome()
                                                                        + ", R$ " + maiorFaturamentoPJ().getFaturamento()
            );
        }
    }

    public static class PessoaFisica {
        private String nome;
        private String endereco;
        private String telefone;
        private String cpf;
        private String rg;
        private double salario;

        public PessoaFisica() {
        }

        public PessoaFisica(String nome, String endereco, String telefone, String cpf, String rg, double salario) {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
            this.cpf = cpf;
            this.rg = rg;
            this.salario = salario;
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

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getRg() {
            return rg;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }

    public static class PessoaJuridica {
        private String nome;
        private String endereco;
        private String telefone;
        private String cnpj;
        private String ie;
        private double faturamento;

        public PessoaJuridica() {}

        public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String ie, double faturamento) {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
            this.cnpj = cnpj;
            this.ie = ie;
            this.faturamento = faturamento;
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

        public String getTelefone() {
            return telefone;

        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

        public String getIe() {
            return ie;
        }

        public void setIe(String ie) {
            this.ie = ie;
        }

        public double getFaturamento() {
            return faturamento;
        }

        public void setFaturamento(double faturamento) {
            this.faturamento = faturamento;
        }
    }
}
