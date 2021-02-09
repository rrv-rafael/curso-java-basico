package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite o 1o número:");
        n1 = scan.nextInt();

        System.out.println("Digite o 2o número:");
        n2 = scan.nextInt();

        if (n1 < n2)
        {
            n1++;
            while (n1 < n2)
            {
                System.out.println(n1);
                n1++;
            }
        }
        else
        {
            n2++;
            while (n2 < n1)
            {
                System.out.println(n2);
                n2++;
            }
        }
    }
}
