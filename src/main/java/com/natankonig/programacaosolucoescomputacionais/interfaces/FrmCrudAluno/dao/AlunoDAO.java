package com.natankonig.programacaosolucoescomputacionais.interfaces.FrmCrudAluno.dao;

import com.natankonig.programacaosolucoescomputacionais.interfaces.FrmCrudAluno.model.Aluno;
import java.util.ArrayList;

public class AlunoDAO {
    
    public static ArrayList<Aluno> alunos = new ArrayList<>();
    
    public static ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    
    public static void setAlunos(ArrayList<Aluno> minhaLista) {
        AlunoDAO.alunos = minhaLista;
    }

    public static boolean addAluno(String nome, int idade, String curso, int fase) {
        int id = maiorID() + 1;
        Aluno aluno = new Aluno(id, nome, idade, curso, fase);
        alunos.add(aluno);
        return true;
    }
    
    public static boolean updateAluno(int id, String nome, int idade, String curso, int fase) {
        Aluno aluno = new Aluno(id, nome, idade, curso, fase);
        int indice = procurarIndice(id);
        alunos.set(indice, aluno);
        return true;
    }
    
    public static boolean deleteAluno(int id) {
        int indice = procurarIndice(id);
        alunos.remove(indice);
        return true;
    }
    
    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId() > maiorID) {
                maiorID = alunos.get(i).getId();
            }
        }
        return maiorID;
    }
    
    private static int procurarIndice(int id) {
        int indice = -1;
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
}
