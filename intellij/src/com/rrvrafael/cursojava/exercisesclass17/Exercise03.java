package com.rrvrafael.cursojava.exercisesclass17;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        System.out.println("Digite seu nome:");
        nome = scan.next();

        while (nome.length() < 4)
        {
            System.out.println("Nome inválido! O nome deve conter no minímo 3 caracteres. Por favor, digite novamente:");
            nome = scan.next();
        }

        System.out.println("Informe sua idade:");
        idade = scan.nextInt();

        while (idade < 0 || idade > 150)
        {
            System.out.println("Idade inválida! A idade não pode ser menor que 0 nem maior que 150! Por favor, digite novamente:");
            idade = scan.nextInt();
        }

        System.out.println("Informe seu salário:");
        salario = scan.nextDouble();

        while (salario < 1)
        {
            System.out.println("Salário inválido! O salário deve ser maior que 0! Por favor, digite novamente:");
            salario = scan.nextDouble();
        }

        System.out.println("Informe seu sexo:");
        sexo = scan.next();

        while (!(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")))
        {
            System.out.println("Sexo inválido! Você deve digitar F - Feminino ou M - Masculino! Por favor, digite novamente:");
            sexo = scan.next();
        }

        System.out.println("Informe seu estado civil:");
        estadoCivil = scan.next();

        while (!(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")))
        {
            System.out.println("Estado civil inválido! Você deve digitar S - Solteiro(a) | C - Casado(a) | V - Viúvo(a) | D - Divorciado(a)! Por favor, digite novamente:");
            estadoCivil = scan.next();
        }


        System.out.println("Informações preenchidas:" + '\n');
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
    }
}