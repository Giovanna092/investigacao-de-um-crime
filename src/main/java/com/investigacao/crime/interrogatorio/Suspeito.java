package com.investigacao.crime.interrogatorio;

import java.util.Scanner;

public class Suspeito implements Perguntas {
    private String nome;
    private int idade;

    private String[] respostasPerguntas = new String[5];
    private String classificacao;

    public Suspeito() {}

    public Suspeito(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public void perguntas() {
        char teste;
        Scanner leia = new Scanner(System.in);
        System.out.println("Telefonou para a vítima? (s/n)");
        respostasPerguntas[0] = leia.next();

        System.out.println("Esteve no local do crime? (s/n)");
        respostasPerguntas[1] = leia.next();

        System.out.println("Mora perto da vítima? (s/n)");
        respostasPerguntas[2] = leia.next();

        System.out.println("Devia para a vítima? (s/n)");
        respostasPerguntas[3] = leia.next();

        System.out.println("Já trabalhou com a vítima? (s/n)");
        respostasPerguntas[4] = leia.next();

        classificacao();
        leia.close();
    }

    @Override
    public void classificacao(){
        /*
         * Esse método analisa as respostas afirmativas
         * e classifica o suspeito dependedo da
         * quantidade de respostas que ele tiver
         */

        int resp=0;
        for (String respostasPergunta : respostasPerguntas) {
            if (respostasPergunta == "s") resp++;
        }

        if (resp < 3){
            if (resp == 2) this.classificacao = "Suspeito";
            else this.classificacao = "Inocente";

        } else if(resp < 5){
            this.classificacao = "Cúmplice";

        } else {
            this.classificacao = "Culpado";
        }

    }
}
