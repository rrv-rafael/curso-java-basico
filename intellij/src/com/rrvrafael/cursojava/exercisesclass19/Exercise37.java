package com.rrvrafael.cursojava.exercisesclass19;

public class Exercise37 {

    public static void main(String[] args) {

        int[] vetorA = new int[15];
        double[] vetorB = new double[15];

        System.out.println("Elementos do vetor A:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = i + 1;

            System.out.print(vetorA[i] + " ");

            vetorB[i] = vetorA[i];

            for (int j = 2; j < vetorA[i]; j++)
            {
                vetorB[i] *= j;
            }
        }

        System.out.println("\n\nElementos do vetor B:");

        for (double vetor: vetorB)
        {
            System.out.print(vetor + " ");
        }
    }
}
