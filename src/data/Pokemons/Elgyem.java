package data.Pokemons;


import data.moves.BrutalSwing;
import data.moves.Bulldoze;
import data.moves.Rest;
import ru.ifmo.se.pokemon.*;

public class Elgyem extends Pokemon {
    public Elgyem(String name, int level) {
        super(name, level);
        setStats(55, 55, 55, 85, 55, 30);
        setType(Type.PSYCHIC);
        setMove(new BrutalSwing(), new Rest(), new Bulldoze());
    }
}
