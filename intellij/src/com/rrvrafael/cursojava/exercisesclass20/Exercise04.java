package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] agendaPessoal = new String[2][4];
        int diaMes, horario;
        boolean continuar = true;

        System.out.println("Menu de opções - Digite de (1 - 30) para indicar o dia do mês e de (1 - 24) para indicar a hora que deseja alterar.");
        System.out.println("Para sair digite 0 na opção para indicar o mês.");

        do
        {
            System.out.println("Digite o dia do mês que deseja alterar:");
            diaMes = scan.nextInt();

            if (diaMes == 0)
            {
                continuar = false;
            }
            else
            {
                System.out.println("Digite o horário que deseja alterar:");
                horario = scan.nextInt();

                System.out.println("Agora, informe o compromisso:");
                agendaPessoal[diaMes][horario] = scan.next();
            }
        }
        while (continuar);

        /*for (int i = 0; i < agendaPessoal.length; i++)
        {
            System.out.println("Digite os compromissos que deseja agendar para o dia " + (i + 1));

            for (int j = 0; j < agendaPessoal[i].length; j++)
            {
                System.out.println("Horário disponível: " + (j + 1));

                System.out.println("Digite o compromisso:");
                agendaPessoal[i][j] = scan.next();
            }
        }

        for (int i = 0; i < agendaPessoal.length; i++)
        {
            System.out.println("\nCompromissos do dia " + (i + 1) + ":");

            for (int j = 0; j < agendaPessoal[i].length; j++)
            {
                System.out.println("\nHorário " + (j + 1) + ":");

                System.out.print(agendaPessoal[i][j] + " ");
            }
        }*/
    }
}
