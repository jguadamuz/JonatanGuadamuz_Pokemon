package app;

public abstract class AbstractPokemon implements PokemonInterface {

    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        return new Pokemon(name, health, type);
    }

    @Override
    public String pokemonInfo(Pokemon pokemon) {
        return "Pokemon " + pokemon.getName() +
               " type(" + pokemon.getType() + 
               ") with " + pokemon.getHealth() + 
               " of health";
    }
}