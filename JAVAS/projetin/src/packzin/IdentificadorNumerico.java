package packzin;

import java.util.Scanner;

public class IdentificadorNumerico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor numérico: ");
        String input = scanner.nextLine();

        try {
            double valor = Double.parseDouble(input);

            // Verifica se é par ou ímpar
            if (valor % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }

            // Verifica se é inteiro ou decimal
            if (valor == (int) valor) {
                System.out.println("O número é inteiro.");
            } else {
                System.out.println("O número é decimal.");
            }

            // Verifica se é positivo ou negativo
            if (valor > 0) {
                System.out.println("O número é positivo.");
            } else if (valor < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero.");
            }

            // Verifica se é real ou fracionário
            if (valor == Math.floor(valor)) {
                System.out.println("O número é fracionário.");
            } else {
                System.out.println("O número é real.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar um valor numérico.");
        }

        scanner.close();
    }
}