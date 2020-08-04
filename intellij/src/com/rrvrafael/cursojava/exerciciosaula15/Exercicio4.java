package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char letra;

        System.out.println("Digite uma letra:");
        letra = scan.next().charAt(0);

        switch (letra)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("A letra digitada é uma vogal!");
                break;
            default:
                System.out.println("A letra digitada é uma consoante!");
        }

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
        {
            System.out.println("A letra digitada é uma vogal!");
        }
        else
        {
            System.out.println("A letra digitada é uma consoante!");
        }
    }
}
