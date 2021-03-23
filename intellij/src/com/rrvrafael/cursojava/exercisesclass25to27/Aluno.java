package com.rrvrafael.cursojava.exercisesclass25to27;

public class Aluno {

    String nome;
    String matricula;
    String cursoMatriculado;
    String[] disciplinas;
    double[] notas;

    void mostrarDisciplinas(String matriculaAluno)
    {
        if (matriculaAluno.equals(matricula))
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

    void mostrarNotas(String matriculaAluno)
    {
        if (matriculaAluno.equals(matricula))
        {
            System.out.println("Notas:");
            for (int i = 0; i < notas.length; i++)
            {
                System.out.println(disciplinas[i] + " - " + notas[i]);
            }
            System.out.println();
        }
        else
        {
            System.out.println("Nome ou RA informado não existe!");
        }
    }

    void verificarNota(String matriculaAluno)
    {
        if (matriculaAluno.equals(matricula))
        {
            System.out.println("Discipinas aprovadas:");

            for (int i = 0; i < notas.length; i++)
            {
                if (notas[i] >= 7 )
                {
                    System.out.println("Aprovado(a) na disciplina " + disciplinas[i] + " com nota " + notas[i]);
                }
            }
            System.out.println();
        }
        else
        {
            System.out.println("Nome ou RA informado não exite!");
        }

    }
}