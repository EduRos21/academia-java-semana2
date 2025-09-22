package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BatallaPokemonTest {

    BatallaPokemon batallaPokemon;

    @Test
    @DisplayName("Pruebas en el metodo accion()")
    void pruebasMetodoAccion() {

        batallaPokemon = Entrenador.elegir(EquipoPokemon.PIKACHU);
        String res = batallaPokemon.accion();

        assertNotNull(res, "No puede ser null");
        assertEquals(res, "Pikachu ataco");

        assertThrows(NullPointerException.class, () -> {
            Entrenador.elegir(null);
        });
    }
    }

