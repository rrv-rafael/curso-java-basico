package com.rrvrafael.cursojava.redoneexercisesaula15;

import java.util.Scanner;

public class exercise18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número para saber se é par ou ímpar:");
        numero = scan.nextInt();

        if (numero % 2 == 0 && numero != 0)
        {
            System.out.println(numero + " é um número par.");
        }
        else
        {
            System.out.println(numero + " é um número ímpar.");
        }
    }
}
