package com.rrvrafael.cursojava.redoneexercisesaula15;

import java.util.Scanner;

public class exercise23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String tipoCarne, tipoPagamento;
        int qtdKg;
        double valorTotal = 0;

        System.out.println("Informe o tipo de carne que deseja comprar (F - Filé Duplo | A - Alcatra | P - Picanha):");
        tipoCarne = scan.next();

        if (tipoCarne.equals("F") || tipoCarne.equals("A") || tipoCarne.equals("P"))
        {
            System.out.println("Informe a quantidade (em Kg) que deseja comprar:");
            qtdKg = scan.nextInt();

            switch (tipoCarne)
            {
                case "F":
                    tipoCarne = "Filé Duplo";
                    if (qtdKg <= 5)
                    {
                        valorTotal = qtdKg * 4.9;
                    }
                    else
                    {
                        valorTotal = qtdKg * 5.8;
                    }
                break;
                case "A":
                    tipoCarne = "Alcatra";
                    if (qtdKg <= 5)
                    {
                        valorTotal = qtdKg * 5.9;
                    }
                    else
                    {
                        valorTotal = qtdKg * 6.8;
                    }
                break;
                case "P":
                    tipoCarne = "Picanha";
                    if (qtdKg <= 5)
                    {
                        valorTotal = qtdKg * 6.9;
                    }
                    else
                    {
                        valorTotal = qtdKg * 7.8;
                    }
                break;
            }

            System.out.println("Informe se o tipo de pagamento será com cartão Tabajara (S - Sim | N - Não):");
            tipoPagamento = scan.next();

            System.out.println("Cupom fiscal:" + '\n');
            System.out.println("Tipo de carne: " + tipoCarne);
            System.out.println("Quantidade: " + qtdKg + "kg");
            System.out.println("Preço total: " + valorTotal);

            if (tipoPagamento.equals("S") || tipoPagamento.equals("s"))
            {
                System.out.println("Tipo de pagamento: Cartão Tabajara");
                System.out.println("Valor do desconto: " + valorTotal * 0.05);
                System.out.println("Valor a pagar: " + (valorTotal - (valorTotal * 0.05)));
            }
            else
            {
                System.out.println("Tipo de pagamento: Cartão normal/Dinheiro");
                System.out.println("Valor do desconto: 0");
                System.out.println("Valor a pagar: " + valorTotal);
            }
        }
        else
        {
            System.out.println("Tipo inválido! Informe o tipo conforme solicitado!");
        }
    }
}