package com.rrvrafael.cursojava.redoneexercisesaula13;

import java.util.Scanner;

public class exercise12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double altura, pesoIdeal;

        System.out.println("Digite a sua altura:");
        altura = scan.nextDouble();

        pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
