package com.rrvrafael.cursojava.exercisesclass19;

import java.util.Scanner;

public class Exercise24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        boolean verificar = true;

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um valor para o vetor A:");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0, j = vetorA.length - 1; i < vetorA.length; i++, j--)
        {
            if (vetorA[i] != vetorA[j])
            {
                verificar = false;
                break;
            }
        }

        if (verificar)
        {
            System.out.println("O vetor A é palíndromo.");
        }
        else
        {
            System.out.println("O vetor A não é palíndromo.");
        }
    }
}
