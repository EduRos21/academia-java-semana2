package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Batalla Pokemon");

        BatallaPokemon bat;
        bat = Entrenador.elegir(EquipoPokemon.PIKACHU);
        System.out.println(bat.accion());

        System.out.println("Pikachu no puede continuar");

        bat = Entrenador.elegir(EquipoPokemon.SNORLAX);
        System.out.println(bat.accion());

        System.out.println("Snorlax ya no puede seguir");

        bat = Entrenador.elegir(EquipoPokemon.LAPRAS);
        System.out.println(bat.accion());

        System.out.println("Lapras no puede mas");

        bat = Entrenador.elegir(EquipoPokemon.VENUSAUR);
        System.out.println(bat.accion());

        System.out.println("Venosaur no puede continuar");

        bat = Entrenador.elegir(EquipoPokemon.BLASTOISE);
        System.out.println(bat.accion());

        System.out.println("Blastoise no puede mas");

        bat = Entrenador.elegir(EquipoPokemon.CHARIZARD);
        System.out.println(bat.accion());

        System.out.println("Charizard no puede continuar, pierdes la batalla");
    }
}