package data.moves;

import ru.ifmo.se.pokemon.*;

public class DragonRush extends PhysicalMove {
    public DragonRush() {
        super(Type.DRAGON, 100, 75);
    }

    @Override
    protected void applyOppEffects(Pokemon poke) {
        poke.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "использует атаку Dragon Rush";
    }
}
