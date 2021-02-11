package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdTermos, n = 1, m = 1;
        double soma = 0;

        System.out.println("Digite a quantidade de termos desejada:");
        qtdTermos = scan.nextInt();

        for (int i = 0; i < qtdTermos; i++)
        {
            System.out.println(n + "/" + m);

            soma += ((double) n / m);

            n++;
            m += 2;
        }

        System.out.println("Soma da série: " + soma);
    }
}
