package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fatorial;

        System.out.println("Digite o número inteiro que deseja calcular o fatorial:");
        fatorial = scan.nextInt();

        System.out.println("Fatorial de: " + fatorial);
        System.out.print(fatorial + "! = " + fatorial + " . ");

        for (int i = fatorial - 1; i > 0; i--)
        {
            if (i > 1)
            {
                System.out.print(i + " . ");
            }
            else
            {
                System.out.print(i + " = " + fatorial);
            }

            fatorial *= i;
        }
    }
}
