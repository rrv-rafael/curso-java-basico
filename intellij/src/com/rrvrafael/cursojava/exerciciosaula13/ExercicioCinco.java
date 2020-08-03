package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double centimetro, metro;

        System.out.println("Digite a metragem a ser convertida: ");
        metro = scan.nextDouble();

        centimetro = metro * 100;

        System.out.println("A quantidade de metros equivale a " + centimetro + " centimentros.");
    }
}
