package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double n1, n2, n3, maior;

        System.out.println("Digite o 1o valor:");
        n1 = scan.nextDouble();
        System.out.println("Digite o 2o valor:");
        n2 = scan.nextDouble();
        System.out.println("Digite o 3o valor:");
        n3 = scan.nextDouble();

        if (n1 > n2 && n1 > n3)
        {
            System.out.println(n1 + " é o maior número digitado!");
        }
        else if (n2 > n1 && n2 > n3)
        {
            System.out.println(n2 + " é o maior número digitado!");
        }
        else
        {
            System.out.println(n3 + " é o maior número digitado!");
        }
    }
}