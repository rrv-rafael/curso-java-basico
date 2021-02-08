package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String user, password;

        System.out.println("Informe seu usuário:");
        user = scan.next();
        System.out.println("Informe sua senha:");
        password = scan.next();

        if (user.compareTo(password) == 0)
        {
            System.out.println("Strings iguais!");
        }

        /*do
        {
            System.out.println("Informe seu usuário:");
            user = scan.next();
            System.out.println("Informe sua senha:");
            password = scan.next();
        }
        while (user. != password);*/





    }
}
