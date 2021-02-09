package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, soma = 1, numAnterior = 1, flag = 0;

        System.out.println("Digite um número:");
        numero = scan.nextInt();

        System.out.println("Série de Fibonacci:");

        while (soma <= numero)
        {
            System.out.println(soma);
            soma += flag;
            flag = numAnterior;
            numAnterior = soma;
        }
    }
}
