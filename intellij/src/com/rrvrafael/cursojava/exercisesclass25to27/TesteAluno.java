package com.rrvrafael.cursojava.exercisesclass25to27;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        int option;
        String matriculaAluno;
        boolean sair = false;

        aluno.nome = "Rafael";
        aluno.matricula = "14069173";
        aluno.cursoMatriculado = "Sistemas de Informação";
        aluno.disciplinas = new String[3];
        aluno.disciplinas = new String[] {"Cálculo", "Álgebra", "Arquitetura"};
        aluno.notas = new double[3];
        aluno.notas = new double[] {7.5, 5, 8};

        System.out.println("* * * Sistema Acadêmico * * *");
        System.out.println("Informe a matrícula do aluno:");
        matriculaAluno = scan.next();

        if (matriculaAluno.equals(aluno.matricula))
        {
            do
            {
                System.out.println("Com este sistema você poderá realizar as seguintes ações:");
                System.out.println("1 - Visualizar disciplinas cursadas\n2 - Visualizar notas\n3 - Visualizar disciplinas aprovadas\n0 - Finalizar seção");
                System.out.println("\nDigite a opção desejada:");
                option = scan.nextInt();

                if (option == 1)
                {
                    aluno.mostrarDisciplinas();
                }
                else if (option == 2)
                {
                    aluno.mostrarNotas();
                }
                else if (option == 3)
                {
                    aluno.verificarNota();
                }
                else if (option == 0)
                {
                    sair = true;
                    System.out.println("Encerrando a aplicação...");
                }
                else
                {
                    System.out.println("Digite uma opção válida!");
                }
            }
            while (!sair);
        }
        else
        {
            System.out.println("Matrícula informada não exite!");
        }
    }
}