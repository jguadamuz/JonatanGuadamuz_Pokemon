package app;

/**
 * Pokemon
 */
public class Pokemon {

    private String name;
    private int health;
    private String type;

    private static int count = 0;

    public void attackPokemon(Pokemon pokemon) {
        this.setHealth(this.getHealth() - 10);
    }

    public static int getCount() {
        return count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon(String name, int health, String type) {
        this.health = health;
        this.name = name;
        this.type = type;
        count++;
    }
}