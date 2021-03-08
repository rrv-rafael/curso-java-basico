package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] agendaPessoal = new String[31][24];
        String mostrarCompromisso;
        int diaMes, horario;
        boolean continuar = true;

        System.out.println("Para agendar ou alterar um compromisso, digite de (1 - 31) para indicar o dia do mês e de (1 - 24) para indicar o horário!");
        System.out.println("\nPara sair da aplicação digite -1 na opção para indicar o mês e para ver a agenda digite 0.");

        do
        {
            System.out.println("\nDigite o dia do mês que deseja agendar/alterar:");
            diaMes = scan.nextInt();

            if (diaMes > 0)
            {
                System.out.println("Digite o horário que deseja agendar/alterar:");
                horario = scan.nextInt();

                System.out.println("\nAgora, informe o compromisso:");
                agendaPessoal[diaMes - 1][horario - 1] = scan.next();
            }
            else if (diaMes == 0)
            {
                System.out.println("\nPara listar todos os compromissos digite S - SIM e para listar um compromisso específico digite N - NÃO:");
                mostrarCompromisso = scan.next();
                System.out.println();

                if (mostrarCompromisso.equalsIgnoreCase("s"))
                {
                    for (int i = 0; i < agendaPessoal.length; i++)
                    {
                        for (int j = 0; j < agendaPessoal[i].length; j++)
                        {
                            if (agendaPessoal[i][j] != null)
                            {
                                System.out.println("Compromisso no dia " + (i + 1) + " às " + (j + 1) + ":");
                                System.out.println(agendaPessoal[i][j]);
                                System.out.println();
                            }
                        }
                    }
                }
                else
                {
                    System.out.println("Digite o dia do mês do compromisso desejado:");
                    diaMes = scan.nextInt();

                    System.out.println("Digite o horário do compromisso:");
                    horario = scan.nextInt();

                    if (agendaPessoal[diaMes - 1][horario - 1] == null)
                    {
                        System.out.println("\nNão existe compromisso para esse dia e horário informados.");
                    }
                    else
                    {
                        System.out.println("\nCompromisso no dia " + diaMes + " às " + horario + ":");
                        System.out.println(agendaPessoal[diaMes - 1][horario - 1]);
                    }
                }
            }
            else
            {
                System.out.println("\n\nVocê saiu da aplicação...");
                continuar = false;
            }
        }
        while (continuar);
    }
}
