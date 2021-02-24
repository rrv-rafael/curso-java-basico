package com.rrvrafael.cursojava.exercisesclass19;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] media = new double[10];

        for (int i = 0; i < nota1.length; i++)
        {
            System.out.println("Digite a nota 1:");
            nota1[i] = scan.nextDouble();

            System.out.println("Digite a nota 2:");
            nota2[i] = scan.nextDouble();

            media[i] = (nota1[i] + nota2[i]) / 2;
        }

        for (int i = 0; i < media.length; i++)
        {
            if (media[i] >= 7)
            {
                System.out.println("Média: " + (i + 1) + " | " + (media[i]) + " - Aprovado");
            }
            else
            {
                System.out.println("Média: " + (i + 1) + " | " + (media[i]) + " - Reprovado");
            }
        }
    }
}
