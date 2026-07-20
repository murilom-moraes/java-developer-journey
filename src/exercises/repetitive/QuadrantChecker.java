/*
 * Verificador de Quadrante
 *
 * Descrição:
 * Lê as coordenadas (X, Y) de pontos em um sistema cartesiano.
 * Para cada ponto, determina e exibe o quadrante correspondente.
 * O programa é encerrado quando uma das coordenadas for nula (zero).
 */

package exercises.repetitive;

import java.util.Scanner;

public class QuadrantChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
            x = input.nextInt();
            y = input.nextInt();
        }

        input.close();
    }
}
