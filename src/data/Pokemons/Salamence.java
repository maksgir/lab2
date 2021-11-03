package data.Pokemons;

import data.moves.*;
import ru.ifmo.se.pokemon.*;

public class Salamence extends Pokemon {
    public Salamence(String name, int level) {
        super(name, level);
        setStats(95, 135, 80, 110, 80, 100);
        setType(Type.DRAGON, Type.FLYING);
        setMove(new Swagger(), new DoubleTeam(), new DragonRush(), new Blizzard());
    }
}