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

        tempAproximado = (velLinkInt / 8) * (tamArq * 1000000);
        //1 megabit equivale a 125000 bytes

        //O tamanho do arquivo é de 10 megabytes
        //A velocidade de Mbps é de 100 megabits por segundo
        //Portanto, 1 byte equivale a 8 bits, ou seja, tenho que dividir 100 por 8 que são 12,5 bytes por segundo
        //1 MB equivale a 1000000 de bytes
        //No caso de 12,5 bytes por segundo, em um minuto são 750bytes baixados, em uma hora 45,000

        //System.out.println("Tamanho do arquvo em bytes: " + tamArq * 1000000);
        //System.out.println("Velocidade do link em bytes: " + velLinkInt / 8);
        System.out.println("Tempo aproximado para o download: " + tempAproximado);
    }
}
