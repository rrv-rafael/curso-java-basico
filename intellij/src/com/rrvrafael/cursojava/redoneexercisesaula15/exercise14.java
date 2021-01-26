package com.rrvrafael.cursojava.redoneexercisesaula15;

import java.util.Scanner;

public class exercise14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;
        String conceito, mensagem;

        System.out.println("Informa a 1a nota:");
        nota1 = scan.nextDouble();
        System.out.println("Informe a 2a nota:");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 9)
        {
            conceito = "A";
            mensagem = "Aprovado";
        }
        else if (media >= 7.5 && media < 9)
        {
            conceito = "B";
            mensagem = "Aprovado";
        }
        else if (media >= 6 && media < 7.5)
        {
            conceito = "C";
            mensagem = "Aprovado";
        }
        else if (media >= 4 && media < 6)
        {
            conceito = "D";
            mensagem = "Reprovado";
        }
        else
        {
            conceito = "E";
            mensagem = "Reprovado";
        }

        System.out.println("Nota 1: " + nota1 + '\n' + "Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println(mensagem);
    }
}
