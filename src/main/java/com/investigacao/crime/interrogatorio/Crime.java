package com.investigacao.crime.interrogatorio;


import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);
        Scanner txt2 = new Scanner(System.in);


        System.out.println("\tBem vindo");
        System.out.println("Novo registro de assassinato adicionado.");

        System.out.println("Informe abaixo os dados do falecido");

        System.out.println("Nome Completo");
        String n = txt2.nextLine();

        System.out.println("Idade");
        int i = num.nextInt();

        System.out.println("Genero");
        String g = txt.next();

        System.out.println("Data da morte");
        String d = txt.next();

        Vitima vitima1 = new Vitima(n, i, g, d);

        System.out.println("Informações da vitima: \n"+ vitima1);


        System.out.println("Informe abaixo os dados do suspeito");
        System.out.println("Nome Completo");
        n = txt2.nextLine();

        System.out.println("Idade");
        i = num.nextInt();
        Suspeito suspeito1 = new Suspeito(n, i);

        System.out.println("Interrogatório com o suspeito "+n);
        suspeito1.perguntas();
        System.out.println("Interogatorio finalizado com sucesso!");
        System.out.println("O suspeito é "+suspeito1.getClassificacao());



    }
}
