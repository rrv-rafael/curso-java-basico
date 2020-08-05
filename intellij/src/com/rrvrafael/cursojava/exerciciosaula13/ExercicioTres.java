package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite o 1o valor: ");
        n1 = scan.nextInt();
        System.out.println("Digite o 2o valor: ");
        n2 = scan.nextInt();

        System.out.println("Soma dos números digitados: " + n1 + n2);
    }
}
