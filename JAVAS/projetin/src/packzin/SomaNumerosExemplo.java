package packzin;

import java.util.Scanner;

public class SomaNumerosExemplo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite um número inteiro positivo 'n': ");
			int n = scanner.nextInt();

			int somaInt = 0;
			long somaLong = 0L;

			// Usando int para soma
			for (int i = 1; i <= n; i++) {
			    somaInt += i;
			}

			// Usando long para soma
			for (int i = 1; i <= n; i++) {
			    somaLong += i;
			}

			System.out.println("A soma dos primeiros " + n + " números inteiros usando int é: " + somaInt);
			System.out.println("A soma dos primeiros " + n + " números inteiros usando long é: " + somaLong);
		}
    }
}
