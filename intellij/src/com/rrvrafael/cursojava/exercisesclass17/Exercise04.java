package com.rrvrafael.cursojava.exercisesclass17;

public class Exercise04 {

    public static void main(String[] args) {

        double A = 80000, B = 200000;
        int countAnos = 0;


        while (A <= B)
        {
            System.out.println("A - antes: " + A);
            A = A + (A * 0.03);
            System.out.println("A - depois: " + A);
            System.out.println("B - antes: " + B);
            B = B + (B * 0.015);
            System.out.println("B - depois: " + B);
            countAnos++;
        }

        System.out.println("Serão necessários " + countAnos + " anos para a população do país A passar a de B!");
    }
}
