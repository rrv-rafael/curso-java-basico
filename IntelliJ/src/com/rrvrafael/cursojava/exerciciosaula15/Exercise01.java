package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite o 1o valor: ");
        n1 = scan.nextInt();
        System.out.println("Digite o 2o valor: ");
        n2 = scan.nextInt();

        if (n1 > n2)
        {
            System.out.println("O maior número é: " + n1);
        }
        else
        {
            System.out.println("O maior número é: " + n2);
        }
    }
}