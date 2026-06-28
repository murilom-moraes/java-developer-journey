package exercises.sequential;

import java.util.Locale;
import java.util.Scanner;

/*
 * Calculadora de Área de Círculo
 * 
 * Descrição:
 * Programa que lê o valor do raio de um círculo e calcula 
 * sua área utilizando pi = 3.14159, com saída formatada 
 * para quatro casas decimais.
 */

public class CircleAreaCalculator {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi;
		
		raio = sc.nextDouble();
		
		pi = 3.14159;
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
		
	}

}