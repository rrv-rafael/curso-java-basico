package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Random;

public class Exercise02 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] M = new int[10][10];
        int maiorLinha, menorLinha, maiorColuna, menorColuna;

        for (int i = 0; i < M.length; i++)
        {
            for (int j = 0; j < M[i].length; j++)
            {
                M[i][j] = random.nextInt(10);
                System.out.print(M[i][j] + " ");
            }

            System.out.println();
        }

        maiorLinha = M[0][0];
        menorLinha = M[0][0];
        maiorColuna = M[0][0];
        menorColuna = M[0][0];

        System.out.println();

        for (int[] matriz : M)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                if (M[5][j] > maiorLinha)
                {
                    maiorLinha = M[5][j];
                }
                if (M[5][j] < menorLinha)
                {
                    menorLinha = M[5][j];
                }

                if (matriz[7] > maiorColuna)
                {
                    maiorColuna = matriz[7];
                }
                if (matriz[7] < menorColuna)
                {
                    menorColuna = matriz[7];
                }
            }
        }



        /*for (int i = 0; i < M.length; i++)
        {
            for (int j = 0; j < M[i].length; j++)
            {
                if (M[5][j] > maiorLinha)
                {
                    maiorLinha = M[5][j];
                }
                if (M[5][j] < menorLinha)
                {
                    menorLinha = M[5][j];
                }

                if (M[i][7] > maiorColuna)
                {
                    maiorColuna = M[i][7];
                }
                if (M[i][7] < menorColuna)
                {
                    menorColuna = M[i][7];
                }
            }
        }*/

        System.out.println("\nMaior valor da linha 5: " + maiorLinha + "\nMenor valor da linha 5: " + menorLinha);
        System.out.println("Maior valor da coluna 7: " + maiorColuna + "\nMenor valor da coluna 7: " + menorColuna);
    }
}
