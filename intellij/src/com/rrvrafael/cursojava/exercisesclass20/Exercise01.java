package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Random;

public class Exercise01 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] matriz = new int[4][4];
        int maior;
        int linha = 0, coluna = 0;

        System.out.println("Valores da matriz:");

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                if (matriz[i][j] > maior)
                {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;

                }
            }
        }

        System.out.println("\n\nMaior número da matriz é: " + maior);
        System.out.println("Posição deste número: \nLinha: " + linha + " | Coluna: " + coluna);

        /*for (int[] matrizI : matriz)
        {
            for (int matrizJ : matrizI)
            {
                if (matrizJ > maior)
                {
                    maior = matrizJ;
                }
            }
        }*/
    }
}