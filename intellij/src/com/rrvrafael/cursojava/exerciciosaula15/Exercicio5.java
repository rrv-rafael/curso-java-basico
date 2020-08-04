package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a nota 1 parcial:");
        nota1 = scan.nextDouble();

        System.out.println("Digite a nota 2 parcial:");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media == 10)
        {
            System.out.println("Aprovado com Distinção");
        }
        else if (media >= 7)
        {
            System.out.println("Aprovado");
        }
        else
        {
            System.out.println("Reprovado");
        }
    }
}
