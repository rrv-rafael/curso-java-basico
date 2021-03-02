package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][][] agendaPessoal = new String[30][24][];
        int diaMes;
        String horario, compromisso;

        System.out.println("Digite o dia:");
        diaMes = scan.nextInt();

        //agendaPessoal = new String[diaMes][][];

        for (int i = 0; i < agendaPessoal.length; i++)
        {
            System.out.println("Digite o horário que deseja agendar:");
            horario = scan.next();

            for (int j = 0; j < agendaPessoal[i].length; j++)
            {

                for (int k = 0; k < agendaPessoal[i][j].length; k++)
                {
                    System.out.println("Digite uma letra:");
                    agendaPessoal[i][j][k] = scan.next();
                    //System.out.println(i + " " + j + " " + k);
                }
            }
        }

        for (int i = 0; i < agendaPessoal.length; i++)
        {
            for (int j = 0; j < agendaPessoal[i].length; j++)
            {
                for (int k = 0; k < agendaPessoal[i][j].length; k++)
                {
                    System.out.println("Valores da matriz tridimensional: " + agendaPessoal[i][j][k]);
                    //agendaPessoal[i][j][k] = scan.next();
                    //System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}
