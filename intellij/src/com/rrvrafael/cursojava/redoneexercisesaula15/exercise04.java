package com.rrvrafael.cursojava.redoneexercisesaula15;

import java.util.Scanner;

public class exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String letra;

        System.out.println("Digite uma letra:");
        letra = scan.nextLine();

        /*if ((letra.equals("A") || letra.equals("a")) || (letra.equals("E") || letra.equals("e")) || (letra.equals("I") || letra.equals("i")) || (letra.equals("O") || letra.equals("o")) || (letra.equals("U") || letra.equals("u")))
        {
            System.out.println("Você digitou uma vogal!");
        }
        else
        {
            System.out.println("Você digitou uma consoante!");
        }*/

        switch (letra)
        {
            case "A":
            case "a":
            case "E":
            case "e":
            case "I":
            case "i":
            case "O":
            case "o":
            case "U":
            case "u":
                System.out.println("Você digitou uma vogal!");
                break;
            default:
                System.out.println("Você digitou uma consoante!");
                break;
        }
    }
}
