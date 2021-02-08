package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        do
        {
            System.out.println("Digite uma nota entre 0 e 10:");
            nota = scan.nextInt();

            if (nota < 0 || nota > 10)
            {
                System.out.println("Valor inválido!");
            }
        }
        while (nota < 0 || nota > 10);

        System.out.println("Valor válido digitado: " + nota);
    }
}
