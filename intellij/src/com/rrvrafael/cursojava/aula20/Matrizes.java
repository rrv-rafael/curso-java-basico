package com.rrvrafael.cursojava.aula20;

import java.util.Random;
import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        double[][] notasAlunos = new double[30][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        for (int i = 0; i < notasAlunos.length; i++)
        {
            System.out.println("\nAluno " + (i + 1) + ":");

            for (int j = 0; j < notasAlunos[i].length; j++)
            {
                System.out.print("i: " + i + " ");
            }
        }


        /*for (int i = 0; i < notasAlunos.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                notasAlunos[i][j] = random.nextInt(10) + 1;
                System.out.println("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ":");
                notasAlunos[i][j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < notasAlunos.length; i++)
        {
            System.out.println("\n\nNotas do aluno " + (i + 1) + ":");

            for (int j = 0; j < 4; j++)
            {
                System.out.print(notasAlunos[i][j] + " ");
            }
        }
        */
    }
}
