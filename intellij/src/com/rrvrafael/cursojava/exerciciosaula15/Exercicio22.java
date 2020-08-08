package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double qtdMorango, qtdMaca, qtdTotal, valorMorango, valorMaca, valorTotal, valorDesconto;

        System.out.println("Digite a quantidade adquirida de morango em kg:");
        qtdMorango = scan.nextDouble();
        System.out.println("Digite a quantidade adquirida de maçã em kg:");
        qtdMaca = scan.nextDouble();

        if (qtdMorango <= 5)
        {
            valorMorango = qtdMorango * 2.5;
        }
        else
        {
            valorMorango = qtdMorango * 2.2;
        }

        if (qtdMaca <= 5)
        {
            valorMaca = qtdMaca * 1.8;
        }
        else
        {
            valorMaca = qtdMaca * 1.5;
        }

        qtdTotal = qtdMorango + qtdMaca;
        valorTotal = valorMorango + valorMaca;

        if (qtdTotal > 8 || valorTotal > 25)
        {
            valorDesconto = valorTotal - (valorTotal * 0.1);
            System.out.println("Valor a ser pago com desconto: " + valorDesconto);
        }
        else
        {
            System.out.println("Valor a ser pago: " + valorTotal);
        }
    }
}
