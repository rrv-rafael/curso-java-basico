package com.rrvrafael.cursojava.exercisesclass17;

public class Exercise23 {

    public static void main(String[] args) {

        double preco = 0;

        for (int i = 1; i <= 50; i++)
        {
            System.out.println(i + " - R$ " + (preco += 1.99));
        }
    }
}
