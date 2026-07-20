/*
 * Contador de Intervalo
 *
 * Descrição:
 * Leia um valor inteiro N. Este valor será a quantidade de valores
 * inteiros X que serão lidos em seguida. Mostre quantos destes
 * valores X estão dentro do intervalo [10,20] e quantos estão fora
 * do intervalo, mostrando essas informações conforme exemplo (use
 * a palavra "in" para dentro do intervalo, e "out" para fora do
 * intervalo).
 */

package exercises.repetitive;

import java.util.Scanner;

public class IntervalCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int inCount = 0;
        int outCount = 0;

        for (int i = 0; i < N; i++) {
            int X = input.nextInt();
            if (X >= 10 && X <= 20) {
                inCount++;
            } else {
                outCount++;
            }
        }

        System.out.println(inCount + " in");
        System.out.println(outCount + " out");

        input.close();
    }
}
