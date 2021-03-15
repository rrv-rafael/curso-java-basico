package com.rrvrafael.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numeroLitrosVendidos, precoCombustivel;
        char tipoCombustivel;

        System.out.println("Digite o número de litros vendidos:");
        numeroLitrosVendidos = scan.nextDouble();

        System.out.println("Digite o tipo de combustível (A-álcool | G-gasolina):");
        tipoCombustivel = scan.next().charAt(0);

        if (tipoCombustivel == 'A')
        {
            if (numeroLitrosVendidos <= 20)
            {
                precoCombustivel = (numeroLitrosVendidos * 1.9) - (numeroLitrosVendidos * (1.9 * 0.03));
            }
            else
            {
                precoCombustivel = (numeroLitrosVendidos * 1.9) - (numeroLitrosVendidos * (1.9 * 0.05));
            }
        }
        else
        {
            if (numeroLitrosVendidos <= 20)
            {
                precoCombustivel = (numeroLitrosVendidos * 2.5) - (numeroLitrosVendidos * (2.5 * 0.04));
            }
            else
            {
                precoCombustivel = (numeroLitrosVendidos * 2.5) - (numeroLitrosVendidos * (2.5 * 0.06));
            }
        }

        System.out.println("Total a pagar no combustível: " + precoCombustivel);
    }
}