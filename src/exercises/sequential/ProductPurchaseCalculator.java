/*
 * Calculadora de Compra de Produtos
 * 
 * Descrição:
 * Programa que lê o código de uma peça 1, a quantidade de peças 1,
 * o valor unitário de cada peça 1, o código de uma peça 2, a quantidade
 * de peças 2 e o valor unitário de cada peça 2. Calcula e exibe
 * o valor total a ser pago com duas casas decimais.
 */

package exercises.sequential;

import java.util.Locale;
import java.util.Scanner;

public class ProductPurchaseCalculator {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int quantidade1, quantidade2;
		double valor1, valor2, resultado;

		quantidade1 = sc.nextInt();
		valor1 = sc.nextDouble();

		quantidade2 = sc.nextInt();
		valor2 = sc.nextDouble();

		resultado = (quantidade1 * valor1) + (quantidade2 * valor2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", resultado);

		sc.close();

	}

}