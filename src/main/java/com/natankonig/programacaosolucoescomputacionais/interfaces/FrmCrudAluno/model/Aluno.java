package com.natankonig.programacaosolucoescomputacionais.interfaces.FrmCrudAluno.model;

public class Aluno {
    private int id;
    private String nome;
    private int idade;
    private String curso;
    private int fase;

    public Aluno() {
        this(0, "", 0, "", 0);
    }

    public Aluno(int id, String nome, int idade, String curso, int fase) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.fase = fase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
    
    
}
