package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double populacaoA, populacaoB, taxaCrescA, taxaCrescB;
        int countAnos = 0;

        System.out.println("Informe a população do País A:");
        populacaoA = scan.nextDouble();

        while (populacaoA <= 0)
        {
            System.out.println("Digite um número válido:");
            populacaoA = scan.nextDouble();
        }

        System.out.println("Informe a taxa de crescimento da população do País A:");
        taxaCrescA = scan.nextDouble();

        while (taxaCrescA <= 0)
        {
            System.out.println("Digite um número válido:");
            taxaCrescA = scan.nextDouble();
        }

        System.out.println("Informe a população do País B:");
        populacaoB = scan.nextDouble();

        while (populacaoB <= 0)
        {
            System.out.println("Digite um número válido:");
            populacaoB = scan.nextDouble();
        }

        System.out.println("Informe a taxa de crescimento da população do País B:");
        taxaCrescB = scan.nextDouble();

        while (taxaCrescB <= 0)
        {
            System.out.println("Digite um número válido:");
            taxaCrescB = scan.nextDouble();
        }

        while (populacaoA <= populacaoB)
        {
            System.out.println("A - antes: " + populacaoA);
            populacaoA = populacaoA + (populacaoA * taxaCrescA);
            System.out.println("A - depois: " + populacaoA);
            System.out.println("B - antes: " + populacaoB);
            populacaoB = populacaoB + (populacaoB * taxaCrescB);
            System.out.println("B - depois: " + populacaoB);
            countAnos++;
        }

        System.out.println("Serão necessários " + countAnos + " anos para a população do país A passar a de B!");
    }
}
