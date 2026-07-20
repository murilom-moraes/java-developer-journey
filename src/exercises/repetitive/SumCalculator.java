/*
 * Calculadora de Soma Acumulada
 *
 * Descrição:
 * Lê uma quantidade indeterminada de números inteiros. O programa deve
 * calcular e exibir a soma desses valores. A leitura é interrompida
 * quando o usuário digita o número 0.
 */

package exercises.repetitive;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
        int numero = input.nextInt();

        while (numero != 0) {
            soma = soma + numero;
            numero = input.nextInt();
        }

        System.out.println(soma);
        input.close();
    }
}
