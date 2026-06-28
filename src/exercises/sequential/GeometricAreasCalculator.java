package exercises.sequential;

import java.util.Locale;
import java.util.Scanner;

/*
 * Calculadora de Áreas Geométricas
 * 
 * Descrição:
 * Programa que lê três valores de ponto flutuante (A, B e C) e calcula
 * a área do triângulo retângulo, círculo, trapézio, quadrado e retângulo
 * baseados nesses valores, exibindo os resultados com três casas decimais.
 */

public class GeometricAreasCalculator {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangulo = (a * c) / 2;
		circulo = 3.14159 * Math.pow(c, 2);
		trapezio = (a + b) * c / 2;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();

	}

}