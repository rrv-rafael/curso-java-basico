package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise34 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdTermos, n = 1;
        double soma = 0;

        System.out.println("Digite a quantidade de termos desejados:");
        qtdTermos = scan.nextInt();

        for (int i = 1; i < qtdTermos; i++)
        {
            System.out.print(1 + "/" + n + " + ");

            n++;

            soma += ((double) 1 / n);
        }

        System.out.println(1 + "/" + n);

        System.out.println("\nSoma da série: " + soma);
    }
}