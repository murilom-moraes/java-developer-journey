package exercises.conditional;

import java.util.Scanner;

/*
 * Verificador de Número Negativo
 * 
 * Descrição:
 * Fazer um programa para ler um número inteiro, e depois dizer 
 * se este número é negativo ou não.
 */

public class NegativeNumberChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		System.out.println((numero < 0) ? "NEGATIVO" : "NAO NEGATIVO");
		
		sc.close();

	}

}