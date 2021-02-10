package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdTurmas, qtdAlunos, count = 0;
        double media, soma = 0;

        System.out.println("Digite a quantidade de turmas:");
        qtdTurmas = scan.nextInt();

        while (count < qtdTurmas)
        {
            count++;

            System.out.println("Digite a quantidade de alunos da turma " + count + ":");
            qtdAlunos = scan.nextInt();

            while (qtdAlunos > 40)
            {
                System.out.println("A turma não pode conter mais de 40 alunos! Digite novamente:");
                qtdAlunos = scan.nextInt();
            }

            soma += qtdAlunos;
        }

        media = soma / qtdTurmas;

        System.out.println("O número médio de alunos por turma é: " + media);
    }
}
