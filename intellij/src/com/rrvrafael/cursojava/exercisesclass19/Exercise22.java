package com.rrvrafael.cursojava.exercisesclass19;

public class Exercise22 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int countZero = 0, countUm = 0;
        double percentZero, percentUm;

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = (int) Math.round(Math.random() * 1);

            if (vetorA[i] == 1)
            {
                countUm++;
            }
            else
            {
                countZero++;
            }
        }

        System.out.println(countUm + " - " + countZero);

        percentUm = ((double) countUm / vetorA.length) * 100;
        percentZero = ((double) countZero / vetorA.length) * 100;

        System.out.println(percentUm + "% dos números são 1.");
        System.out.println(percentZero + "% dos números são 0.");

        for (int vetor: vetorA)
        {
            System.out.println(vetor);
        }
    }
}
