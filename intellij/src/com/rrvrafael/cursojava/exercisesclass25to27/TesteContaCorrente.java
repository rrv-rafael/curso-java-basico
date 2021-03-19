package com.rrvrafael.cursojava.exercisesclass25to27;

import java.util.Scanner;

public class TesteContaCorrente {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente();

        conta.saldo = 1000;

        double saque, deposito;

        System.out.println("Digite a quantia que deseja sacar:");
        saque = scan.nextDouble();

        double retornoSaque;

        retornoSaque = conta.realizarSaque(saque);

        if (retornoSaque > 0)
        {
            System.out.println("Saldo após saque: " + retornoSaque);
        }
        else
        {
            System.out.println("Saldo indisponível para efetuar o saque!");
        }

        System.out.println("Digite o valor do depósito que deseja realizar:");
        deposito = scan.nextDouble();

        conta.realizarDeposito(deposito);

        System.out.println("Saldo após depósito: " + conta.saldo);
    }
}