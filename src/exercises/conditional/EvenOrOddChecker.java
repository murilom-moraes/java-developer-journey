package exercises.conditional;

import java.util.Scanner;

/*
 * Verificador de Par ou Ímpar
 * 
 * Descrição:
 * Fazer um programa para ler um número inteiro e dizer 
 * se este número é par ou ímpar.
 */

public class EvenOrOddChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		System.out.println((numero % 2 == 0) ? "PAR" : "IMPAR");

		sc.close();
		
	}

}