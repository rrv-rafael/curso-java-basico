package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;
        String resposta;

        System.out.println("Telefonou para a vítima?");
        resposta = scan.nextLine();

        if (resposta.equals("sim"))
        {
            count++;
        }

        System.out.println("Esteve no local do crime?");
        resposta = scan.nextLine();

        if (resposta.equals("sim"))
        {
            count++;
        }

        System.out.println("Mora perto da vítima?");
        resposta = scan.nextLine();

        if (resposta.equals("sim"))
        {
            count++;
        }

        System.out.println("Devia para a vítima?");
        resposta = scan.nextLine();

        if (resposta.equals("sim"))
        {
            count++;
        }

        System.out.println("Já trabalhou com a vítima?");
        resposta = scan.nextLine();

        if (resposta.equals("sim"))
        {
            count++;
        }

        if (count == 2)
        {
            System.out.println("Você é suspeita do crime!");
        }
        else if (count == 3 || count == 4)
        {
            System.out.println("Você é cúmplice do crime!");
        }
        else if (count == 5)
        {
            System.out.println("Você é assassino do crime!");
        }
        else
        {
            System.out.println("Você é inocente do crime!");
        }
    }
}