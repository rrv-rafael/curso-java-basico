package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioTreze {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double ganhoPorHora, numeroHorasTrabalhadas, salarioBruto, valorINSS, pgmtSindicato, IR, totalImpostos, salLiquido;

        System.out.println("Digite o quanto você ganha por hora: ");
        ganhoPorHora = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        numeroHorasTrabalhadas = scan.nextDouble();

        salarioBruto = ganhoPorHora * numeroHorasTrabalhadas;
        valorINSS = salarioBruto * 0.08;
        pgmtSindicato = salarioBruto * 0.05;
        IR = salarioBruto * 0.11;
        totalImpostos = (valorINSS + pgmtSindicato + IR);
        salLiquido = salarioBruto - totalImpostos;

        System.out.println("Salário Bruto: R$" + salarioBruto + " - IR(11%): R$" + IR + " - INSS(8%): R$" + valorINSS + " - Sindicato(5%): R$" + pgmtSindicato + " = Salário Liquido: R$" + salLiquido);
    }
}
