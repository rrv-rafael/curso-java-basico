package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] agendaPessoal = new String[2][4];
        int[] posicaoDia = new int[8];
        int[] posicaoHorario = new int[8];
        int diaMes, horario, count = 0;
        boolean continuar = true;

        /*agendaPessoal[0][0] = "a";
        agendaPessoal[0][1] = "b";
        agendaPessoal[0][2] = "c";
        agendaPessoal[0][3] = "d";
        agendaPessoal[1][0] = "e";
        agendaPessoal[1][1] = "f";
        agendaPessoal[1][2] = "g";
        agendaPessoal[1][3] = "h";*/

        System.out.println("Menu de opções - Digite de (1 - 30) para indicar o dia do mês e de (1 - 24) para indicar a hora que deseja alterar.");
        System.out.println("Para sair digite -1 na opção para indicar o mês.");

        do
        {
            System.out.println("Digite o dia do mês que deseja alterar:");
            diaMes = scan.nextInt();

            if (diaMes >= 0)
            {
                System.out.println("Digite o horário que deseja alterar:");
                horario = scan.nextInt();

                posicaoDia[count] = diaMes;
                posicaoHorario[count] = horario;
                count++;

                System.out.println("Agora, informe o compromisso:");
                agendaPessoal[diaMes][horario] = scan.next();
            }
            else
            {
                continuar = false;
            }
        }
        while (continuar);

        for (int i = 0; i < agendaPessoal.length; i++)
        {
            System.out.println("Compromissos do dia " + posicaoDia[i] + " :");

            for (int j = 0; j < agendaPessoal[i].length; j++)
            {
                if (agendaPessoal[i][j] != null)
                {
                    System.out.println(agendaPessoal[i][j]);
                }
            }
        }
    }
}
