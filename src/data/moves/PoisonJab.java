package data.moves;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {
    public PoisonJab() {
        super(Type.POISON, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon poke) {
        if (Math.random() < 0.3) {
            Effect.poison(poke);
        }
    }

    @Override
    protected String describe() {
        return "использует атаку Poison Jab";
    }
}
