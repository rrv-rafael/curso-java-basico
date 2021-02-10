package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, comeco, fim, resultado;

        System.out.println("Digite o número da tabuada que deseja:");
        numero = scan.nextInt();

        System.out.println("Digite o número que deseja que comece a tabuada:");
        comeco = scan.nextInt();

        System.out.println("Digite o número que deseja que termine a tabuada:");
        fim = scan.nextInt();

        while (fim < comeco)
        {
            System.out.println("O número de término não pode ser menor que o de começo! Digite novamente:");

            System.out.println("Digite o número que deseja que comece a tabuada:");
            comeco = scan.nextInt();

            System.out.println("Digite o número que deseja que termine a tabuada:");
            fim = scan.nextInt();
        }

        System.out.println("Montar a tabuada de: " + numero);

        System.out.println("Começar por: " + comeco);
        System.out.println("Terminar em: " + fim);

        System.out.println("Vou montar a tabuada de " + numero + " começando em " + comeco + " e terminando em " + fim + ":");

        for (int i = comeco; i <= fim; i++)
        {
            resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}
