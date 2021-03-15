package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salAtual, salReajuste, reajuste;
        String percentual;

        System.out.println("Digite o seu salário atual:");
        salAtual = scan.nextDouble();

        if (salAtual < 281)
        {
            reajuste = salAtual * 0.2;
            salReajuste = salAtual + reajuste;
            percentual = "20%";
        }
        else if (salAtual > 280 && salAtual < 701)
        {
            reajuste = salAtual * 0.15;
            salReajuste = salAtual + reajuste;
            percentual = "15%";
        }
        else if (salAtual > 700 && salAtual < 1501)
        {
            reajuste = salAtual * 0.1;
            salReajuste = salAtual + reajuste;
            percentual = "10%";
        }
        else
        {
            reajuste = salAtual * 0.05;
            salReajuste = salAtual + reajuste;
            percentual = "5%";
        }

        System.out.println("Salário antes do reajuste: " + salAtual);
        System.out.println("Percentual de aumento aplicado: " + percentual);
        System.out.println("Valor do aumento: " + reajuste);
        System.out.println("Salário com o reajuste: " + salReajuste);
    }
}