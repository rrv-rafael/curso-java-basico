package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioDois {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		
		System.out.println("O número informado foi " + numero);
	}

}
