package com.rrvrafael.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //int idade;
        double valor;

        /*System.out.println("Digite sua idade:");
        idade = scan.nextInt();

        if (idade >= 18)
        {
            System.out.println("Você é maior de idade.");
        }
        else
        {
            System.out.println("Você é menor de idade");
        }*/

        //barato <= 10
        //10 < valor < 15 - pedir desconto
        //15 <= valor 17 - pesquisar mais
        //>= 17 - muito caro

        System.out.println("Digite o preço do item:");
        valor = scan.nextDouble();

        if (valor <= 10)
        {
            System.out.println("Está barato, pode comprar.");
        }
        else if (valor > 10 && valor < 15)
        {
            System.out.println("Você pode pedir um desconto.");
        }
        else if (valor >= 15 && valor < 17)
        {
            System.out.println("Pode pesquisar mais.");
        }
        else
        {
            System.out.println("Está muito caro.");
        }

    }
}