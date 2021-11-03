package data.moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove
{
    public DoubleTeam() {super(Type.NORMAL, 0, 100);}
    @Override
    protected void applySelfEffects(Pokemon poke)
    {
        poke.setMod(Stat.EVASION, 1);
    }
    @Override
    protected String describe() {return "использует атаку Double Team";}
}