package Packmon;

import java.util.Random;
//Esta classe será responsável por gerar um time de Pokémon aleatório da segunda geração.

public class PokemonGeneratorV2 {
    private static final String[] POKEMON_NAMES = {
    		 "Chikorita", "Bayleef", "Meganium", "Cyndaquil", "Quilava", "Typhlosion", "Totodile", "Croconaw", "Feraligatr",
    		    "Sentret", "Furret", "Hoothoot", "Noctowl", "Ledyba", "Ledian", "Spinarak", "Ariados", "Crobat", "Chinchou",
    		    "Lanturn", "Pichu", "Cleffa", "Igglybuff", "Togepi", "Togetic", "Natu", "Xatu", "Mareep", "Flaaffy", "Ampharos",
    		    "Bellossom", "Marill", "Azumarill", "Sudowoodo", "Politoed", "Hoppip", "Skiploom", "Jumpluff", "Aipom", "Sunkern",
    		    "Sunflora", "Yanma", "Wooper", "Quagsire", "Espeon", "Umbreon", "Murkrow", "Slowking", "Misdreavous", "Unown",
    		    "Wobbuffet", "Girafarig", "Pineco", "Forretress", "Dunsparce", "Gligar", "Steelix", "Snubbull", "Granbull",
    		    "Qwilfish", "Scizor", "Shuckle", "Heracross", "Sneasel", "Teddiursa", "Ursaring", "Slugma", "Magcargo", "Swinub",
    		    "Piloswine", "Corsola", "Remoraid", "Octillery", "Delibird", "Mantine", "Skarmory", "Houndour", "Houndoom",
    		    "Kingdra", "Phanpy", "Donphan", "Porygon2", "Stantler", "Smeargle", "Tyrogue", "Hitmontop", "Smoochum", "Elekid",
    		    "Magby", "Miltank", "Blissey", "Raikou", "Entei", "Suicune", "Larvitar", "Pupitar", "Tyranitar", "Lugia", "Ho-Oh",
    		    "Celebi" // lista de todos os Pokémon da segunda geração (da Pokedex #152 ao #251)
    };

    public static Pokemon generateRandomPokemon() {
        Random random = new Random();
        int randomIndex = random.nextInt(POKEMON_NAMES.length);
        String randomName = POKEMON_NAMES[randomIndex];
        int randomLevel = random.nextInt(100) + 1; // Nível entre 1 e 100
        return new Pokemon(randomName, randomLevel);
    }
}
