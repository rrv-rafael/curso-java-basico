package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] jogoVelha = new String[3][3];
        int[][] jogoVelhaEspelho = new int[3][3];
        int posicoes = 1, jogador1 = 0, jogador2 = 0, count = 0;
        boolean continuar = true;
        boolean jogada = true;

        System.out.println("Exemplo de posições para sua escolha:\n");

        for (int i = 0; i < jogoVelhaEspelho.length; i++)
        {
            for (int j = 0; j < jogoVelhaEspelho[i].length; j++)
            {
                jogoVelhaEspelho[i][j] = posicoes++;
                System.out.print(jogoVelhaEspelho[i][j] + " ");
            }
            System.out.println();
        }

        do
        {
            if (jogada)
            {
                System.out.println("\nJogador 1! Digite posição onde deseja colocar a O:");
                jogador1 = scan.nextInt();
                jogada = false;

            }
            else
            {
                System.out.println("\nJogador 2! Digite posição onde deseja colocar a X:");
                jogador2 = scan.nextInt();
                jogada = true;

            }


            for (int i = 0; i < jogoVelha.length; i++)
            {
                for (int j = 0; j < jogoVelha[i].length; j++)
                {
                    if (!jogada)
                    {
                        if (jogador1 == jogoVelhaEspelho[i][j])
                        {
                            jogoVelha[i][j] = "O";
                        }
                    }
                    else
                    {
                        if (jogador2 == jogoVelhaEspelho[i][j])
                        {
                            jogoVelha[i][j] = "X";
                        }
                    }

                    if (jogoVelha[i][j] == null)
                    {
                        jogoVelha[i][j] = "?";
                    }

                    System.out.print(jogoVelha[i][j] + " ");
                }

                System.out.println();
            }

            count++;

            if (count == 9)
            {
                continuar = false;
            }

        }
        while (continuar);




        /*
        *     0 1 2
        * 0 - 1 2 3
        * 1 - 4 5 6
        * 2 - 7 8 9
        *
        *
        * */
    }
}
