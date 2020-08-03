package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tempFarenheit, tempCelsius;

        System.out.println("Digite a temperatura em Farenheit: ");
        tempFarenheit = scan.nextDouble();

        tempCelsius = (5 * (tempFarenheit - 32) / 9);

        System.out.println("Temperatura convertida em Celsius: " + tempCelsius);
    }
}
