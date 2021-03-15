package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String letra;

        System.out.println("Digite uma letra:");
        letra = scan.next();

        if (letra.length() > 1)
        {
            System.out.println("Digite apenas uma letra!");
        }
        else
        {
            switch (letra)
            {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("A letra digitada é uma vogal!");
                    break;
                default:
                    System.out.println("A letra digitada é uma consoante!");
            }
        }

        if (letra.length() > 1)
        {
            System.out.println("Digite apenas uma letra!");
        }
        else
        {
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))
            {
                System.out.println("A letra digitada é uma vogal!");
            }
            else
            {
                System.out.println("A letra digitada é uma consoante!");
            }
        }
    }
}