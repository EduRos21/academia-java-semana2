package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VenusaurTest {
    Pokemon venusaur;

    @BeforeEach
    void setupBeforeEach() {
        venusaur = new Venusaur();
    }

    @Test
    @DisplayName("Prueba del metodo atacar() de Venusaur")
    void pruebaMetodoAtacar() {
        String res = venusaur.atacar();
        assertEquals("ataco", res, "El metodo ataco() debe retornar 'ataco'");
    }

    @Test
    @DisplayName("Prueba de que Venusaur sea una instancia de la interfaz Pokemon")
    void pruebaInstanciaPokemon() {
        assertTrue(venusaur instanceof Pokemon, "Venusaur tiene que implementar Pokemon");
    }

    @Test
    @DisplayName("La instancia de Venusaur no tiene que ser null")
    void isCharizard() {
        assertNotNull(venusaur, "venusaur no tiene que ser null");
    }
}
