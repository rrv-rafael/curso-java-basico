package com.rrvrafael.cursojava.exercisesclass19;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int count = 0;

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um valor para o vetor A:");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0)
            {
                count++;
            }
        }

        if (count > 1)
        {
            System.out.println("O vetor A tem " + count + " números pares.");
        }
        else
        {
            System.out.println("O vetor A tem " + count + " número par.");
        }
    }
}
