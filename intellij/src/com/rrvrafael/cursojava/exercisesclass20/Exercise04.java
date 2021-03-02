package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] agendaPessoal = new String[2][4];
        int[] posicaoDia = new int[2];
        int[] posicaoHorario = new int[4];
        int diaMes, horario, count = 0;
        boolean continuar = true;

        System.out.println("Menu de opções - Digite de (1 - 30) para indicar o dia do mês e de (1 - 24) para indicar a hora que deseja alterar.");
        System.out.println("Para sair digite -1 na opção para indicar o mês.");

        do
        {
            System.out.println("Digite o dia do mês que deseja alterar:");
            diaMes = scan.nextInt();

            if (diaMes == -1)
            {
                continuar = false;
            }
            else
            {
                System.out.println("Digite o horário que deseja alterar:");
                horario = scan.nextInt();

                posicaoDia[count] = diaMes;
                posicaoHorario[count] = horario;

                //posicaoDia[count] = diaMes - 1;
                //posicaoHorario[count] = horario - 1;
                count++;

                System.out.println("Agora, informe o compromisso:");
                agendaPessoal[diaMes][horario] = scan.next();
                //agendaPessoal[diaMes - 1][horario - 1] = scan.next();
            }
        }
        while (continuar);

        for (int i = 0; i < agendaPessoal.length; i++)
        {
            System.out.println("Compromissos do dia " + posicaoDia[i] + " :");
            for (int j = 0; j < agendaPessoal[i].length; j++)
            {
                System.out.println("Comprimisso do horário " + posicaoHorario[j] + " :");

                if (i == posicaoDia[i] && j == posicaoHorario[j])
                {
                    System.out.print("Compromisso: " + agendaPessoal[i][j]);
                }
            }
        }
    }
}
