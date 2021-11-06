package data.Pokemons;

import data.moves.DoubleTeam;
import data.moves.DragonRush;
import data.moves.Swagger;
import ru.ifmo.se.pokemon.*;

public class Shelgon extends Pokemon {
    public Shelgon(String name, int level) {
        super(name, level);
        setStats(65, 95, 100, 60, 50, 50);
        setType(Type.DRAGON);
        setMove(new Swagger(), new DoubleTeam(), new DragonRush());
    }
}