package app;

public class App {
    public static void main(String[] args) {

        Pokedex pokedex = new Pokedex();

        Pokemon p1 = new Pokemon("Name1", 100, "Male");
        pokedex.addPokemon(p1);
        
        Pokemon p2 = new Pokemon("Name2", 200, "Female");
        pokedex.addPokemon(p2);
        
        Pokemon p3 = new Pokemon("Name3", 80, "Male");
        pokedex.addPokemon(p3);

        Pokemon p4 = new Pokemon("Name4", 50, "Female");
        pokedex.addPokemon(p4);

        System.out.println("Number of pokemons: " + Pokemon.getCount());

        pokedex.listPokemon();
        
        p1.attackPokemon(p2);
        p2.attackPokemon(p4);
        p3.attackPokemon(p1);
        
        pokedex.listPokemon();
        ;
    }
}