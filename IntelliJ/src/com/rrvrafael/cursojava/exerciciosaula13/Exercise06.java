package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double raioCirculo, areaCirculo;

        System.out.println("Digite o raio do circulo: ");
        raioCirculo = scan.nextDouble();

        //areaCirculo = 3.14 * (raioCirculo * raioCirculo);
        areaCirculo = Math.PI * Math.pow(raioCirculo, 2);

        System.out.println("Área do circulo: " + areaCirculo);
    }
}