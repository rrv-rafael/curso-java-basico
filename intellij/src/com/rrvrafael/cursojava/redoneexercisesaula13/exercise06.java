package com.rrvrafael.cursojava.redoneexercisesaula13;

import java.util.Scanner;

public class exercise06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double raio, area;

        System.out.println("Digite o raio do círculo:");
        raio = scan.nextInt();

        area = Math.PI * Math.pow(raio, 2);

        System.out.println("Área do círculo: " + area);
    }
}
