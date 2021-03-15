package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double ganhoPorHora, numeroHorasTrabalhadas, salarioBruto, valorInss, pgmtSindicato, ir, totalImpostos, salLiquido;

        System.out.println("Digite o quanto você ganha por hora: ");
        ganhoPorHora = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        numeroHorasTrabalhadas = scan.nextDouble();

        salarioBruto = ganhoPorHora * numeroHorasTrabalhadas;
        valorInss = salarioBruto * 0.08;
        pgmtSindicato = salarioBruto * 0.05;
        ir = salarioBruto * 0.11;
        totalImpostos = valorInss + pgmtSindicato + ir;
        salLiquido = salarioBruto - totalImpostos;

        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("Valor do INSS: R$" + valorInss);
        System.out.println("Pagamento ao sindicato: R$" + pgmtSindicato);
        System.out.println("Pagamento do Imposto de Renda: R$" + ir);
        System.out.println("Total dos impostos: R$" + totalImpostos);
        System.out.println("Salário líquido: R$" + salLiquido);
    }
}