package data.moves;

import ru.ifmo.se.pokemon.*;

public class DragonRush extends PhysicalMove {
    public DragonRush() {
        super(Type.DRAGON, 100, 75);
    }

    @Override
    protected void applyOppEffects(Pokemon poke) {
        if (Math.random() < 0.2) {
            Effect.flinch(poke);
        }
    }

    @Override
    protected String describe() {
        return "использует атаку Dragon Rush";
    }
}

