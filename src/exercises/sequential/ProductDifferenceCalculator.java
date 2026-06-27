package exercises.sequential;

import java.util.Scanner;

/*
 * Calculadora de Diferença de Produtos
 * 
 * Descrição:
 * Programa que lê quatro valores inteiros (A, B, C e D),
 * calcula a diferença do produto de A e B pelo produto
 * de C e D, e exibe o resultado na tela.
 */

public class ProductDifferenceCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, resultado;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		resultado = (a * b - c * d);
		
		System.out.println("DIFERENCA = " + resultado);
		
		sc.close();
	}
}