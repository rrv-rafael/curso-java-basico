package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, count = 0, qtdDivisivel, numeroAnterior, qtdPrimo = 0;

        System.out.println("Por favor, digite um número inteiro:");
        numero = scan.nextInt();

        //Código para dizer se o número digitado é primo:

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
        }

        //Código para mostrar os números primos dentro de um intervalo:

        for (int i = 1; i < 1000; i++)
        {
            numeroAnterior = i;
            qtdDivisivel = 0;

            while (numeroAnterior > 0)
            {
                if (i % numeroAnterior == 0)
                {
                    qtdDivisivel++;
                }

                numeroAnterior--;
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