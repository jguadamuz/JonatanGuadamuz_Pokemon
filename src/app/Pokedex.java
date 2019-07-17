package app;

import java.util.ArrayList;

/**
 * Pokedex
 */
public class Pokedex extends AbstractPokemon {

    private ArrayList<Pokemon> myPokemons;

    public Pokedex() {
        myPokemons = new ArrayList<Pokemon>();
    }

    @Override
    public void listPokemon() {
        String output = "";
        for (Pokemon myP : myPokemons) {
            // output += myP.pokemon + "\n";
            output += this.pokemonInfo(myP) + "\n";
        }
        System.out.println(output);
    }

    public void addPokemon(Pokemon p) {
        this.myPokemons.add(p);
    }
}