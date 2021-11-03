package data.moves;

import ru.ifmo.se.pokemon.*;

public class RockThrow extends PhysicalMove {
    public RockThrow() {
        super(Type.ROCK, 50, 90);
    }


    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) (damage / 4));
    }

    @Override
    protected String describe() {
        return "использует атаку Rock Throw";
    }
}
