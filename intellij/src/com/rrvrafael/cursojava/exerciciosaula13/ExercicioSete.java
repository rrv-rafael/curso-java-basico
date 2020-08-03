package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioSete {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double ladoQuadrado, areaQuadrado;

        System.out.println("Digite o lado do quadrado: ");
        ladoQuadrado = scan.nextInt();

        areaQuadrado = Math.pow(ladoQuadrado, 2);

        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Dobro da área do quadrado: " + (areaQuadrado * 2));
    }
}
