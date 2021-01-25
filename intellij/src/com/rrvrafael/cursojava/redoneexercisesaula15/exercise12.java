package com.rrvrafael.cursojava.redoneexercisesaula15;

import java.util.Scanner;

public class exercise12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorHoras, salarioBruto, descontoIR, sindicato, inss, fgts, salarioLiquido;
        int qtdHorasTrabMes;

        System.out.println("Informe o quanto você recebe por hora:");
        valorHoras = scan.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês:");
        qtdHorasTrabMes = scan.nextInt();

        salarioBruto = valorHoras * qtdHorasTrabMes;

        if (salarioBruto <= 900)
        {
            descontoIR = 0;
            sindicato = salarioBruto * 0.03;
            inss = salarioBruto * 0.1;
            fgts = salarioBruto * 0.11;
        }
        else if (salarioBruto > 900 && salarioBruto <= 1500)
        {
            descontoIR = salarioBruto * 0.05;
            sindicato = salarioBruto * 0.03;
            inss = salarioBruto * 0.1;
            fgts = salarioBruto * 0.11;
        }
        else if (salarioBruto > 1500 && salarioBruto <= 2500)
        {
            descontoIR = salarioBruto * 0.1;
            sindicato = salarioBruto * 0.03;
            inss = salarioBruto * 0.1;
            fgts = salarioBruto * 0.11;
        }
        else
        {
            descontoIR = salarioBruto * 0.2;
            sindicato = salarioBruto * 0.03;
            inss = salarioBruto * 0.1;
            fgts = salarioBruto * 0.11;
        }

        salarioLiquido = salarioBruto - (descontoIR + sindicato + inss);

        System.out.println("Salário bruto: (" + valorHoras + " * " + qtdHorasTrabMes + ")\t\t\t: R$ " + salarioBruto);
        System.out.println("(-) IR (" + (int)((descontoIR / salarioBruto) * 100) + "%) \t\t\t\t\t\t" + ": R$ " + descontoIR);
        System.out.println("(-) Sindicato (" + (int)((sindicato / salarioBruto) * 100) + "%) \t\t\t\t\t" + ": R$ " + sindicato);
        System.out.println("(-) INSS (" + (int)((inss / salarioBruto) * 100) + "%) \t\t\t\t\t\t" + ": R$ " + inss);
        System.out.println("FGTS (" + (int)((fgts / salarioBruto) * 100) + "%) \t\t\t\t\t\t\t" + ": R$ " + fgts);
        System.out.println("Total de descontos" + "\t\t\t\t\t: R$ " + (descontoIR + sindicato + inss));
        System.out.println("Salário Liquido" + "\t\t\t\t\t\t: R$ " + salarioLiquido);
    }
}
