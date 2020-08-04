package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double n1, n2, n3, maior, menor;

        System.out.println("Digite o 1o valor:");
        n1 = scan.nextDouble();
        System.out.println("Digite o 2o valor:");
        n2 = scan.nextDouble();
        System.out.println("Digite o 3o valor:");
        n3 = scan.nextDouble();

        /*maior = n1;
        menor = n1;

        if (n2 > maior)
        {
            maior = n2;
        }
        if (n2 < menor)
        {
            menor = n2;
        }
        if (n3 > maior)
        {
            maior = n3;
        }
        if (n3 < menor)
        {
            menor = n3;
        }

        System.out.println(maior + " é o maior número digitado!");
        System.out.println(menor + " é o menor número digitado!");
        */
        if (n1 > n2 && n1 > n3)
        {
            System.out.println(n1 + " é o maior número digitado!");

            if (n2 > n3)
            {
                System.out.println(n3 + " é o menor número digitado!");
            }
            else
            {
                System.out.println(n2 + " é o menor número digitado!");
            }
        }
        else if (n2 > n1 && n2 > n3)
        {
            System.out.println(n2 + " é o maior número digitado!");

            if (n1 > n3)
            {
                System.out.println(n3 + " é o menor número digitado!");
            }
            else
            {
                System.out.println(n1 + " é o menor número digitado!");
            }
        }
        else
        {
            System.out.println(n3 + " é o maior número digitado!");

            if (n1 > n2)
            {
                System.out.println(n2 + " é o menor número digitado!");
            }
            else
            {
                System.out.println(n1 + " é o menor número digitado!");
            }
        }
    }
}
