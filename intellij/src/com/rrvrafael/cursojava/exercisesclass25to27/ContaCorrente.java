package com.rrvrafael.cursojava.exercisesclass25to27;

public class ContaCorrente {

    String numeroConta;
    double saldo;
    boolean status;
    double limite;

    double saque(double saque)
    {
        if (saldo > 0)
        {
            return saldo - saque;
        }

        return 0;
    }
}