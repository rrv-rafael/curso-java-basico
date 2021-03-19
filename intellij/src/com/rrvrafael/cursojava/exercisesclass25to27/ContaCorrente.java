package com.rrvrafael.cursojava.exercisesclass25to27;

public class ContaCorrente {

    String numeroConta;
    double saldo;
    boolean status;
    double limite;

    double realizarSaque(double saque)
    {
        if (saldo >= saque)
        {
            saldo -= saque;

            return saldo;
        }

        return -1;
    }

    void realizarDeposito(double deposito)
    {
        saldo += deposito;
    }

    double consultarSaldo()
    {
        return saldo;
    }

    boolean mostrarStatus()
    {
        return status;
    }
}