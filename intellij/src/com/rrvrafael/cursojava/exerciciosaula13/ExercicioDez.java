package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioDez {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tempFarenheit, tempCelsius;

        System.out.println("Digite a temperatura em Celsius: ");
        tempCelsius = scan.nextDouble();

        tempFarenheit = ((tempCelsius * 9) / 5) + 32;

        System.out.println("Temperatura convertida em Farenheit: " + tempFarenheit);
    }
}
