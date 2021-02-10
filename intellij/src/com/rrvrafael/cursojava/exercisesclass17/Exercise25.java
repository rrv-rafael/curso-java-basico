package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorProduto, total = 0, pagamento, troco;
        int qtdProduto = 0;

        System.out.println("Lojas Tabajara");

        do
        {
            qtdProduto++;

            System.out.println("Digite o preço do produto " + qtdProduto + ": ");
            valorProduto = scan.nextDouble();

            total += valorProduto;

            System.out.println("Produto " + qtdProduto + ": R$ " + valorProduto);

            if (valorProduto == 0)
            {


                System.out.println("Informe o valor em dinheiro fornecido pelo cliente:");
                pagamento = scan.nextDouble();

                System.out.println("Total: R$ " + total);
                System.out.println("Dinheiro: R$ " + pagamento);

                troco = pagamento - total;

                System.out.println("Troco: R$ " + troco);
            }
        }
        while (valorProduto != 0);
    }
}
