package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, maiorNumero = 0, count = 0;

        do
        {
            count++;

            System.out.println("Digite o " + count + "o numero:");
            numero = scan.nextInt();

            if (numero > maiorNumero)
            {
                maiorNumero = numero;
            }
        }
        while (count < 5);

        System.out.println("O maior número digitado foi: " + maiorNumero);
    }
}
