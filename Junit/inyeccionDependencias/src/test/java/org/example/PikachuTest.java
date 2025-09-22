package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PikachuTest {
    Pokemon pikachu;

    @BeforeEach
    void setupBeforeEach() {
        pikachu = new Pikachu();
    }

    @Test
    @DisplayName("Prueba del metodo atacar() de Pikachu")
    void pruebaMetodoAtacar() {
        String res = pikachu.atacar();
        assertEquals("ataco", res, "El metodo ataco() debe retornar 'ataco'");
    }

    @Test
    @DisplayName("Prueba de que Pikachu sea una instancia de la interfaz Pokemon")
    void pruebaInstanciaPokemon() {
        assertTrue(pikachu instanceof Pokemon, "Pikachu tiene que implementar Pokemon");
    }

    @Test
    @DisplayName("La instancia de Pikachu no tiene que ser null")
    void isPikachu() {
        assertNotNull(pikachu, "pikachu no tiene que ser null");
    }
}
