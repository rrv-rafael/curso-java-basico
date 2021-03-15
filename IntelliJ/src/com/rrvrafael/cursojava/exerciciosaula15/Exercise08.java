package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double preco1, preco2, preco3;

        System.out.println("Digite o preço 1o produto:");
        preco1 = scan.nextDouble();
        System.out.println("Digite o preço 2o produto:");
        preco2 = scan.nextDouble();
        System.out.println("Digite o preço 3o produto:");
        preco3 = scan.nextDouble();

        if (preco1 < preco2 && preco1 < preco3)
        {
            System.out.println("O produto 1 é o que deve ser comprado.");
        }
        else if (preco2 < preco1 && preco2 < preco3)
        {
            System.out.println("O produto 2 é o que deve ser comprado.");
        }
        else
        {
            System.out.println("O produto 3 é o que deve ser comprado.");
        }
    }
}