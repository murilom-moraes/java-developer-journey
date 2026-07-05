package exercises.conditional;

import java.util.Scanner;

/*
 * Verificador de Números Múltiplos
 * 
 * Descrição:
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma 
 * mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os 
 * valores lidos são múltiplos entre si. Os números devem poder ser 
 * digitados em ordem crescente ou decrescente.
 */

public class MultiplesChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a == 0 || b == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println(((a % b == 0) || (b % a == 0)) ? "Sao Multiplos" : "Nao sao Multiplos");
		}

		sc.close();
		
	}

}