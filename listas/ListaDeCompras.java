package listas;

import java.util.Scanner;

public class ListaDeCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[34m" + "=== Bem-vindo à sua Lista de Compras ===" + "\u001B[0m");

        while (true) {
            String[] listaDeCompras = new String[45]; // Vetor com 45 elementos
            int contadorItens = 0;

            while (contadorItens < listaDeCompras.length) {
                System.out.print("\u001B[32m" + "Digite o próximo item (ou 'acabei' para encerrar): " + "\u001B[0m");
                String item = scanner.nextLine();

                if (item.equalsIgnoreCase("acabei")) {
                    break;
                }

                listaDeCompras[contadorItens] = item;
                contadorItens++;
            }

            System.out.println("\n\u001B[33m" + "=== Sua Lista de Compras ===" + "\u001B[0m");
            for (int i = 0; i < contadorItens; i++) {
                System.out.println((i + 1) + ". " + listaDeCompras[i]);
            }

            if (contadorItens == listaDeCompras.length) {
                System.out.println("\u001B[31m" + "Você chegou ao limite máximo de itens." + "\u001B[0m");
            }

            System.out.print("\u001B[36m" + "Deseja fazer outra lista de compras? (s/n): " + "\u001B[0m");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                System.out.println("\u001B[35m" + "Boas compras!" + "\u001B[0m");
                break;
            }
        }

        scanner.close();
    }
}
