/*
 * Validador de Senha
 *
 * Descrição:
 * Solicita a digitação de uma senha. O programa deve repetir a leitura
 * enquanto a senha for diferente de 2002. Quando a senha for correta,
 * imprime a mensagem "Acesso Permitido".
 */

package exercises.repetitive;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int password = input.nextInt();
        while (password != 2002) {
            System.out.println("Senha Invalida");
            password = input.nextInt();
        }

        System.out.println("Acesso Permitido");
        input.close();
    }
}
