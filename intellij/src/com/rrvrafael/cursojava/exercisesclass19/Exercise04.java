package com.rrvrafael.cursojava.exercisesclass19;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[15];

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um valor:");
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        for (double vetor: vetorB)
        {
            System.out.println("Valores do vetor B: " + vetor);
        }
    }
}
