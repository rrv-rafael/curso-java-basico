package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Scanner;

public class Exercise06Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //String[][] jogoVelha = new String[3][3];
        String jogadorUm = "", jogadorDois = "";
        int posicao = 0, count = 0, countO = 0, countX = 0, countDP, countDS, countCO, countCX;
        boolean continuar = true;
        boolean vezDeJogar = true;

        /*System.out.println("Exemplo de posições para sua escolha:\n");

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
            if (vezDeJogar)
            {
                System.out.println("\nJogador 1. Por favor, informe a posição que deseja colocar a O.");
                jogadorUm = scan.next();
            }
            else
            {
                System.out.println("\nJogador 2. Por favor, informe a posição que deseja colocar o X.");
                jogadorDois = scan.next();
            }

            countDP = 0;
            countDS = 0;
            countCO = 0;
            countCX = 0;

            for (int i = 0; i < jogoVelha.length; i++)
            {
                if (countCO == 3)
                {
                    break;
                }
                else
                {
                    countCO = 0;
                }

                if (countCX == 3)
                {
                    break;
                }
                else
                {
                    countCX = 0;
                }
                for (int j = 0; j < jogoVelha[i].length; j++)
                {
                    if (vezDeJogar)
                    {
                        if (jogadorUm.equals(jogoVelha[i][j]))
                        {
                            jogoVelha[i][j] = "O";
                            vezDeJogar = false;
                        }
                    }
                    else
                    {
                        if (jogadorDois.equals(jogoVelha[i][j]))
                        {
                            jogoVelha[i][j] = "X";
                            vezDeJogar = true;
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

                    if (jogoVelha[j][i].equals("O"))
                    {
                        countCO++;
                    }
                    if (jogoVelha[j][i].equals("X"))
                    {
                        countCX++;
                    }
                }

                System.out.println();
            }

            System.out.println("\nValor de countCO: " + countCO);

            if (countO == 3)
            {
                System.out.println("\nJogador 1 venceu!");
                break;
            }

            if (countX == 3)
            {
                System.out.println("\nJogador 2 venceu!");
                break;
            }

            count++;

            if (count == 8)
            {
                System.out.println("\nEmpate!");
                continuar = false;
            }
        }
        while (continuar);*/

        String[][] jogoVelha = {{"O", "H", "B", "O"}, {"P", "O", "I", "J"}, {"L", "O", "V", "O"}, {"T", "O", "D", "L"}};

        int counttt = 0;

        System.out.println("\nMatriz invertida:\n");

        for (int i = 0; i < jogoVelha.length; i++)
        {
            for (int j = 0; j < jogoVelha[i].length; j++)
            {
                System.out.print(jogoVelha[i][j] + " ");
            }

            System.out.println();
        }

        for (int i = 0; i < jogoVelha.length; i++)
        {
            counttt = 0;

            for (int j = 0; j < jogoVelha[i].length; j++)
            {
                if (jogoVelha[j][i].equals("O"))
                {
                    counttt++;
                }
            }
        }

        System.out.println("\n" + counttt);
    }
}
