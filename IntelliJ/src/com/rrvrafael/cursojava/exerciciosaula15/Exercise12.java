package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salarioBruto, salarioLiquido, ir, fgts, inss, valorHora, qtdHoraMes, totalDescontos;
        int percentual;

        System.out.println("Digite o quanto você ganha por hora:");
        valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        qtdHoraMes = scan.nextDouble();

        salarioBruto = valorHora * qtdHoraMes;

        if (salarioBruto <= 900)
        {
            percentual = 0;
        }
        else if (salarioBruto > 900 && salarioBruto <= 1500)
        {
            percentual = 5;
        }
        else if (salarioBruto > 1500 && salarioBruto <= 2500)
        {
            percentual = 10;
        }
        else
        {
            percentual = 20;
        }

        ir = (salarioBruto / 100) * percentual;
        inss = salarioBruto * 0.1;
        fgts = salarioBruto * 0.11;
        totalDescontos = (ir + inss);
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("(-) IR (" + percentual + "%): R$" + ir);
        System.out.println("(-) INSS (10%): R$" + inss);
        System.out.println("FGTS (11%): R$" + fgts);
        System.out.println("Total de descontos: R$" + totalDescontos);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}