package org.example;

public class BatallaPokemon {
    private Pokemon poke;

    public BatallaPokemon(Pokemon poke) {
        this.poke = poke;
    }

    public String accion() {
        return poke.getClass().getSimpleName() + " " + poke.atacar();
    }

    public Pokemon getPoke() {
        return poke;
    }
}
