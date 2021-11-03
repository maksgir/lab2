package data;

import data.Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Lab2 {

    public static void main(String[] args) {
        Battle b = new Battle();

        Bagon p1 = new Bagon("Николай", 3);
        Beheeyem p2 = new Beheeyem("Валера", 2);
        Elgyem p3 = new Elgyem("Витёк", 2);
        Salamence p4 = new Salamence("Андрюша", 1);
        Shelgon p5 = new Shelgon("Женя", 1);
        Tropius p6 = new Tropius("Антон", 2);


        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();


    }
}
