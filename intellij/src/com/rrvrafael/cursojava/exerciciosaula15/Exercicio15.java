package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.println("Digite o valor do 1o lado:");
        lado1 = scan.nextInt();

        System.out.println("Digite o valor do 2o lado:");
        lado2 = scan.nextInt();

        System.out.println("Digite o valor do 3o lado:");
        lado3 = scan.nextInt();

        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2)
        {
            if (lado1 == lado2 && lado2 == lado3)
            {
                System.out.println("Triângulo Equilátero");
            }
            else if (lado1 != lado2 && lado2 != lado3)
            {
                System.out.println("Triângulo Escaleno");
            }
            else
            {
                System.out.println("Triângulo Isósceles");
            }
        }
        else
        {
            System.out.println("Os valores digitados não formam um trângulo");
        }
    }
}
