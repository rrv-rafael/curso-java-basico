package com.rrvrafael.cursojava.exercisesclass25to27;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        int option;
        String nomeAluno = "", matriculaAluno = "";

        aluno.nome = "Rafael";
        aluno.matricula = "14069173";
        aluno.cursoMatriculado = "Sistemas de Informação";
        aluno.disciplinas = new String[3];
        aluno.disciplinas = new String[] {"Cálculo", "Álgebra", "Arquitetura"};
        aluno.notas = new double[3];
        aluno.notas = new double[] {5.5, 7,6};

        System.out.println("* * * Sistema Acadêmico * * *");
        System.out.println("Com este sistema você poderá realizar as seguintes ações:");
        System.out.println("1 - Buscar por nome\n2 - Buscar por matrícula\n0 - Finalizar seção");
        System.out.println("\nDigite a opção desejada:");
        option = scan.nextInt();

        if (option == 1)
        {
            System.out.println("Informe o nome do aluno:");
            nomeAluno = scan.next();
            aluno.mostrarDisciplinas(nomeAluno, matriculaAluno);

            if (aluno.verificarNota())
            {
                
            }
        }
        else if (option == 2)
        {
            System.out.println("Informe a matrícula do aluno:");
            matriculaAluno = scan.next();
            aluno.mostrarDisciplinas(nomeAluno, matriculaAluno);
        }
    }
}