package com.rrvrafael.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioSeis {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		double raioCirculo, areaCirculo;
		
		System.out.println("Digite o raio do circulo: ");
		raioCirculo = scan.nextDouble();
		
		areaCirculo = 3.14 * (raioCirculo * raioCirculo);
		
		System.out.println("Área do circulo " + areaCirculo);
	}

}
