package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a 1a nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Digite a 2a nota: ");
        nota2 = scan.nextDouble();

        System.out.println("Digite a 3a nota: ");
        nota3 = scan.nextDouble();

        System.out.println("Digite a 4a nota: ");
        nota4 = scan.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média Bimestral: " + media);
    }
}
