package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercise16 {

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
                double x;

                x = (-b) / (2 * a);

                System.out.println("A equação possui apenas uma raiz real!");
                System.out.println("Logo a raiz dessa equação é: " + x);
            }
            else
            {
                double x1, x2;

                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("A equação possui duas raizes reais!");
                System.out.println("Logo as raízes dessa equação são: " + x1 + " e " + x2);
            }
        }
        else
        {
            System.out.println("A equação não é do segundo grau!");
        }
    }
}