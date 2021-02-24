package com.rrvrafael.cursojava.exercisesclass19;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaMenor = 0, somaIgual = 0, somaMaior = 0, count = 0;
        double media;

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um valor para o vetor A:");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] < 15)
            {
                somaMenor += vetorA[i];
            }
            else if (vetorA[i] == 15)
            {
                somaIgual += vetorA[i];
            }
            else
            {
                somaMaior += vetorA[i];
                count++;
            }
        }

        media = (double) somaMaior / count;

        System.out.println("Soma dos elementos armazenados no vetor A que são inferiores a 15: " + somaMenor);
        System.out.println("Soma dos elementos armazenados no vetor A que são iguais a 15: " + somaIgual);
        System.out.println("Média dos elementos armazenados no vetor A que são superiores a 15: " + media);
    }
}
