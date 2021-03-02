package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] agendaPessoal = new String[5][4];

        for (int i = 0; i < agendaPessoal.length; i++)
        {
            System.out.println("Digite os horários que deseja agendar para o dia " + (i + 1) + ":");

            for (int j = 0; j < agendaPessoal[i].length; j++)
            {
                agendaPessoal[i][j] = scan.next();
            }
        }

        for (int i = 0; i < agendaPessoal.length; i++)
        {
            System.out.println("\n\nHorários do dia " + (i + 1) + ":");

            for (int j = 0; j < agendaPessoal[i].length; j++)
            {
                System.out.print(agendaPessoal[i][j] + " ");
            }
        }
    }
}
