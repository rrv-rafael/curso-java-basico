package com.rrvrafael.cursojava.exercisesclass19;

import java.util.Random;

public class Exercise25 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        Random random = new Random();

        System.out.println("Valores do vetor A:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = random.nextInt(100);

            if (vetorA[i] % 2 == 0)
            {
                vetorB[i] = 1;
            }
            else
            {
                vetorB[i] = 0;
            }

            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nValores do vetor B:");

        for (int vetor: vetorB)
        {
            System.out.print(vetor + " ");
        }
    }
}
