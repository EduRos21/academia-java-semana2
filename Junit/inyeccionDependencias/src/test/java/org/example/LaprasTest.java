package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LaprasTest {
    Pokemon lapras;

    @BeforeEach
    void setupBeforeEach() {
        lapras = new Lapras();
    }

    @Test
    @DisplayName("Prueba del metodo atacar() de Lapras")
    void pruebaMetodoAtacar() {
        String res = lapras.atacar();
        assertEquals("ataco", res, "El metodo ataco() debe retornar 'ataco'");
    }

    @Test
    @DisplayName("Prueba de que Lapras sea una instancia de la interfaz Pokemon")
    void pruebaInstanciaPokemon() {
        assertTrue(lapras instanceof Pokemon, "Lapras tiene que implementar Pokemon");
    }

    @Test
    @DisplayName("La instancia de Lapras no tiene que ser null")
    void isLapras() {
        assertNotNull(lapras, "lapras no tiene que ser null");
    }
}
