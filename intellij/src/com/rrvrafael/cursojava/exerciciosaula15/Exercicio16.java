package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a, b, c, delta;

        System.out.println("Digite o valor de a:");
        a = scan.nextDouble();

        if (a != 0)
        {
            System.out.println("Digite o valor de b:");
            b = scan.nextDouble();
            System.out.println("Digite o valor de c:");
            c = scan.nextDouble();

            delta = Math.pow(b, 2) - (4 * a * c);

            System.out.println("Valor de delta: " + delta);

            if (delta < 0)
            {
                System.out.println("A equação não possui raizes reais!");
            }
            else if (delta == 0)
            {
                System.out.println("A equação possui apenas uma raiz real!");
            }
            else
            {
                System.out.println("A equação possui duas raizes reais!");
            }
        }
        else
        {
            System.out.println("A equação não é do segundo grau!");
        }
    }
}
