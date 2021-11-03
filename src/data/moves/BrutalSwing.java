package data.moves;

import ru.ifmo.se.pokemon.*;

public class BrutalSwing extends PhysicalMove {
    public BrutalSwing() {
        super(Type.DARK, 60, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) (damage / 4));
    }

    @Override
    protected String describe() {
        return "использует атаку Brutal Swing";
    }
}
