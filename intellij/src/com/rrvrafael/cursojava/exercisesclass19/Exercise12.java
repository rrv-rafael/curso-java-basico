package com.rrvrafael.cursojava.exercisesclass19;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um valor para o vetor A:");
            vetorA[i] = scan.nextInt();

            soma += vetorA[i];
        }

        System.out.println("Soma dos elementos do vetor A: " + soma);
    }
}
