package data.moves;

import ru.ifmo.se.pokemon.*;


public class Constrict extends PhysicalMove {
    public Constrict() {
        super(Type.NORMAL, 10, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) (damage / 4));
    }

    @Override
    protected String describe() {
        return "использует атаку Constrict";
    }
}
