package com.rrvrafael.cursojava.redoneexercisesaula15;

import java.util.Scanner;

public class exercise03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String letra;

        System.out.println("Digite uma letra:");
        letra = scan.nextLine();

        if (letra.equals("F") || letra.equals("f"))
        {
            System.out.println("F - Feminino.");
        }
        else if (letra.equals("M") || letra.equals("m"))
        {
            System.out.println("M - Masculino.");
        }
        else
        {
            System.out.println("Sexo inválido.");
        }
    }
}
