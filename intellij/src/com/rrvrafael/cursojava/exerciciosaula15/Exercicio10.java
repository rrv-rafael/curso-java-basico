package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String turno;

        System.out.println("Digite o turno que você estuda (M-Matutino | V-Vespertino | N-Noturno):");
        turno = scan.nextLine();

        switch (turno)
        {
            case "M":
            case "m":
                System.out.println("Bom dia!");
                break;
            case "V":
            case "v":
                System.out.println("Boa tarde!");
                break;
            case "N":
            case "n":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("O turno digitado é inválido!");
        }
    }
}
