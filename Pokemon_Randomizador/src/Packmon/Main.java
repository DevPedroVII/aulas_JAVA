package Packmon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Randomizador de Time de Pokémon!");

        while (true) {
            System.out.print("Quantos Pokémon você deseja no time (ou digite 0 para sair)? ");
            int numPokemon = scanner.nextInt();

            if (numPokemon == 0) {
                System.out.println("Saindo do aplicativo. Até mais!");
                break;
            }

            System.out.println("Seu time de Pokémon aleatório:");

            for (int i = 0; i < numPokemon; i++) {
                Pokemon randomPokemon = PokemonGeneratorV2.generateRandomPokemon();
                System.out.println("Nome: " + randomPokemon.getName() + " | Nível: " + randomPokemon.getLevel());
            }
            
            System.out.println(); // Espaçamento entre diferentes times
        }

        scanner.close();
    }
}
