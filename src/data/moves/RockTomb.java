package data.moves;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb() {
        super(Type.ROCK, 60, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon enemy) {
        enemy.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "использует атаку Rock Tomb";
    }

}

