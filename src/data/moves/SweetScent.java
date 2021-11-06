package data.moves;


import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove {
    public SweetScent() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon poke) {
        poke.setMod(Stat.EVASION, -1);
    }

    @Override
    protected String describe() {
        return "использует Sweet Scent";
    }

}

