package exercises.sequential;

import java.util.Locale;
import java.util.Scanner;

/*
 * Calculadora de Salário de Funcionário
 * 
 * Descrição:
 * Programa que lê o número de um funcionário, suas horas trabalhadas
 * e o valor recebido por hora. Calcula o salário final e exibe
 * o número identificador e o salário com duas casas decimais.
 */

public class EmployeeSalaryCalculator {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int id, horas;
		double salario, valorPorHora;
		
		id = sc.nextInt();
		horas = sc.nextInt();
		valorPorHora = sc.nextDouble();
		
		salario = horas * valorPorHora;
		
		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
}