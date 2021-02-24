package com.rrvrafael.cursojava.exercisesclass19;

import java.util.Random;

public class Exercise32 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = random.nextInt(10) + 1;
        }

        for (int vetor: vetorA)
        {
            System.out.println("\nTabuada do número: " + vetor);

            for (int j = 1; j <= 10; j++)
            {
                System.out.println(vetor + " * " + j + " = " + (vetor * j));
            }
        }
    }
}
