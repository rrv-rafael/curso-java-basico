package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char sexo;

        System.out.println("Digite o seu sexo:");
        sexo = scan.next().charAt(0);

        if (sexo == 'F')
        {
            System.out.println("F - Feminino");
        }
        else if (sexo == 'M')
        {
            System.out.println("M - Masculino");
        }
        else
        {
            System.out.println("Sexo inválido.");
        }
    }
}
