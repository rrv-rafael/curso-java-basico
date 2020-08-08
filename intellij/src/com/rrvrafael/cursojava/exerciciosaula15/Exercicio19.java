package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double n1, n2, resultado;
        char operacao;

        System.out.println("Digite o 1o valor:");
        n1 = scan.nextDouble();
        System.out.println("Digite o 2o valor:");
        n2 = scan.nextDouble();

        System.out.println("Digite que operação deseja realizar (+, -, *, /):");
        operacao = scan.next().charAt(0);

        switch (operacao)
        {
            case '+': resultado = n1 + n2;
                if (resultado > 0)
                {
                    if (resultado % 2 == 0)
                    {
                        System.out.println("Resultado da soma: " + resultado + ". O resultado é positivo e par!");
                    }
                    else
                    {
                        System.out.println("Resultado da soma: " + resultado + ". O resultado é positivo e ímpar!");
                    }
                }
                else
                {
                    if (resultado % 2 == 0)
                    {
                        System.out.println("Resultado da soma: " + resultado + ". O resultado é negativo e par!");
                    }
                    else
                    {
                        System.out.println("Resultado da soma: " + resultado + ". O resultado é negativo e ímpar!");
                    }
                }
            break;
            case '-': resultado = n1 - n2;
                if (resultado > 0)
                {
                    if (resultado % 2 == 0)
                    {
                        System.out.println("Resultado da subtração: " + resultado + ". O resultado é positivo e par!");
                    }
                    else
                    {
                        System.out.println("Resultado da subtração: " + resultado + ". O resultado é positivo e ímpar!");
                    }
                }
                else
                {
                    if (resultado % 2 == 0)
                    {
                        System.out.println("Resultado da subtração: " + resultado + ". O resultado é negativo e par!");
                    }
                    else
                    {
                        System.out.println("Resultado da subtração: " + resultado + ". O resultado é negativo e ímpar!");
                    }
                }
            break;
            case '*': resultado = n1 * n2;
                if (resultado > 0)
                {
                    if (resultado % 2 == 0)
                    {
                        System.out.println("Resultado da multiplicação: " + resultado + ". O resultado é positivo e par!");
                    }
                    else
                    {
                        System.out.println("Resultado da multiplicação: " + resultado + ". O resultado é positivo e ímpar!");
                    }
                }
                else
                {
                    if (resultado % 2 == 0)
                    {
                        System.out.println("Resultado da multiplicação: " + resultado + ". O resultado é negativo e par!");
                    }
                    else
                    {
                        System.out.println("Resultado da multiplicação: " + resultado + ". O resultado é negativo e ímpar!");
                    }
                }
            break;
            case '/':
                if (n2 > 0)
                {
                    resultado = n1 / n2;

                    if (resultado > 0)
                    {
                        if (resultado % 2 == 0)
                        {
                            System.out.println("Resultado da divisão: " + resultado + ". O resultado é positivo e par!");
                        }
                        else
                        {
                            System.out.println("Resultado da divisão: " + resultado + ". O resultado é positivo e ímpar!");
                        }
                    }
                    else
                    {
                        if (resultado % 2 == 0)
                        {
                            System.out.println("Resultado da divisão: " + resultado + ". O resultado é negativo e par!");
                        }
                        else
                        {
                            System.out.println("Resultado da divisão: " + resultado + ". O resultado é negativo e ímpar!");
                        }
                    }
                }
                else
                {
                    System.out.println("Não é possível dividir por 0!");
                }
            break;
            default:
                System.out.println("Você digitou um operador inválido! Digite um operador válido conforme solicitado!");
        }
    }
}