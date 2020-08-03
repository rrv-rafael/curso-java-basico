package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioQuatorze {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tamArq, velLinkInt, tempAproximado;

        System.out.println("Digite o tamanho do arquivo em MB: ");
        tamArq = scan.nextDouble();
        System.out.println("Digite a velocidade de um link de internet (em Mbps): ");
        velLinkInt = scan.nextDouble();

        //O tamanho do arquivo é de 10 megabytes
        //A velocidade de Mbps é de 100 megabits por segundo
        //Portanto, 1 byte equivale a 8 bits, ou seja, tenho que dividir 100 por 8 que são 12,5 bytes por segundo
    }
}
