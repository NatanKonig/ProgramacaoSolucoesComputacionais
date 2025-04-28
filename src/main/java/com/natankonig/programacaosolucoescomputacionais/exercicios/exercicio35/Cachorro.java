package com.natankonig.programacaosolucoescomputacionais.exercicios.exercicio35;

import javax.swing.*;

public class Cachorro implements Animal {

    public void fazerSom() {
        JOptionPane.showMessageDialog(null, "O cachorro esta latindo!");
    }

    public void mover() {
        JOptionPane.showMessageDialog(null, "O cachorro esta andando!");
    }
}
