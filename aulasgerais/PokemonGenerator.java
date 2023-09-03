package br.com.aulasgerais;

import java.util.Random;

public class PokemonGenerator {
    public static void main(String[] args) {
        String[] pokemonList = {
            "Bulbasaur", "Charmander", "Squirtle", "Pikachu", "Eevee","Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard",
            "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree",
            "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", "Rattata",
            "Raticate", "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu", "Raichu",
            "Sandshrew", "Sandslash", "Nidoran♀", "Nidorina", "Nidoqueen", "Nidoran♂",
            "Nidorino", "Nidoking", "Clefairy", "Clefable", "Vulpix", "Ninetales",
            "Jigglypuff", "Wigglytuff", "Zubat", "Golbat", "Oddish", "Gloom", "Vileplume",
            "Paras", "Parasect", "Venonat", "Venomoth", "Diglett", "Dugtrio", "Meowth",
            "Persian", "Psyduck", "Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine",
            "Poliwag", "Poliwhirl", "Poliwrath", "Abra", "Kadabra", "Alakazam", "Machop",
            "Machoke", "Machamp", "Bellsprout", "Weepinbell", "Victreebel", "Tentacool",
            "Tentacruel", "Geodude", "Graveler", "Golem", "Ponyta", "Rapidash", "Slowpoke",
            "Slowbro", "Magnemite", "Magneton", "Farfetch'd", "Doduo", "Dodrio",
            "Seel", "Dewgong", "Grimer", "Muk", "Shellder", "Cloyster", "Gastly",
            "Haunter", "Gengar", "Onix", "Drowzee", "Hypno", "Krabby", "Kingler",
            "Voltorb", "Electrode", "Exeggcute", "Exeggutor", "Cubone", "Marowak",
            "Hitmonlee", "Hitmonchan", "Lickitung", "Koffing", "Weezing", "Rhyhorn",
            "Rhydon", "Chansey", "Tangela", "Kangaskhan", "Horsea", "Seadra", "Goldeen",
            "Seaking"
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
