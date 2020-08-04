package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valor;

        System.out.println("Digite um valor: ");
        valor = scan.nextDouble();

        if (valor > 0)
        {
            System.out.println("O valor digitado é positivo.");
        }
        else
        {
            System.out.println("O valor digitado é negativo.");
        }
    }
}
