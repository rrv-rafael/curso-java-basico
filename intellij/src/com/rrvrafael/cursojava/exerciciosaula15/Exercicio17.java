package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ano;

        System.out.println("Digite o número correspondente ao ano que deseja:");
        ano = scan.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)
        {
            System.out.println("O ano " + ano + " é bissexto!");
        }
        else
        {
            System.out.println("O ano " + ano + " não é bissexto!");
        }
    }
}
