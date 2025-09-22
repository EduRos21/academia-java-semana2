package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SnorlaxTest {
    Pokemon snorlax;

    @BeforeEach
    void setupBeforeEach() {
        snorlax = new Snorlax();
    }

    @Test
    @DisplayName("Prueba del metodo atacar() de Snorlax")
    void pruebaMetodoAtacar() {
        String res = snorlax.atacar();
        assertEquals("ataco", res, "El método atacar() debe devolver 'ataco'");
    }

    @Test
    @DisplayName("Prueba de que Snorlax sea una instancia de la interfaz Pokemon")
    void pruebaInstanciaPokemon() {
        assertTrue(snorlax instanceof Pokemon, "Blastoise tiene que implementar Pokemon");
    }

    @Test
    @DisplayName("La instancia de Snorlax no tiene que ser null")
    void isSnorlax() {
        assertNotNull(snorlax, "snorlax no tiene que ser null");
    }
}
