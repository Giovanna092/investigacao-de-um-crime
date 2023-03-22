package com.investigacao.crime.interrogatorio;

public class Vitima {
    private String nome;
    private int idade;
    private String genero;
    private String diaObito;

    public Vitima(String nome, int idade, String genero, String diaObito) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.diaObito = diaObito;
    }

    @Override
    public String toString() {
        return "[nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                ", data do falecimento='" + diaObito + '\'' +
                "]";
    }
}
