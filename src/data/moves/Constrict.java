package data.moves;

import ru.ifmo.se.pokemon.*;


public class Constrict extends PhysicalMove {
    public Constrict() {
        super(Type.NORMAL, 10, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon poke, double damage) {
        if (Math.random() < 0.1) {
            poke.setMod(Stat.SPEED, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует атаку Constrict";
    }
}

