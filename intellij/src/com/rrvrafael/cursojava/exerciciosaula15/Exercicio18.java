package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Digite um número inteiro:");
        num = scan.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("O número digitado é par!");
        }
        else
        {
            System.out.println("O número digitado é ímpar!");
        }
    }
}
