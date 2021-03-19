package com.rrvrafael.cursojava.exercisesclass25to27;

import java.util.Scanner;

public class TesteContaCorrente {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente();

        conta.saldo = 1000;

        double saque;

        System.out.println("Digite a quantia que deseja sacar:");
        saque = scan.nextDouble();

        //conta.saque(saque);

        double retornoSaque;

        retornoSaque = conta.saque(saque);

        if (retornoSaque > 0)
        {
            System.out.println("Saldo após saque: " + retornoSaque);
        }
        else
        {
            System.out.println("Saldo indisponível para efetuar o saque!");
        }
    }
}