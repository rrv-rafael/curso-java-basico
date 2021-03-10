package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] jogoVelha = new String[3][3];
        String jogador1 = "", jogador2 = "";
        int posicoes = 0, count = 0;
        int countO = 0, countX = 0, countDP, countDPX, countDS, countDSX, countLinhaO, countLinhaX, countColunaO, countColunaX;
        boolean continuar = true;
        boolean jogada = true;

        System.out.println("Exemplo de posições para sua escolha:\n");

        for (int i = 0; i < jogoVelha.length; i++)
        {
            for (int j = 0; j < jogoVelha[i].length; j++)
            {
                posicoes++;
                jogoVelha[i][j] = Integer.toString(posicoes);

                System.out.print(jogoVelha[i][j] + " ");
            }

            System.out.println();
        }

        do
        {
            if (jogada)
            {
                System.out.println("\nJogador 1! Digite a posição onde deseja colocar a O:");
                jogador1 = scan.next();
                jogada = false;

            }
            else
            {
                System.out.println("\nJogador 2! Digite a posição onde deseja colocar a X:");
                jogador2 = scan.next();
                jogada = true;

            }

            countDP = 0;
            countDS = 0;

            for (int i = 0; i < jogoVelha.length; i++)
            {
                countLinhaO = 0;
                countLinhaX = 0;
                countColunaO = 0;
                countColunaX = 0;

                for (int j = 0; j < jogoVelha[i].length; j++)
                {
                    if (!jogada)
                    {
                        if (jogador1.equals(jogoVelha[i][j]))
                        {
                            jogoVelha[i][j] = "O";
                        }
                    }
                    else
                    {
                        if (jogador2.equals(jogoVelha[i][j]))
                        {
                            jogoVelha[i][j] = "X";
                        }
                    }

                    System.out.print(jogoVelha[i][j] + " ");

                    if (i == j)
                    {
                        if (jogoVelha[i][j].equals("O"))
                        {
                            countDP++;
                            countO = countDP;
                        }
                        else if (jogoVelha[i][j].equals("X"))
                        {
                            countDP++;
                            countX = countDP;
                        }
                    }
                    else if ((i + j) == (jogoVelha.length - 1))
                    {
                        if (jogoVelha[i][j].equals("O"))
                        {
                            countDS++;
                            countO = countDS;
                        }
                        else if (jogoVelha[i][j].equals("X"))
                        {
                            countDS++;
                            countX = countDS;
                        }
                    }



                    if (jogoVelha[i][j].equals("O"))
                    {
                        countLinhaO++;

                        if (countLinhaO == 3)
                        {
                            System.out.println("aloha");
                            countO = countLinhaO;
                            break;
                        }
                    }
                    else if (jogoVelha[i][j].equals("X"))
                    {
                        countLinhaX++;

                        if (countLinhaX == 3)
                        {
                            System.out.println("alohinha");
                            countX = countLinhaX;
                            break;
                        }
                    }
                    else if (jogoVelha[j][i].equals("O"))
                    {
                        countColunaO++;

                        if (countColunaO == 3)
                        {
                            System.out.println("olá");
                            countO = countColunaO;
                            break;
                        }
                    }
                    else if (jogoVelha[j][i].equals("X"))
                    {
                        countColunaX++;

                        if (countColunaX == 3)
                        {
                            countX = countColunaX;
                            break;
                        }
                    }
                }

                System.out.println();
            }

            count++;

            if (countO == 3)
            {
                System.out.println("\nO jogador 1 venceu!");
                break;
            }
            else if (countX == 3)
            {
                System.out.println("\nO jogador 2 venceu!");
                break;
            }

            if (count == 8)
            {
                System.out.println("\nEmpate!");
                continuar = false;
            }

        }
        while (continuar);

        /*for (int i = 0; i < jogoVelha.length; i++)
        {
            for (int j = 0; j < jogoVelha[i].length; j++)
            {
                System.out.print(jogoVelha[j][i] + " ");
            }

            System.out.println();
        }*/
    }


        /*
        *   0 1 2
        * 0 1 2 3
        * 1 4 5 6
        * 2 7 8 9
        *
        * */
}
