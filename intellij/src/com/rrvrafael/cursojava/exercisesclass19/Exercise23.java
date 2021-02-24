package com.rrvrafael.cursojava.exercisesclass19;

import java.util.Random;
import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        boolean verificar = true;
        Random random = new Random();

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = scan.nextInt();
            //vetorA[i] = random.nextInt(100);
            //vetorA[i] = (int) (Math.random() * 100);
        }

        for (int vetor: vetorA)
        {
            System.out.println(vetor);
        }

        for (int vetor: vetorA)
        {
            if (vetor % 2 != 0)
            {
                verificar = false;
                break;
            }
        }

        if (verificar)
        {
            System.out.println("Todos os valores contidos no vetor A são pares.");
        }
        else
        {
            System.out.println("Existem números ímpares no vetor A");
        }
    }
}
