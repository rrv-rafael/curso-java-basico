package com.rrvrafael.cursojava.exercisesclass19;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] idade = new int[10];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, posicaoMaior = 0, posicaoMenor = 0;

        for (int i = 0; i < idade.length; i++)
        {
            System.out.println("Digite uma idade:");
            idade[i] = scan.nextInt();

            if (idade[i] > maior)
            {
                maior = idade[i];
                posicaoMaior = i;
            }
            if (idade[i] < menor)
            {
                menor = idade[i];
                posicaoMenor = i;
            }
        }

        System.out.println("A maior idade digitada é: " + maior + " e sua posição é: " + posicaoMaior);
        System.out.println("A menor idade digitada é: " + menor + " e sua posição é: " + posicaoMenor);
    }
}
