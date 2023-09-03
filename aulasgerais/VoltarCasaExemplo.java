package br.com.aulasgerais;

import java.util.Scanner;

public class VoltarCasaExemplo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			boolean fuiNaPrimeiraVez = false;

			System.out.println("Ela te chamou para ir à casa dela. Você vai? (sim/não)");
			String resposta = scanner.nextLine();

			if (resposta.equalsIgnoreCase("sim")) {
			    fuiNaPrimeiraVez = true;
			    System.out.println("Você foi à casa dela pela primeira vez.");
			} else {
			    System.out.println("Você não foi à casa dela.");
			}

			if (fuiNaPrimeiraVez) {
			    boolean gostouDaVisita = false;
			    do {
			        System.out.println("Agora você está na casa dela. Foi bom? (sim/não)");
			        resposta = scanner.nextLine();
			        if (resposta.equalsIgnoreCase("sim")) {
			            gostouDaVisita = true;
			            System.out.println("Você gostou da visita e decidiu voltar.");
			        } else if (resposta.equalsIgnoreCase("não")) {
			            System.out.println("A visita não foi boa, e você decidiu não voltar.");
			        } else {
			            System.out.println("Resposta inválida. Responda 'sim' ou 'não'.");
			        }
			    } while (!gostouDaVisita && !resposta.equalsIgnoreCase("não"));
			}
		}
        System.out.println("Fim do programa.");
    }
}


//dia 13/04