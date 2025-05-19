package com.natankonig.programacaosolucoescomputacionais.interfaces.ExemploFrmCalculadora;

import com.formdev.flatlaf.FlatLightLaf;
import com.natankonig.programacaosolucoescomputacionais.interfaces.ExemploFrmCalculadora.view.FrmCalculadora;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            FrmCalculadora janela = new FrmCalculadora();
            janela.setVisible(true);
        });
    }
}
