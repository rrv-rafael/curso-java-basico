package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        int numero, count = 0;
        //boolean primo = false;

        System.out.println("Por favor, digite um número inteiro:");
        numero = scan.nextInt();

        //Um número primo é aquele que é divisível apenas por 1 e por ele mesmo

        for (int i = numero; i > 0; i--)
        {
            if (numero % i == 0)
            {
                count++;
            }
            if (count > 2)
            {
                System.out.println("O número digitado não é primo!");
                break;
            }
        }

        if (count == 2)
        {
            System.out.println("O número digitado é primo!");
        }*/

        int qtdDivisivel, numero, qtdPrimo = 0;

        for (int i = 1; i < 1000; i++)
        {
            numero = i;
            qtdDivisivel = 0;

            while (numero > 0)
            {
                if (i % numero == 0)
                {
                    qtdDivisivel++;
                }

                numero--;
            }

            if (qtdDivisivel == 2)
            {
                System.out.println(i);
                qtdPrimo++;
            }
        }

        System.out.println(qtdPrimo);
    }
}