package com.rrvrafael.cursojava.exercisesclass25to27;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno:");
        aluno.nome = scan.next();


        aluno.mostrarDisciplinasNotas();
    }
}