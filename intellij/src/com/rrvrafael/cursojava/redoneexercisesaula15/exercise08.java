package com.rrvrafael.cursojava.redoneexercisesaula15;

import java.util.Scanner;

public class exercise08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double p1, p2, p3, maisBarato;

        System.out.println("Informe o preço do protudo 1:");
        p1 = scan.nextDouble();
        System.out.println("Informe o preço do produto 2:");
        p2 = scan.nextDouble();
        System.out.println("Informe o preço do produto 3:");
        p3 = scan.nextDouble();

        if (p1 < p2 && p1 < p3)
        {
            System.out.println("Você deve comprar o produto 1!");
        }
        else  if (p2 < p1 && p2 < p3)
        {
            System.out.println("Você deve comprar o produto 2!");
        }
        else
        {
            System.out.println("Você deve comprar o produto 3!");
        }
    }
}
