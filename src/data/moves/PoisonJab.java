package data.moves;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {
    public PoisonJab() {
        super(Type.POISON, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon poke) {
        poke.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "использует атаку Poison Jab";
    }
}
