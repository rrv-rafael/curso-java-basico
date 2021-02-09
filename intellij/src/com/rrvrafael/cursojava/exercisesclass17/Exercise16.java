package com.rrvrafael.cursojava.exercisesclass17;

public class Exercise16 {

    public static void main(String[] args) {

        int soma = 1, numAnterior = 1, flag = 0;
        boolean encerrar = true;

        System.out.println("Série de Fibonacci:");

        while (encerrar)
        {
            if (soma > 500)
            {
                encerrar = false;
            }

            System.out.println(soma);
            soma += flag;
            flag = numAnterior;
            numAnterior = soma;
        }
    }
}
