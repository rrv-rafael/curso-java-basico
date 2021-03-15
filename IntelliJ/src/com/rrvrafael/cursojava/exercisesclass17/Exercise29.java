package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, count = 0;

        System.out.println("Digite um número inteiro: ");
        numero = scan.nextInt();

        for (int i = 1; i <= numero; i++)
        {
            count = 0;

            for (int j = 1; j <= numero; j++)
            {
                if (i % j == 0)
                {
                    count++;
                }

                if (count > 2)
                {
                    break;
                }
            }

            if (count == 2)
            {
                System.out.println(i);
            }
        }
    }
}