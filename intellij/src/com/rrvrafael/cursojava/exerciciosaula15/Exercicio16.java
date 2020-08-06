package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite o valor de a:");
        a = scan.nextDouble();

        if (a != 0)
        {
            System.out.println("Digite o valor de b:");
            b = scan.nextDouble();
        }
        else
        {
            System.out.println("A equação não é do segundo grau!");
        }
    }
}
