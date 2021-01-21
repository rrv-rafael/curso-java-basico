package com.rrvrafael.cursojava.cit;

import java.util.ArrayList;

public class TombRaider {

    public static void main(String[] args) {

        //String variaveis[] = {"B", "C", "E", "F"};
        //String constantes[] = {"A", "D"};
        //String constantes = "AD";
        String variaveis = "B;C;E;F";
        String array[] = new String[4];

        array = variaveis.split(";");

        int i = 1, j = 1, countCombinacoes = 0, primeiroDigito, fatorial = 1, qtdLetras = 3, qtdVariaveis = 4, qtdCombinacoes = 0;
        int totalCombinacoes, tempoTotal, s;

        for (i = 1; i < qtdLetras; i++)
        {
            fatorial = qtdLetras * i;
        }

        qtdCombinacoes = fatorial * qtdVariaveis;

        //System.out.println(qtdCombinacoes);
        int teste = 0;

        //i = 1;
        //j = 1;

        for (int r = 0; r < 4; r++)
        {
            i = 1;
            j = 1;
            teste = 0;
            primeiroDigito = 6;
            while (teste < 5)
            {
                if (primeiroDigito == 6)
                {
                    if ((primeiroDigito + i + j) == 8)
                    {
                        System.out.println("A D" + " " + array[r] + " " + primeiroDigito + " " + i + " " + j);
                        primeiroDigito = 3;
                        countCombinacoes++;
                    }
                }
                if (primeiroDigito == 3)
                {
                    while (i < 5)
                    {
                        while (j < 5)
                        {
                            if (i + j == 5)
                            {
                                System.out.println("A D" + " " + array[r] + " " + primeiroDigito + " " + i + " " + j);
                                countCombinacoes++;
                            }
                            j++;
                        }
                        j = 1;
                        i++;
                    }
                }
                teste++;
            }
            teste = 0;
            i = 1;
            j = 1;
            primeiroDigito = 6;
            while (teste < 5)
            {
                if (primeiroDigito == 6)
                {
                    if ((primeiroDigito + i + j) == 8)
                    {
                        System.out.println("D A " + array[r] + " " + primeiroDigito + " " + i + " " + j);
                        primeiroDigito = 3;
                        countCombinacoes++;
                    }
                }
                if (primeiroDigito == 3)
                {
                    while (i < 5)
                    {
                        while (j < 5)
                        {
                            if (i + j == 5)
                            {
                                System.out.println("D A " + array[r] + " " + primeiroDigito + " " + i + " " + j);
                                countCombinacoes++;
                            }
                            j++;
                        }
                        j = 1;
                        i++;
                    }
                }
                teste++;
            }
            teste = 0;
            i = 1;
            j = 1;
            primeiroDigito = 6;
            while (teste < 5)
            {
                if (primeiroDigito == 6)
                {
                    if ((primeiroDigito + i + j) == 8)
                    {
                        System.out.println(array[r] + " A D " + primeiroDigito + " " + i + " " + j);
                        primeiroDigito = 3;
                        countCombinacoes++;
                    }
                }
                if (primeiroDigito == 3)
                {
                    while (i < 5)
                    {
                        while (j < 5)
                        {
                            if (i + j == 5)
                            {
                                System.out.println(array[r] + " A D " + primeiroDigito + " " + i + " " + j);
                                countCombinacoes++;
                            }
                            j++;
                        }
                        j = 1;
                        i++;
                    }
                }
                teste++;
            }
            teste = 0;
            i = 1;
            j = 1;
            primeiroDigito = 6;
            while (teste < 5)
            {
                if (primeiroDigito == 6)
                {
                    if ((primeiroDigito + i + j) == 8)
                    {
                        System.out.println(array[r] + " " + "D A " + primeiroDigito + " " + i + " " + j);
                        primeiroDigito = 3;
                        countCombinacoes++;
                    }
                }
                if (primeiroDigito == 3)
                {
                    while (i < 5)
                    {
                        while (j < 5)
                        {
                            if (i + j == 5)
                            {
                                System.out.println(array[r] + " " + "D A " + primeiroDigito + " " + i + " " + j);
                                countCombinacoes++;
                            }
                            j++;
                        }
                        j = 1;
                        i++;
                    }
                }
                teste++;
            }
            teste = 0;
            i = 1;
            j = 1;
            primeiroDigito = 6;
            while (teste < 5)
            {
                if (primeiroDigito == 6)
                {
                    if ((primeiroDigito + i + j) == 8)
                    {
                        System.out.println("A " + array[r] + " D " + primeiroDigito + " " + i + " " + j);
                        primeiroDigito = 3;
                        countCombinacoes++;
                    }
                }
                if (primeiroDigito == 3)
                {
                    while (i < 5)
                    {
                        while (j < 5)
                        {
                            if (i + j == 5)
                            {
                                System.out.println("A " + array[r] + " D " + primeiroDigito + " " + i + " " + j);
                                countCombinacoes++;
                            }
                            j++;
                        }
                        j = 1;
                        i++;
                    }
                }
                teste++;
            }
            teste = 0;
            i = 1;
            j = 1;
            primeiroDigito = 6;
            while (teste < 5)
            {
                if (primeiroDigito == 6)
                {
                    if ((primeiroDigito + i + j) == 8)
                    {
                        System.out.println("D " + array[r] + " A " + primeiroDigito + " " + i + " " + j);
                        primeiroDigito = 3;
                        countCombinacoes++;
                    }
                }
                if (primeiroDigito == 3)
                {
                    while (i < 5)
                    {
                        while (j < 5)
                        {
                            if (i + j == 5)
                            {
                                System.out.println("D " + array[r] + " A " + primeiroDigito + " " + i + " " + j);
                                countCombinacoes++;
                            }
                            j++;
                        }
                        j = 1;
                        i++;
                    }
                }
                teste++;
            }
            //System.out.println("AD" + array[r]); foi
            //System.out.println("DA" + array[r]);
            //System.out.println(array[r] + "AD"); foi
            //System.out.println(array[r] + "DA"); foi
            //System.out.println("A" + array[r] + "D"); foi
            //System.out.println("D" + array[r] + "A"); foi
        }


        /*int i = 1, j = 1, countCombinacoes = 0, primeiroDigito = 6, fatorial = 1, qtdLetras = 3, qtdVariaveis = 4, qtdCombinacoes = 0;
        int totalCombinacoes, tempoTotal;

        for (i = 1; i < qtdLetras; i++)
        {
            fatorial = qtdLetras * i;
        }

        qtdCombinacoes = fatorial * qtdVariaveis;

        //System.out.println(qtdCombinacoes);

        i = 1;

        if (primeiroDigito == 6)
        {
            if ((primeiroDigito + i + j) == 8)
            {
                System.out.println(primeiroDigito + "-" + i + "-" + j);
                primeiroDigito = 3;
                countCombinacoes++;
            }
        }
        if (primeiroDigito == 3)
        {
            while (i < 5)
            {
                while (j < 5)
                {
                    if (i + j == 5)
                    {
                        System.out.println(primeiroDigito + "-" + i + "-" + j);
                        countCombinacoes++;
                    }
                    j++;
                }
                j = 1;
                i++;
            }
        }*/

        System.out.println(countCombinacoes);

        /*totalCombinacoes = qtdCombinacoes * countCombinacoes;
        tempoTotal = (totalCombinacoes * 2) / 60;

        System.out.println("Quantidade total de combinações: " + totalCombinacoes);
        System.out.println("Tempo total para testar todas as combinações: " + tempoTotal + " minutos");*/
    }
}
