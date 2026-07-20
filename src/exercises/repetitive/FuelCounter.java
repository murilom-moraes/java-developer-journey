/*
 * Contador de Preferência de Combustível
 *
 * Descrição:
 * Lê o tipo de combustível abastecido (1. Álcool, 2. Gasolina, 3. Diesel).
 * O programa encerra quando o código informado for 4. Exibe a quantidade
 * de clientes que abasteceram cada tipo de combustível.
 */

package exercises.repetitive;

import java.util.Scanner;

public class FuelCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gasolina = 0;
        int diesel = 0;
        int alcool = 0;

        int tipo = input.nextInt();

        while (tipo != 4) {
            switch (tipo) {
                case 1:
                    alcool++;
                    System.out.println("Alcool");
                    break;
                case 2:
                    gasolina++;
                    System.out.println("Gasolina");
                    break;
                case 3:
                    diesel++;
                    System.out.println("Diesel");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            tipo = input.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        input.close();
    }
}
