package br.com.aulasgerais;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Pokemon {
    private String nome;

    public Pokemon(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class GeradorTimesPokemon {
    private static final List<Pokemon> todosPokemons = new ArrayList<>();

    static {
        todosPokemons.add(new Pokemon("Pikachu"));
        todosPokemons.add(new Pokemon("Charmander"));
        todosPokemons.add(new Pokemon("Squirtle"));
        todosPokemons.add(new Pokemon("Bulbasaur"));
        todosPokemons.add(new Pokemon("Jigglypuff"));
        todosPokemons.add(new Pokemon("Eevee"));
        // Adicione mais Pokémon à lista
    }

    public static List<Pokemon> gerarTimePokemon(int tamanho) {
        List<Pokemon> time = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            int randomIndex = random.nextInt(todosPokemons.size());
            time.add(todosPokemons.get(randomIndex));
        }

        return time;
    }

    public static void main(String[] args) {
        List<Pokemon> timePokemon = gerarTimePokemon(6);

        System.out.println("Seu time de Pokémon:");
        for (Pokemon pokemon : timePokemon) {
            System.out.println(pokemon.getNome());
        }
    }
}
