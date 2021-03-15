package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double ganhoPorHora, numeroHorasTrabalhadas, totalSalario;

        System.out.println("Digite o quanto você ganha por hora: ");
        ganhoPorHora = scan.nextDouble();
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        numeroHorasTrabalhadas = scan.nextDouble();

        totalSalario = (ganhoPorHora * numeroHorasTrabalhadas);

        System.out.println("Total do sálario no mês: " + totalSalario);
    }
}
