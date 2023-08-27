package Packmon;
//Esta classe representará um Pokémon no time. Cada Pokémon terá um nome e um nível.
public class Pokemon {
    private String name;
    private int level;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
