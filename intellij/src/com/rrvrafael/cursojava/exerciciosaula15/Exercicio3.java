package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String letra;

        System.out.println("Digite uma letra (F ou M):");
        letra = scan.next();

        if (letra.equalsIgnoreCase("F"))
        {
            System.out.println("F - Feminino");
        }
        else if (letra.equalsIgnoreCase("M"))
        {
            System.out.println("M - Masculino");
        }
        else
        {
            System.out.println("Sexo inválido.");
        }
    }
}
