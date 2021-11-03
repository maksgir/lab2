package data.Pokemons;

import data.moves.*;
import ru.ifmo.se.pokemon.*;

public class Tropius extends Pokemon {
    public Tropius(String name, int level) {
        super(name, level);
        setStats(99, 68, 83, 72, 87, 51);
        setType(Type.GRASS, Type.FLYING);
        setMove(new RockThrow(), new SweetScent(), new Constrict(), new RockBlast());
    }

}