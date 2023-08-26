package packzin;

import java.util.Random;

public class PokemonGenerator {
    public static void main(String[] args) {
        String[] pokemonList = {
            "Bulbasaur", "Charmander", "Squirtle", "Pikachu", "Eevee",
            // ... adicione mais 95 Pokémon aqui
        };

        int numberOfPokemon = 100;
        Random random = new Random();

        System.out.println("Pokémon gerados:");

        for (int i = 0; i < numberOfPokemon; i++) {
            int randomIndex = random.nextInt(pokemonList.length);
            String randomPokemon = pokemonList[randomIndex];
            System.out.println((i + 1) + ". " + randomPokemon);
        }
    }
}
