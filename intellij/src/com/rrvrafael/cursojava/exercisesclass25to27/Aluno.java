package com.rrvrafael.cursojava.exercisesclass25to27;

public class Aluno {

    String nome;
    String matricula;
    String cursoMatriculado;
    String[] disciplinas;
    double[] notas;

    void mostrarDisciplinas(String nomeAluno, String matriculaAluno)
    {
        if (nomeAluno.equals(nome) || matriculaAluno.equals(matricula))
        {
            System.out.println("Disciplinas cursadas:");
            for (String disciplina : disciplinas)
            {
                System.out.println(disciplina);
            }
        }
        else
        {
            System.out.println("Nome ou RA informado não exite!");
        }
    }

    void mostrarNotas(String nomeAluno, String matriculaAluno)
    {
        if (nomeAluno.equals(nome) || matriculaAluno.equals(matricula))
        {
            System.out.println("Notas:");
            for (double nota : notas)
            {
                System.out.println(nota);
            }
        }
        else
        {
            System.out.println("Nome ou RA informado não existe!");
        }
    }

    boolean verificarNota()
    {
        for (double nota : notas)
        {
            if (nota >= 7)
            {
                return true;
            }
        }

        return false;
    }
}