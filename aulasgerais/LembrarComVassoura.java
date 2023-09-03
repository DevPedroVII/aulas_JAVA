package br.com.aulasgerais;

import java.util.Scanner;

public class LembrarComVassoura {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			boolean viVassoura = false; // Inicialmente, você não viu a vassoura
			boolean lembrou = false; // Inicialmente, você não lembrou

			System.out.println("Você vê a vassoura? (sim/não)");
			String resposta = scanner.nextLine();

			if (resposta.equalsIgnoreCase("sim")) {
			    viVassoura = true;
			}

			while (!lembrou) {
			    if (viVassoura) {
			        System.out.println("Você se lembrou daquela situação!");
			        lembrou = true;
			    } else {
			        System.out.println("Você não consegue se lembrar, talvez se você ver a vassoura...");
			        System.out.println("Você vê a vassoura agora? (sim/não)");
			        resposta = scanner.nextLine();
			        if (resposta.equalsIgnoreCase("sim")) {
			            viVassoura = true;
			        }
			    }
			}
		}
        System.out.println("Fim do programa.");
    }
}

