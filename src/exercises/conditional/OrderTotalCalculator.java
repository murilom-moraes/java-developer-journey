package exercises.conditional;

import java.util.Locale;
import java.util.Scanner;

/*
 * Calculadora de Total de Pedido
 * 
 * Descrição:
 * Com base em uma tabela de produtos, escreva um programa que leia o código 
 * de um item e a quantidade deste item. A seguir, calcule e mostre o valor 
 * da conta a pagar, formatado com duas casas decimais.
 */

public class OrderTotalCalculator {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double preco = 0.0;
		
		switch (codigo) {
			case 1:
				preco = 4.00;
				break;
			case 2:
				preco = 4.50;
				break;
			case 3:
				preco = 5.00;
				break;
			case 4:
				preco = 2.00;
				break;
			case 5:
				preco = 1.50;
				break;
			default:
				System.out.println("Código inválido");
				sc.close();
				return;	
		}
		
		double total = preco * quantidade;
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
