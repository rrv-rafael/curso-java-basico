package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioOnze {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2;
        double produto, numReal, soma, numAoCubo;

        System.out.println("Digite o 1o número inteiro: ");
        n1 = scan.nextInt();
        System.out.println("Digite o 2o número inteiro: ");
        n2 = scan.nextInt();
        System.out.println("Digite o número real: ");
        numReal = scan.nextDouble();

        produto = (n1 * 2) * ((double)n2 / 2); //O double antes do n2 serve para converter o resultado da divisão de 2 números inteiros em um número real
        soma = (n1 * 3) + numReal;
        numAoCubo = Math.pow(numReal,3);

        System.out.println("Produto do n1 com o n2: " + produto);
        System.out.println("Soma do triplo do primeiro número com o terceiro: " + soma);
        System.out.println("Terceiro número elevado ao cubo: " + numAoCubo);
    }
}
