package com.rrvrafael.cursojava.exercisesclass25to27;

public class Aluno {

    String nome;
    String matricula;
    String cursoMatriculado;
    String disciplinas[][] = {{"Cálculo", "5"}, {"Álgebra", "7"}, {"Arquitetura", "8"}};

    void mostrarDisciplinasNotas()
    {
        for (String[] disciplina : disciplinas)
        {
            for (String disci : disciplina)
            {
                System.out.print(disci + " ");
            }
            System.out.println();
        }
    }
}