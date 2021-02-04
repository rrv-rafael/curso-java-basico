package com.rrvrafael.cursojava.redoneexercisesaula15;

import java.util.Scanner;

public class exercise02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor;

        System.out.println("Informe um valor:");
        valor = scan.nextInt();

        if (valor > 0)
        {
            System.out.println("O número " + valor + " é positivo.");
        }
        else if (valor < 0)
        {
            System.out.println("O número " + valor + " é negativo.");
        }
        else
        {
            System.out.println("O número 0 é neutro!");
        }
    }
}
