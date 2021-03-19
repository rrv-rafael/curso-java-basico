package com.rrvrafael.cursojava.exercisesclass25to27;

public class ContaCorrente {

    String numeroConta;
    double saldo;
    boolean status;
    double limite;

    double realizarSaque(double saque)
    {
        if (saldo > 0)
        {
            saldo -= saque;

            return saldo;
        }

        return 0;
    }

    void realizarDeposito(double deposito)
    {
        saldo += deposito;
    }
}