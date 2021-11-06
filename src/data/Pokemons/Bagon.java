package data.Pokemons;


import data.moves.DoubleTeam;
import data.moves.Swagger;
import ru.ifmo.se.pokemon.*;

public class Bagon extends Pokemon {
    public Bagon(String name, int level) {
        super(name, level);
        setStats(45, 75, 60, 40, 30, 50);
        setType(Type.DRAGON);
        setMove(new Swagger(), new DoubleTeam());
    }
}