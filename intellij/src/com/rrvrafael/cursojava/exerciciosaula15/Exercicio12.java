package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salarioBruto, salarioLiquido, ir, sindicato, fgts, inss, valorHora, qtdHoraMes, totalDescontos;
        String percentual;

        System.out.println("Digite o quanto você ganha por hora:");
        valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        qtdHoraMes = scan.nextDouble();

        salarioBruto = valorHora * qtdHoraMes;

        if (salarioBruto < 901)
        {
            ir = 0;
            percentual = "Isento";
        }
        else if (salarioBruto > 900 && salarioBruto < 1501)
        {
            ir = salarioBruto * 0.05;
            percentual = "5%";
        }
        else if (salarioBruto > 1500 && salarioBruto < 2501)
        {
            ir = salarioBruto * 0.1;
            percentual = "10%";
        }
        else
        {
            ir = salarioBruto * 0.2;
            percentual = "20%";
        }

        inss = salarioBruto * 0.1;
        fgts = salarioBruto * 0.11;
        sindicato = salarioBruto * 0.03;
        totalDescontos = (ir + inss + sindicato);
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("(-) IR (" + percentual + "): R$" + ir);
        System.out.println("(-) INSS (10%): R$" + inss);
        System.out.println("(-) Sindicato (3%): R$" + sindicato);
        System.out.println("FGTS (11%): R$" + fgts);
        System.out.println("Total de descontos: R$" + totalDescontos);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}
