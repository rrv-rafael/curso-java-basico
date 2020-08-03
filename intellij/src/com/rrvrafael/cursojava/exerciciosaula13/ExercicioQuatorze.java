package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioQuatorze {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tamArq, velLinkInt, tamArqMbps, tempAproximado,tempAproximadoTotal;

        System.out.println("Digite o tamanho do arquivo em MB: ");
        tamArq = scan.nextDouble();
        System.out.println("Digite a velocidade do link de internet (em Mbps): ");
        velLinkInt = scan.nextDouble();

        tamArqMbps = (tamArq * 8);
        tempAproximado = (tamArqMbps / velLinkInt);

        if (tempAproximado < 60)
        {
            System.out.println("Tempo aproximado para o download: " + tempAproximado + " segundos");
        }
        else
        {
            System.out.println("Tempo aproximado para o download: " + (tempAproximado / 60) + " minutos");
        }

        //1 megabit equivale a 125000 bytes

        //Exemplo de entradas:
        //O tamanho do arquivo é de 100 megabytes
        //A velocidade de Mbps é de 100 megabits por segundo
        //1 megabyte equivale a 8 megabits. 100 megabyte, são 100 megabyte * 8 megabit para saber quantos megabits são, que no caso são 800 megabits
        //Para saber o tempo de download, divido o tamanho do arquivo em megabit pela velocidade em megabit, ou seja, arquivo com 800mbps dividido por 100mbps
        //Então são 8 segundos para baixar este arquivo, caso seja um arquivo com mais de 59 segundos, então divido o tempo por 60 para saber o tempo em minutos
        //No caso, se fossem 120 segundos, dividindo por 60, saberia - se que demoram 2 minutos para fazer o download.
    }
}
