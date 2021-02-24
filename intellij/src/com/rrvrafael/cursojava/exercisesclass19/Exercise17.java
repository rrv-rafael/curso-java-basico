package com.rrvrafael.cursojava.exercisesclass19;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] idade = new int[10];
        int count = 0;

        for (int i = 0; i < idade.length; i++)
        {
            System.out.println("Digite uma idade:");
            idade[i] = scan.nextInt();

            if (idade[i] > 35)
            {
                count++;
            }
        }

        System.out.println(count + " pessoa(s) possuem idade superior a 35 anos.");
    }
}
