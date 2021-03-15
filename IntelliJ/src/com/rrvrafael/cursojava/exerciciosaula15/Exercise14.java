package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;
        String conceito;

        System.out.println("Digite a 1a nota parcial:");
        nota1 = scan.nextDouble();
        System.out.println("Digite a 2a nota parcial:");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10)
        {
            conceito = "A";
        }
        else if (media >= 7.5 && media < 9)
        {
            conceito = "B";
        }
        else if (media >= 6 && media < 7.5)
        {
            conceito = "C";
        }
        else if (media >= 4 && media < 6)
        {
            conceito = "D";
        }
        else
        {
            conceito = "E";
        }

        System.out.println("Nota 1: " + nota1 + " | " + "Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C"))
        {
            System.out.println("APROVADO");
        }
        else
        {
            System.out.println("REPROVADO");
        }
    }
}