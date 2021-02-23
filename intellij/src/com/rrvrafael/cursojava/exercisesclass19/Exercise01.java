package com.rrvrafael.cursojava.exercisesclass19;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um valor:");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
        }

        for (int vetor: vetorB)
        {
            System.out.println("Valores do vetor B:" + vetor);
        }

    }
}
