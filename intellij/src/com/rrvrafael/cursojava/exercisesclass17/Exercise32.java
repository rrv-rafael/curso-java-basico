package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int codigoItem, qtdDesejada;
        String sair = "";
        double valorItem = 0, valorTotal = 0;


        while (!(sair.equalsIgnoreCase("sair")))
        {
            System.out.println("Digite o código do item que deseja:");
            codigoItem = scan.nextInt();

            System.out.println("Digite a quantidade desejada deste item:");
            qtdDesejada = scan.nextInt();

            System.out.println("Deseja continuar pedindo? Digite sim para continuar ou sair para encerrar seu pedido:");
            sair = scan.next();

            if (codigoItem == 100)
            {
                valorItem = qtdDesejada * 1.20;
                System.out.println("Valor a ser pago pelo(s) " + qtdDesejada + " Cachorro Quente: " + valorItem);
            }
            else if (codigoItem == 101)
            {
                valorItem = qtdDesejada * 1.30;
                System.out.println("Valor a ser pago pelo(s) " + qtdDesejada + " Bauru Simples: " + valorItem);
            }
            else if (codigoItem == 102)
            {
                valorItem = qtdDesejada * 1.50;
                System.out.println("Valor a ser pago pelo(s) " + qtdDesejada + " Bauru com ovo: " + valorItem);
            }
            else if (codigoItem == 103)
            {
                valorItem = qtdDesejada * 1.20;
                System.out.println("Valor a ser pago pelo(s) " + qtdDesejada + " Hambúrguer(s): " + valorItem);
            }
            else if (codigoItem == 104)
            {
                valorItem = qtdDesejada * 1.30;
                System.out.println("Valor a ser pago pelo(s) " + qtdDesejada + " Cheeseburguer(s): " + valorItem);
            }
            else if (codigoItem == 105)
            {
                valorItem = qtdDesejada * 1.00;
                System.out.println("Valor a ser pago pelo(s) " + qtdDesejada + " Refrigerante(s): " + valorItem);
            }

            valorTotal += valorItem;
        }

        System.out.println("O valor total do seu pedido é: " + valorTotal);
    }
}
