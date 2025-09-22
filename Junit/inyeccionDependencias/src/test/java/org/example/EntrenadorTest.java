package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntrenadorTest {

    @Test
    @DisplayName("Prueba del metodo elegir case PIKACHU")
    void elegirPikachu(){
        BatallaPokemon batallaPokemon = Entrenador.elegir(EquipoPokemon.PIKACHU);
        assertNotNull(batallaPokemon, "Pikachu no tiene que ser null");
    }

    @Test
    @DisplayName("Tiene que retornar una instancia de Pikachu")
    void isPikachu(){
        BatallaPokemon batallaPokemon = Entrenador.elegir(EquipoPokemon.PIKACHU);
        assertEquals(Pikachu.class.getSimpleName(), batallaPokemon.getPoke().getClass().getSimpleName());
    }


    @Test
    @DisplayName("Prueba del metodo elegir case CHARIZARD")
    void elegirCharizard(){
        BatallaPokemon batallaPokemon = Entrenador.elegir(EquipoPokemon.CHARIZARD);
        assertNotNull(batallaPokemon, "Charizard no tiene que ser null");
    }

    @Test
    @DisplayName("Tiene que retornar una instancia de Charizard")
    void isCharizard(){
        BatallaPokemon batallaPokemon = Entrenador.elegir(EquipoPokemon.CHARIZARD);
        assertEquals(Charizard.class.getSimpleName(), batallaPokemon.getPoke().getClass().getSimpleName());
    }

    @Test
    @DisplayName("Prueba del metodo elegir case BLASTOISE")
    void elegirBlastoise(){
        BatallaPokemon batallaPokemon = Entrenador.elegir(EquipoPokemon.BLASTOISE);
        assertNotNull(batallaPokemon, "Blastoise no tiene que ser null");
    }

    @Test
    @DisplayName("Tiene que retornar una instancia de Blastoise")
    void isBlastoise(){
        BatallaPokemon batallaPokemon = Entrenador.elegir(EquipoPokemon.BLASTOISE);
        assertEquals(Blastoise.class.getSimpleName(), batallaPokemon.getPoke().getClass().getSimpleName());
    }

    @Test
    @DisplayName("Prueba del metodo elegir case VENUSAUR")
    void elegirVenusaur(){
        BatallaPokemon batallaPokemon = Entrenador.elegir(EquipoPokemon.VENUSAUR);
        assertNotNull(batallaPokemon, "Venusaur no tiene que ser null");
    }

    @Test
    @DisplayName("Tiene que retornar una instancia de Venusaur")
    void isVenusaur(){
        BatallaPokemon batallaPokemon = Entrenador.elegir(EquipoPokemon.VENUSAUR);
        assertEquals(Venusaur.class.getSimpleName(), batallaPokemon.getPoke().getClass().getSimpleName());
    }

    @Test
    @DisplayName("Prueba del metodo elegir case LAPRAS")
    void elegirLapras(){
        BatallaPokemon batallaPokemon = Entrenador.elegir(EquipoPokemon.LAPRAS);
        assertNotNull(batallaPokemon, "Pikachu no tiene que ser null");
    }

    @Test
    @DisplayName("Tiene que retornar una instancia de Lapras")
    void isLapras(){
        BatallaPokemon batallaPokemon = Entrenador.elegir(EquipoPokemon.LAPRAS);
        assertEquals(Lapras.class.getSimpleName(), batallaPokemon.getPoke().getClass().getSimpleName());
    }

    @Test
    @DisplayName("Prueba del metodo elegir case SNORLAX")
    void elegirSnorlax(){
        BatallaPokemon batallaPokemon = Entrenador.elegir(EquipoPokemon.SNORLAX);
        assertNotNull(batallaPokemon, "Snorlax no tiene que ser null");
    }

    @Test
    @DisplayName("Tiene que retornar una instancia de Snorlax")
    void isSnorlax(){
        BatallaPokemon batallaPokemon = Entrenador.elegir(EquipoPokemon.SNORLAX);
        assertEquals(Snorlax.class.getSimpleName(), batallaPokemon.getPoke().getClass().getSimpleName());
    }

    @Test
    void noPokemon() {
        assertThrows(NullPointerException.class, () -> {
            Entrenador.elegir(null);
        });

        assertDoesNotThrow(() -> {
            Entrenador.elegir(EquipoPokemon.PIKACHU);
        }, "No debe arrojar Exception con PIKACHU");
    }
}
