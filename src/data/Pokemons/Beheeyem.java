package data.Pokemons;


import data.moves.*;
import ru.ifmo.se.pokemon.*;

public class Beheeyem extends Pokemon {
    public Beheeyem(String name, int level) {
        super(name, level);
        setStats(75, 75, 75, 125, 95, 40);
        setType(Type.PSYCHIC);
        setMove(new BrutalSwing(), new Rest(), new Bulldoze(), new PoisonJab());
    }
}