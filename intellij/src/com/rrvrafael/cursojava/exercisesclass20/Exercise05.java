package com.rrvrafael.cursojava.exercisesclass20;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][][] agendaPessoal = new String[31][8][12];
        String mostrarCompromisso;
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int mes, diaMes, horario;
        boolean continuar = true;
        boolean definirMes = false;

        System.out.println("Para agendar ou alterar um compromisso, digite de (1 - 31) para indicar o dia, (1 - 12) o mês e (1 - 8) para indicar o horário!");
        System.out.println("\nPara sair da aplicação digite -1 na opção para indicar o mês e para ver a agenda digite 0.");

        do
        {
            System.out.println("\nDigite o dia do mês que deseja agendar/alterar:");

            diaMes = scan.nextInt();

            if (diaMes > 0)
            {
                System.out.println("Digite o mês que deseja agendar/alterar:");
                mes = scan.nextInt();

                System.out.println("Digite o horário que deseja agendar/alterar:");
                horario = scan.nextInt();

                System.out.println("\nAgora, informe o compromisso:");
                agendaPessoal[diaMes - 1][horario - 1][mes - 1] = scan.next();
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
                            for (int k = 0; k < agendaPessoal[i][j].length; k++)
                            {
                                if (agendaPessoal[i][j][k] != null)
                                {
                                    System.out.println("Compromisso no dia " + (i + 1) + " de " + meses[k] + " às " + (j + 1) + " horas:");
                                    System.out.println(agendaPessoal[i][j][k]);
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
                else
                {
                    System.out.println("Digite o dia do mês do compromisso desejado:");
                    diaMes = scan.nextInt();

                    System.out.println("Digite mês do compromisso desejado:");
                    mes = scan.nextInt();

                    System.out.println("Digite o horário do compromisso:");
                    horario = scan.nextInt();

                    if (agendaPessoal[diaMes - 1][horario - 1][mes - 1] == null)
                    {
                        System.out.println("\nNão existe compromisso nesta data informada.");
                    }
                    else
                    {
                        for (int i = 0; i < meses.length; i++)
                        {
                            if (i == (mes - 1))
                            {
                                definirMes = true;
                                break;
                            }
                        }

                        if (definirMes)
                        {
                            System.out.println("\nCompromisso no dia " + diaMes + " de " + meses[mes - 1] + " às " + horario + " horas:");
                            System.out.println(agendaPessoal[diaMes - 1][horario - 1][mes - 1]);
                            definirMes = false;
                        }
                    }
                }
            }
            else
            {
                System.out.println("\nVocê saiu da aplicação...");
                continuar = false;
            }
        }
        while (continuar);
    }
}
