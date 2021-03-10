package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Scanner;

public class Exercise06TestFinal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] jogoVelha = new String[3][3];
        String jogadorUm = "", jogadorDois = "";
        int posicao = 0, count = 0, countO = 0, countX = 0, countCO, countCX;
        boolean continuar = true;
        boolean jogada = true;

        System.out.println("Exemplo de posições para sua escolha:\n");

        for (int i = 0; i < jogoVelha.length; i++)
        {
            for (int j = 0; j < jogoVelha[i].length; j++)
            {
                posicao++;
                jogoVelha[i][j] = Integer.toString(posicao);

                System.out.print(jogoVelha[i][j] + " ");
            }

            System.out.println();
        }

        do
        {
            if (jogada)
            {
                System.out.println("\nJogador 1. Por favor, informe a posição que deseja colocar a O.");
                jogadorUm = scan.next();
            }
            else
            {
                System.out.println("\nJogador 2. Por favor, informe a posição que deseja colocar o X.");
                jogadorDois = scan.next();
            }

            countCO = 0;
            countCX = 0;

            for (int i = 0; i < jogoVelha.length; i++)
            {
                for (int j = 0; j < jogoVelha[i].length; j++)
                {
                    if (jogada)
                    {
                        if (jogadorUm.equals(jogoVelha[i][j]))
                        {
                            jogoVelha[i][j] = "O";
                            jogada = false;
                        }
                    }
                    else
                    {
                        if (jogadorDois.equals(jogoVelha[i][j]))
                        {
                            jogoVelha[i][j] = "X";
                            jogada = true;
                        }
                    }

                    System.out.print(jogoVelha[i][j] + " ");

                    if (jogoVelha[i][j].equals("O"))
                    {
                        countCO++;
                    }
                    if (jogoVelha[i][j].equals("X"))
                    {
                        countCX++;
                    }
                }

                System.out.println();
            }

            if (countO == 3)
            {
                System.out.println("\nJogador 1 ganhou!");
                break;
            }

            count++;

            if (count == 8)
            {
                System.out.println("\nEmpate...");
                continuar = false;
            }
        }
        while (continuar);
    }
}
