package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Informe o 1o número:");
        n1 = scan.nextInt();
        System.out.println("Informe o 2o número:");
        n2 = scan.nextInt();
        System.out.println("Informe o 3o número:");
        n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3)
        {
            if (n2 > n3)
            {
                System.out.println("1)Números em ordem decrescente: " + n1 + ' ' + n2 + ' ' + n3);
            }
            else
            {
                System.out.println("2)Números em ordem decrescente: " + n1 + ' ' + n3 + ' ' + n2);
            }
        }
        else if (n2 > n1 && n2 > n3)
        {
            if (n1 > n3)
            {
                System.out.println("3)Números em ordem decrescente: " + n2 + ' ' + n1 + ' ' + n3);
            }
            else
            {
                System.out.println("4)Números em ordem decrescente: " + n2 + ' ' + n3 + ' ' + n1);
            }
        }
        else if (n3 > n1 && n3 > n2)
        {
            if (n1 > n2)
            {
                System.out.println("5)Números em ordem decrescente: " + n3 + ' ' + n1 + ' ' + n2);
            }
            else
            {
                System.out.println("6)Números em ordem decrescente: " + n3 + ' ' + n2 + ' ' + n1);
            }
        }
    }
}
