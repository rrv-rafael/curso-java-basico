package com.rrvrafael.cursojava.redoneexercisesaula15;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, resultado = 0;
        String operador;
        boolean operaçãoValida = true;

        System.out.println("Informe o 1o número:");
        n1 = scan.nextInt();
        System.out.println("Informe o 2o número:");
        n2 = scan.nextInt();
        System.out.println("Informe o operador da operação desejada (+, -, *, /):");
        operador = scan.next();

        switch (operador)
        {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                if (n2 != 0)
                    resultado = n1 / n2;
                else
                {
                    System.out.println("Não é possível realizar divisão por 0!");
                    operaçãoValida = false;
                }

                break;
            default:
                System.out.println("Operador inválido!");
                operaçãoValida = false;
        }

        if (operaçãoValida)
        {
            System.out.println("Resultado da operação: " + resultado);

            if (resultado % 2 == 0)
            {
                if (resultado > 0)
                {
                    System.out.println(resultado + " é um número par e positivo!");
                }
                else
                {
                    System.out.println(resultado + " é um número par e negativo!");
                }

            }
            else
            {
                if (resultado < 0)
                {
                    System.out.println(resultado + " é um número ímpar e negativo!");
                }
                else
                {
                    System.out.println(resultado + " é um número ímpar e positivo!");
                }
            }
        }
    }
}
