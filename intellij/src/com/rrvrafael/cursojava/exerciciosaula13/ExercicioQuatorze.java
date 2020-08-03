package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioQuatorze {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tamArq, velLinkInt, tamArqBytes, tempAproximadoMinuto,tempAproximadoTotal;

        System.out.println(10 * 1000000);
        System.out.println("Digite o tamanho do arquivo em MB: ");
        tamArq = scan.nextDouble();
        System.out.println("Digite a velocidade de um link de internet (em Mbps): ");
        velLinkInt = scan.nextDouble();

        tempAproximadoMinuto = (velLinkInt * 125000) * 60;
        tamArqBytes = (tamArq * 1000000);
        //1 megabit equivale a 125000 bytes

        //Exemplo de entradas:
        //O tamanho do arquivo é de 10 megabytes
        //A velocidade de Mbps é de 100 megabits por segundo
        //1 megabit equivale a 125000 bytes, portanto tenho que multiplicar velLinkInt por 125000 pra saber quantos bytes por segundo são baixados
        //1 MB equivale a 1000000 de bytes
        //No caso de 12,5 bytes por segundo, em um minuto são 750bytes baixados, em uma hora 45,000

        System.out.println(tamArq);
        //System.out.println("Tamanho do arquvo em bytes: " + tamArqBytes);
        //System.out.println("Velocidade do link em bytes por minuto: " + tempAproximadoMinuto);
        //System.out.println("Tempo aproximado para o download: " + tempAproximadoTotal);
    }
}
