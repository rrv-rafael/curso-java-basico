package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int countPar = 0, countImpar = 0;

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.println("Digite um valor para a matriz:");
                matriz[i][j] = scan.nextInt();

                if (matriz[i][j] % 2 == 0)
                {
                    countPar++;
                }
                else
                {
                    countImpar++;
                }
            }
        }

        for (int[] matrizI : matriz)
        {
            for (int matrizJ : matrizI)
            {
                System.out.print(matrizJ + " ");
            }
            System.out.println();
        }

        System.out.println("\nA quantidade de números pares nesta matriz é: " + countPar);
        System.out.println("A quantidade de números ímpares nesta matriz é: " + countImpar);
    }
}
