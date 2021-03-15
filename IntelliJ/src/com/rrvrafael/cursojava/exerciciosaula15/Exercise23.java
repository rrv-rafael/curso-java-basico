package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double qtdCarne, precoTotal, valorDesconto, valorPagar;
        char tipoCarne, tipoPagamento;

        System.out.println("Digite o tipo da carne (F - File Duplo | A - Alcatra | P - Picanha):");
        tipoCarne = scan.next().charAt(0);

        if (tipoCarne == 'F' || tipoCarne == 'A' || tipoCarne == 'P')
        {
            System.out.println("Digite a quantidade de carne que deseja comprar:");
            qtdCarne = scan.nextDouble();
            System.out.println("Informe se a compra será feita com o cartão Tabajara (S - Sim | N - Não):");
            tipoPagamento = scan.next().charAt(0);

            if (tipoCarne == 'F')
            {
                if (qtdCarne <= 5)
                {
                    precoTotal = qtdCarne * 4.9;
                }
                else
                {
                    precoTotal = qtdCarne * 5.8;
                }
            }
            else if (tipoCarne == 'A')
            {
                if (qtdCarne <= 5)
                {
                    precoTotal = qtdCarne * 5.9;
                }
                else
                {
                    precoTotal = qtdCarne * 6.8;
                }
            }
            else
            {
                if (qtdCarne <= 5)
                {
                    precoTotal = qtdCarne * 6.9;
                }
                else
                {
                    precoTotal = qtdCarne * 7.8;
                }
            }

            System.out.println("Tipo da carne comprada: " + tipoCarne);
            System.out.println("Quantidade de carne comprada: " + qtdCarne);
            System.out.println("Preço total da compra: " + precoTotal);

            if (tipoPagamento == 'S')
            {
                valorDesconto = precoTotal * 0.05;
                System.out.println("Tipo de pagamento: Cartão Tabajara");
            }
            else
            {
                valorDesconto = 0;
                System.out.println("Tipo de pagamento: Cartão normal/Dinheiro");
            }

            valorPagar = precoTotal - valorDesconto;

            System.out.println("Valor do desconto: " + valorDesconto);
            System.out.println("Valor a pagar: " + valorPagar);
        }
        else
        {
            System.out.println("Digite um tipo de carne válido, conforme solicitado!");
        }
    }
}